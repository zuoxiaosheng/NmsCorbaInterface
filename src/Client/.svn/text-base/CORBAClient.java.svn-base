package Client; 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.omg.CORBA.ORB;
import org.omg.CORBA.StringHolder;
import org.omg.CORBA.SystemException;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextHelper;
import org.omg.CosNaming.NamingContextPackage.NotFound;

import subnetworkConnection.CCIterator_IHolder;
import subnetworkConnection.CrossConnectList_THolder;
import subnetworkConnection.CrossConnect_T;
import subnetworkConnection.GradesOfImpact_T;
import subnetworkConnection.ProtectionEffort_T;
import subnetworkConnection.SNCCreateData_T;
import subnetworkConnection.SNCModifyData_T;
import subnetworkConnection.SNCType_T;
import subnetworkConnection.SubnetworkConnection_THolder;
import subnetworkConnection.TPDataList_THolder;
import topologicalLink.TopologicalLinkList_THelper;
import topologicalLink.TopologicalLinkList_THolder;
import topologicalLink.TopologicalLink_T;

import common.Common_I;
import common.Common_IHolder;
import dao.CrossConnect;
import dao.HopToXC;
import dao.Link;
import dao.XCEnd;
import dao.XCHop;
import emsMgr.EMSMgr_I;
import emsMgr.EMSMgr_IHelper;
import emsSession.EmsSession_I;
import emsSession.EmsSession_IHolder;
import emsSession.EmsSession_IPackage.managerNames_THolder;
import emsSessionFactory.EmsSessionFactory_I;
import emsSessionFactory.EmsSessionFactory_IHelper;
import equipment.EquipmentInventoryMgr_I;
import equipment.EquipmentInventoryMgr_IHelper;
import equipment.EquipmentOrHolderList_THolder;
import globaldefs.ConnectionDirection_T;
import globaldefs.NameAndStringValue_T;
import globaldefs.ProcessingFailureException;
import managedElement.ManagedElementList_THolder;
import managedElementManager.MEConfigData_THolder;
import managedElementManager.ManagedElementMgr_I;
import managedElementManager.ManagedElementMgr_IHelper;   
import multiLayerSubnetwork.MultiLayerSubnetworkMgr_I;
import multiLayerSubnetwork.MultiLayerSubnetworkMgr_IHelper;
import nmsSession._NmsSession_IStub;
import subnetworkConnection.GradesOfImpact_T;

//通过CORBA接口与网管通信，实现获取拓扑信息、配置交叉连接、获取网元信息等功能
public class CORBAClient
{   
	static ORB orb;
	static EMSMgr_I emsMgr = null;
	static EmsSession_I emsSession=null;
	static ManagedElementMgr_I meMgr = null;
	static EquipmentInventoryMgr_I eiMgr = null;
	static MultiLayerSubnetworkMgr_I mlsMgr = null;

	//初始化
	public static EmsSession_I initial()  
	{  	
	  //建立连接登录、建立消息通道 
	  try { 
		   String[] args = new String[2];
		   args[0] = "-ORBInitRef";
		   args[1] = "NameService=corbaloc::" + "202.120.3.118" + ":" + "8001" + "/NameService";
		   for (int i = 0; i < args.length; i++) { 
		   System.out.println("初始化ORB对象的启动参数为： arg[" + i + "] = " + args[i]);
		   } 
		   orb = org.omg.CORBA.ORB.init(args, null); 
		   System.out.println("成功初始化ORB对象!－－－－Initialize Orb"); 
	  }  
	  catch (SystemException ex) {  
		   System.out.println("初始化ORB对象异常！"); 
		   System.out.println(ex.getMessage()); 
	  }  
	  if (orb == null) {  
		   System.out.println("orb == null"); 
	  } 
	
	  // 获取名字服务引用 
	  NamingContext nsRootContext = null; 
	  try { 	
		   org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
		   nsRootContext = NamingContextHelper.narrow(objRef);
		   System.out.println("成功获取取名字服务!－－－－Get Nameservice reference");
	  } 
	  catch (org.omg.CORBA.ORBPackage.InvalidName ex) { 
		   System.out.println("获取名字服务索引异常!");
		   System.out.println(ex.getMessage());
	  } 
	
	  // 获取EMSSessionFactory引用
	  NameComponent[] name = new NameComponent[1]; 
	  name[0] = new NameComponent("ZTE/T3", "EMSFactory"); 
	  System.out.println("NameComponent: '" + "ZTE/T3 "+ "','EMSFactory'"); 
	  org.omg.CORBA.Object obj = null; 
	  try { 
		   obj = nsRootContext.resolve(name);
		   System.out.println("成功获取EMSSessionFactory!   Get Reference to EMSSessionFactory");
	  } 
	  catch (NotFound ex) { 
		   System.out.println("获取EMSSessionFactory!---NotFound---");
		   System.out.println(ex.getMessage());
	  } 
	  catch (org.omg.CosNaming.NamingContextPackage.InvalidName ex) { 
		   System.out.println("获取EMSSessionFactory异常!---InvalidName---");
		   System.out.println(ex.getMessage());
	  } 
	  catch (org.omg.CosNaming.NamingContextPackage.CannotProceed ex) { 
		   System.out.println("获取EMSSessionFactory异常!---CannotProceed---");
		   System.out.println(ex.getMessage());
	  } 
	
	  //开始准备登陆并且获取EmsSession! 
	  EmsSessionFactory_I m_emsFactory = EmsSessionFactory_IHelper.narrow(obj); 
	  _NmsSession_IStub csession = new nmsSession._NmsSession_IStub(); 
	  EmsSession_IHolder sessionHolder = new EmsSession_IHolder(); 
	  try { 
		   System.out.println("获取EmsSession引用对象");
		   m_emsFactory.getEmsSession("admin","", csession, sessionHolder);
		   System.out.println("NMSsession ---" + csession.toString());
	  } 
	  catch (globaldefs.ProcessingFailureException ex) {  
		   System.out.println("获取EmsSession引用对象，异常！---ProcessingFailureException---"); 
		   System.out.println("可能是用户名或者密码错误，或者权限不够，或者已登陆的用户还未退出！"); 
		   System.out.println(ex.toString()); 
	  }  
	  emsSession = sessionHolder.value;  
	  System.out.println("EMSsession ---" + emsSession.toString());  
	  
	  //获得所支持的管理器  
	  try {  
		   managerNames_THolder mgrHolder = new managerNames_THolder(); 
		   emsSession.getSupportedManagers(mgrHolder); 
		   String[] manages = mgrHolder.value; 
		   for (int i = 0; i < manages.length; i++) { 
		   System.out.println("管理器--Manager " + i + "  " + manages[i]);
		   } 
	  } 
	  catch (ProcessingFailureException pfe) { 
		   System.out.println("获得所支持的管理器,异常！---ProcessingFailureException---");
		   System.out.println(pfe.toString());
	  } 
	  emsSession.ping(); 
	  return emsSession;
	}

	//查询网元信息（ManagedElement 管理器） 
	public static void getAllMEInfo() {		    
	  try { 
		   System.out.println("初始化 ManagedElement 管理器!");
		   Common_IHolder mgrHolder = new Common_IHolder();
		   emsSession.getManager("ManagedElement", mgrHolder);
		   meMgr = ManagedElementMgr_IHelper.narrow(mgrHolder.value);
		   ManagedElementList_THolder meList=new ManagedElementList_THolder();
		   meMgr.getAllManagedElements(meList);
		   managedElement.ManagedElement_T[] meInfos = meList.value;
		   System.out.println
		   ("ME	meName	userLabel	location	hardwareVersion	softwareVersion	productName	meType	" +
		   		"communicationState	nativeEMSName	connectionRates	vendorName	operationalStatus	" +
		   		"netAddress	alarmStatus	descriptionInfo	additionalInfo");
		   for (int i = 0; i < meInfos.length; i++) { 
			   System.out.println
			   ("网元--ME " + i + "	" + meInfos[i].name[0].name + "{" + meInfos[i].name[0].value + "}" +
					   					 meInfos[i].name[1].name + "{" + meInfos[i].name[1].value + "}"
					   			+ "	" + meInfos[i].userLabel
			    				+ "	" + meInfos[i].location
			    				+ "	" + meInfos[i].hardwareVersion
			    				+ "	" + meInfos[i].softwareVersion
			    				+ "	" + meInfos[i].productName
			    				+ "	" + meInfos[i].meType
			    				+ "	" + meInfos[i].communicationState.toString()
			    				+ "	" + meInfos[i].nativeEMSName
			    				+ "	" + meInfos[i].connectionRates[0]
			    				+ "	" + meInfos[i].vendorName
			    				+ "	" + meInfos[i].operationalStatus
			    				+ "	" + "ip=" +
						   				 meInfos[i].netAddress.ipAddr.a + "." +
									   	 meInfos[i].netAddress.ipAddr.b + "." +
									   	 meInfos[i].netAddress.ipAddr.c + "." +
									   	 meInfos[i].netAddress.ipAddr.d + "/port=" +
									   	 meInfos[i].netAddress.port
			    				+ "	" + meInfos[i].alarmStatus.toString()
			    				+ "	" + meInfos[i].descriptionInfo
			    				+ "	" + meInfos[i].additionalInfo[0].name + meInfos[i].additionalInfo[0].value);
		   } 
	  } 
	  catch (ProcessingFailureException pfe) { 
		   System.out.println(
		   "初始化 ManagedElement 管理器异常!---ProcessingFailureException---");
		   System.out.println(pfe.toString());
	  } 
	}
	
	// 查询机架/子架配置信息（ EquipmentInventory 管理器） 
	public static void getAllEQInfo() {	  
	  try { 
//		   System.out.println("初始化 ManagedElement 管理器!");
//		   Common_IHolder mgrHolder = new Common_IHolder();
//		   emsSession.getManager("ManagedElement", mgrHolder);
//		   meMgr = ManagedElementMgr_IHelper.narrow(mgrHolder.value);
//		   ManagedElementList_THolder meList=new ManagedElementList_THolder();
//		   meMgr.getAllManagedElements(meList);
//		   managedElement.ManagedElement_T[] meInfos = meList.value;
		   
		  System.out.println("初始化 EquipmentInventory 管理器!"); 
		  Common_IHolder mgrHolder2 = new Common_IHolder(); 
		  emsSession.getManager("EquipmentInventory", mgrHolder2); 
		  eiMgr = EquipmentInventoryMgr_IHelper.narrow(mgrHolder2.value); 
//		  globaldefs.NameAndStringValue_T[] meName = meInfos[2].name;
		  NameAndStringValue_T[] meName = new NameAndStringValue_T[2];
		  meName[0] = new NameAndStringValue_T("EMS","ZTE/1");
		  meName[1] = new NameAndStringValue_T("ManagedElement","1(P)");
		  EquipmentOrHolderList_THolder eqList = new EquipmentOrHolderList_THolder();
		  eiMgr.getAllEquipment(meName,eqList);
		  equipment.EquipmentOrHolder_T[] eqInfos = eqList.value;
		  for (int i = 0; i < eqInfos.length; i++) { 
			  if (eqInfos[i].discriminator().value() == 0)
				  System.out.println
				  ("机架--EQ" + i + "	" + eqInfos[i].discriminator().value()
						  		  + "	" + eqInfos[i].equip().name[0].name + "{" + eqInfos[i].equip().name[0].value + "}" +
						  		  			eqInfos[i].equip().name[1].name + "{" + eqInfos[i].equip().name[1].value + "}" +
						  		  			eqInfos[i].equip().name[2].name + "{" + eqInfos[i].equip().name[2].value + "}" +
						  		  			eqInfos[i].equip().name[3].name + "{" + eqInfos[i].equip().name[3].value + "}"
						  		  + "	" + eqInfos[i].equip().userLabel
						  		  + "	" + eqInfos[i].equip().hardwareVersion
						  		  + "	" + eqInfos[i].equip().softwareVersion
						  		  + "	" + eqInfos[i].equip().hasProtection
						  		  + "	" + eqInfos[i].equip().serviceState.value()
						  		  + "	" + eqInfos[i].equip().expectedBoardType
						  		  + "	" + eqInfos[i].equip().installedBoardType
//						  		  + "	" + eqInfos[i].equip().ptpList[0].name
//						  		  + "	" + eqInfos[i].equip().ptpList[0].userLabel
//						  		  + "	" + eqInfos[i].equip().ptpList[0].owner
//						  		  + "	" + eqInfos[i].equip().ptpList[0].type.value()
//						  		  + "	" + eqInfos[i].equip().ptpList[0].connectionState.value()
//						  		  + "	" + eqInfos[i].equip().ptpList[0].tpMappingMode.value()
//						  		  + "	" + eqInfos[i].equip().ptpList[0].direction.value()
//						  		  + "	" + eqInfos[i].equip().ptpList[0].transmissionParams[0].layer
//						  		  + "	" + eqInfos[i].equip().ptpList[0].transmissionParams[0].transmissionParams[0].name
//						  		  + "	" + eqInfos[i].equip().ptpList[0].transmissionParams[0].transmissionParams[0].value
//						  		  + "	" + eqInfos[i].equip().ptpList[0].tpProtectionAssociation.value()
//						  		  + "	" + eqInfos[i].equip().ptpList[0].edgePoint
//						  		  + "	" + eqInfos[i].equip().ptpList[0].includeTPList[0][0].name
//						  		  + "	" + eqInfos[i].equip().ptpList[0].includeTPList[0][0].value
//						  		  + "	" + eqInfos[i].equip().ptpList[0].additionalInfo[0].name
//						  		  + "	" + eqInfos[i].equip().ptpList[0].additionalInfo[0].value
						  		  + "	" + eqInfos[i].equip().additionalInfo[0].name
						  		  + "	" + eqInfos[i].equip().additionalInfo[0].value);
			  else
				  System.out.println
				  ("容器--HD" + i + "	" + eqInfos[i].discriminator().value()
						  		  + "	" + eqInfos[i].holder().name[0].name + "{" + eqInfos[i].holder().name[0].value + "}" +
						  					eqInfos[i].holder().name[1].name + "{" + eqInfos[i].holder().name[1].value + "}"
						  		  + "	" + eqInfos[i].holder().userLabel
						  		  + "	" + eqInfos[i].holder().holderType
						  		  //+ "	" + eqInfos[i].holder().expectedOrInstalledEquipment[0].name
						  		  //+ "	" + eqInfos[i].holder().expectedOrInstalledEquipment[0].value
						  		  //+ "	" + eqInfos[i].holder().acceptableEquipmentTypeList[0]
						  		  + "	" + eqInfos[i].holder().location
						  		  + "	" + eqInfos[i].holder().vendorName
						  		  + "	" + eqInfos[i].holder().holderState.value()
						  		  + "	" + eqInfos[i].holder().hardwareVersion
						  		  + "	" + eqInfos[i].holder().serialNo
						  		  + "	" + eqInfos[i].holder().additionalInfo[0].name
						  		  + "	" + eqInfos[i].holder().additionalInfo[0].value);
		  }
	  } 
	  catch (ProcessingFailureException pfe) { 
		  System.out.println( 
		  "初始化 EquipmentInventory 管理器异常!---ProcessingFailureException---"); 
		  System.out.println(pfe); 
	  } 
	}
	
	//查询网元内拓扑信息（ManagedElement 管理器） 
	public static void getInnerNELink() {	  	   
	  try { 
		   System.out.println("初始化 ManagedElement 管理器!");
		   Common_IHolder mgrHolder = new Common_IHolder();
		   emsSession.getManager("ManagedElement", mgrHolder);
		   meMgr = ManagedElementMgr_IHelper.narrow(mgrHolder.value);
//		   ManagedElementList_THolder meList=new ManagedElementList_THolder();
//		   meMgr.getAllManagedElements(meList);
//		   managedElement.ManagedElement_T[] meInfos = meList.value;
		   NameAndStringValue_T[] meName = new NameAndStringValue_T[2];
		   meName[0] = new NameAndStringValue_T("EMS","ZTE/1");
		   meName[1] = new NameAndStringValue_T("ManagedElement","1(P)");
		   MEConfigData_THolder meConfigDatas = new MEConfigData_THolder();		   
		   String[] configDataTypes = {"InnerNELink"};
		   meMgr.getMEconfigData(meName, configDataTypes, meConfigDatas);
		   managedElementManager.MEConfigData_T meLinks = meConfigDatas.value;		   
		   TopologicalLink_T[] linkList = TopologicalLinkList_THelper.extract(meLinks.configDatas[0].value);
		   System.out.println
			   ("网元--ME " + "2\n" + "	" + meLinks.name[0].name + "{" + meLinks.name[0].value + "}" +
					   					 	meLinks.name[1].name + "{" + meLinks.name[1].value + "}\n"
					   			  + "	" + meLinks.configDatas[0].name + "\n{" + linkList[0].name[0].name + linkList[0].name[0].value
					   			  												+ linkList[0].name[1].name + linkList[0].name[1].value+ "}\n"
					   			  										+ "{" + linkList[0].userLabel + "}\n"
					   			  										+ "{" + linkList[0].direction.toString() + "}\n"
					   			  										+ "{" + linkList[0].rate + "}\n"
					   			  										+ "{" + linkList[0].aEndTP[0].name + linkList[0].aEndTP[0].value
					   			  											  + linkList[0].aEndTP[1].name + linkList[0].aEndTP[1].value
					   			  											  + linkList[0].aEndTP[2].name + linkList[0].aEndTP[2].value+ "}\n"
					   			  										+ "{" + linkList[0].zEndTP[0].name + linkList[0].zEndTP[0].value
					   			  											  + linkList[0].aEndTP[1].name + linkList[0].aEndTP[1].value
					   			  											  + linkList[0].aEndTP[2].name + linkList[0].aEndTP[2].value+ "}\n"
					   			  										+ "{" + linkList[0].additionalInfo[0].name + linkList[0].additionalInfo[0].value + "}\n");
	  } 
	  catch (ProcessingFailureException pfe) { 
		   System.out.println(
		   "初始化 ManagedElement 管理器异常!---ProcessingFailureException---");
		   System.out.println(pfe.toString());
	  } 
	}
	
	//查询网元间拓扑信息（EMS 管理器）  
	public ArrayList[] getTopologicalLink() {	   
	  try { 
		   System.out.println("初始化 EMS 管理器!");
		   Common_IHolder mgrHolder = new Common_IHolder();
		   emsSession.getManager("EMS", mgrHolder);
		   emsMgr = EMSMgr_IHelper.narrow(mgrHolder.value);
		   TopologicalLinkList_THolder topoList=new TopologicalLinkList_THolder();
		   emsMgr.getAllTopLevelTopologicalLinks(topoList);
		   topologicalLink.TopologicalLink_T[] emsInfos = topoList.value;
		   ArrayList[] tedInfo = new ArrayList[emsInfos.length];
		   for (int i = 0; i < emsInfos.length; i++) {		
			   tedInfo[i] = new ArrayList();
			   String teRouterId = emsInfos[i].aEndTP[1].value;
			   String teLinkIdAddr = emsInfos[i].zEndTP[1].value;
			   String teLocalId = emsInfos[i].aEndTP[2].value;
			   String teRemoteId = emsInfos[i].zEndTP[2].value;
			   tedInfo[i].add(teRouterId);
			   tedInfo[i].add(teLinkIdAddr);
			   tedInfo[i].add(teLocalId);
			   tedInfo[i].add(teRemoteId);	
//			   System.out.println(tedInfo[i].get(3));	   
			   }
		   return tedInfo;
//		   for (int i = 0; i < emsInfos.length; i++) { 
//			   System.out.println
//			   ("连接--LINK " + i + "\n	" + emsInfos[i].name[0].name + "{" + emsInfos[i].name[0].value + "}" +
//					   					emsInfos[i].name[1].name + "{" + emsInfos[i].name[1].value + "}"
//					   			+ "\n	" + emsInfos[i].userLabel
//			    				+ "\n	" + emsInfos[i].direction.toString()
//			    				+ "\n	" + emsInfos[i].rate
//			    				+ "\n{" + emsInfos[i].aEndTP[0].name + "}" + "{" + emsInfos[i].aEndTP[0].value + "}"
//									  + "{" + emsInfos[i].aEndTP[1].name + "}" + "{" + emsInfos[i].aEndTP[1].value + "}"
//									  + "{" + emsInfos[i].aEndTP[2].name + "}" + "{" + emsInfos[i].aEndTP[2].value+ "}\n"
//								+ "\n{" + emsInfos[i].zEndTP[0].name + emsInfos[i].zEndTP[0].value
//									  + emsInfos[i].aEndTP[1].name + emsInfos[i].aEndTP[1].value
//									  + emsInfos[i].aEndTP[2].name + emsInfos[i].aEndTP[2].value+ "}\n"
//			    				+ "\n	" + emsInfos[i].additionalInfo[0].name + emsInfos[i].additionalInfo[0].value + "\n\n");
//		   } 
	  } 
	  catch (ProcessingFailureException pfe) { 
		   System.out.println(
		   "初始化 ManagedElement 管理器异常!---ProcessingFailureException---");
		   System.out.println(pfe.toString());
	  } 
	  return null;
	}
	
	// 创建子网连接（MultiLayerSubnetwork 管理器） 
	public static void createSNC()	{	  
	  try {
		   System.out.println("初始化 EMS 管理器!");
		   Common_IHolder mgrHolder = new Common_IHolder();
		   emsSession.getManager("EMS", mgrHolder);
		   emsMgr = EMSMgr_IHelper.narrow(mgrHolder.value);
		   TopologicalLinkList_THolder topoList=new TopologicalLinkList_THolder();
		   emsMgr.getAllTopLevelTopologicalLinks(topoList);
		   topologicalLink.TopologicalLink_T[] emsInfos = topoList.value;
		  
		  System.out.println("初始化 MultiLayerSubnetwork 管理器!");
		  Common_IHolder mgrHolder2 = new Common_IHolder();
		  emsSession.getManager("MultiLayerSubnetwork", mgrHolder2);
		  mlsMgr = MultiLayerSubnetworkMgr_IHelper.narrow(mgrHolder2.value);
		  SNCCreateData_T createData = new SNCCreateData_T();
		  createData.userLabel = "A";
		  createData.forceUniqueness = false;
		  createData.owner = "SITU";
		  createData.direction.from_int(0);
		  createData.staticProtectionLevel.from_int(0);
		  createData.protectionEffort.from_int(0);
		  createData.rerouteAllowed.from_int(0);
		  createData.networkRouted.from_int(0);
		  createData.sncType.from_int(0);
		  createData.layerRate = 41;
		  createData.ccInclusions = null;
		  createData.neTpInclusions = null;
		  createData.fullRoute = false;
		  createData.neTpSncExclusions = null;
		  createData.aEnd[0] = emsInfos[49].aEndTP;
		  createData.zEnd[0] = emsInfos[49].zEndTP;
//		  createData.aEnd[0][0].name = "EMS";
//		  createData.aEnd[0][0].value = "ZTE/1";
//		  createData.aEnd[0][1].name = "ManagedElement";
//		  createData.aEnd[0][1].value = "71(P)";
//		  createData.aEnd[0][2].name = "PTP";
//		  createData.aEnd[0][2].value = "/rack=0/shelf=1/slot=5/port=403_1";
//		  createData.zEnd[0][0].name = "EMS";
//		  createData.zEnd[0][0].value = "ZTE/1";
//		  createData.zEnd[0][1].name = "ManagedElement";
//		  createData.zEnd[0][1].value = "71(P)";
//		  createData.zEnd[0][2].name = "PTP";
//		  createData.zEnd[0][2].value = "/rack=0/shelf=1/slot=5/port=404_1";
		  createData.additionalCreationInfo = null;
		  GradesOfImpact_T tolerableImpact = GradesOfImpact_T.from_int(0);
		  SubnetworkConnection_THolder theSNC = new SubnetworkConnection_THolder();
		  StringHolder errorReason = new StringHolder();
		  
//		  mlsMgr.createSNC(createData,tolerableImpact,theSNC,errorReason);
		  mlsMgr.createSNC(createData,null,theSNC,errorReason);
	  }
	  catch (ProcessingFailureException pfe) {
		  System.out.println(
		  "初始化 MultiLayerSubnetwork 管理器异常!---ProcessingFailureException---");
		  System.out.println(pfe);
	  }
	}
	
	//修改子网连接信息（MultiLayerSubnetwork 管理器）
	public static void modifySNC() {	  	  
	  try {		  
		  System.out.println("初始化 MultiLayerSubnetwork 管理器!");
		  Common_IHolder mgrHolder = new Common_IHolder();
		  emsSession.getManager("MultiLayerSubnetwork", mgrHolder);
		  mlsMgr = MultiLayerSubnetworkMgr_IHelper.narrow(mgrHolder.value);
		  
		  NameAndStringValue_T[] sncName = null;
		  String routeId = null;
		  SNCModifyData_T SNCModifyData = null;
		  GradesOfImpact_T tolerableImpact = null;
		  ProtectionEffort_T tolerableImpactEffort = null;
		  TPDataList_THolder tpsToModify = null;
		  SubnetworkConnection_THolder newSNC = null;
		  StringHolder errorReason = null;
		  mlsMgr.modifySNC(sncName, routeId, SNCModifyData, tolerableImpact, tolerableImpactEffort, tpsToModify, newSNC, errorReason);
		  
		  Common_IHolder commonIHolder = new Common_IHolder();
		  Common_I commonI = commonIHolder.value;
		  NameAndStringValue_T[] objectName = null;
		  String nativeEMSName = null;
		  commonI.setNativeEMSName(objectName, nativeEMSName);
	  }
	  catch (ProcessingFailureException pfe) {
		  System.out.println(
		  "初始化 MultiLayerSubnetwork 管理器异常!---ProcessingFailureException---");
		  System.out.println(pfe);
	  }
	}
	
	
	//建立路径
	public static void createXC4Path(String srcPort,String destPort,String bw,List<Link> lists) {
		
		
		List<CrossConnect> xcs = new ArrayList<CrossConnect>();		
		XCHop xcHop = new XCHop();		
		XCEnd xcEnd = new XCEnd();
		HopToXC hopToXC = new HopToXC();
		CrossConnect xc = new CrossConnect();
		
		//UNI源端
		xcHop = new XCHop(lists.get(0).getId().getTeRouterId(),srcPort,bw);
		xcEnd = hopToXC.getXCEndByXCHop(xcHop);		
		xc.setMeId(xcEnd.getMeId());
		xc.setSrcPTP(xcEnd.getPtp());
		xcHop = new XCHop(lists.get(0).getId().getTeRouterId(),lists.get(0).getId().getTeLocalId(),bw);
		xcEnd = hopToXC.getXCEndByXCHop(xcHop);
		xc.setDestPTP(xcEnd.getPtp());
		xc.setCTP(xcEnd.getCtp());
		xcs.add(xc);
		
		//中间部分交叉
		for(int i = 0;i < lists.size() - 1;i++) {
			xcHop = new XCHop(lists.get(i).getId().getTeLinkIdAddr(),lists.get(i).getId().getTeRemoteId(),bw);
			xcEnd = hopToXC.getXCEndByXCHop(xcHop);
			xc.setMeId(xcEnd.getMeId());
			xc.setSrcPTP(xcEnd.getPtp());
			xcHop = new XCHop(lists.get(i+1).getId().getTeRouterId(),lists.get(i+1).getId().getTeLocalId(),bw);
			xcEnd = hopToXC.getXCEndByXCHop(xcHop);
			xc.setDestPTP(xcEnd.getPtp());
			xc.setCTP(xcEnd.getCtp());
			xcs.add(xc);
		}
		
		//UNI目标端
		xcHop = new XCHop(lists.get(lists.size()-1).getId().getTeLinkIdAddr(),lists.get(lists.size()-1).getId().getTeRemoteId(),bw);
		xcEnd = hopToXC.getXCEndByXCHop(xcHop);		
		xc.setMeId(xcEnd.getMeId());
		xc.setSrcPTP(xcEnd.getPtp());
		xcHop = new XCHop(lists.get(lists.size()-1).getId().getTeLinkIdAddr(),destPort,bw);
		xcEnd = hopToXC.getXCEndByXCHop(xcHop);
		xc.setDestPTP(xcEnd.getPtp());
		xc.setCTP(xcEnd.getCtp());
		xcs.add(xc);
		
		for(int i = 0;i < xcs.size();i++) {
			createXC(xcs.get(i).getMeId(), xcs.get(i).getSrcPTP(), xcs.get(i).getDestPTP(), xcs.get(i).getCTP());
		}
	}
	
	//L建立交叉连接（ManagedElement 管理器）  
	public static void createXC(String meId, String srcPort, String destPort, String ctp) {	  	   
	  try { 
		   System.out.println("初始化 ManagedElement 管理器!");
		   Common_IHolder mgrHolder = new Common_IHolder();
		   emsSession.getManager("ManagedElement", mgrHolder);
		   meMgr = ManagedElementMgr_IHelper.narrow(mgrHolder.value);
		   NameAndStringValue_T[] meName = new NameAndStringValue_T[]{
				   new NameAndStringValue_T("EMS","ZTE/1"),
				   new NameAndStringValue_T("ManagedElement","1(P)")
		   };
		   short[] connectionRateList = {};
		   int how_many = 100;
		   CrossConnectList_THolder crossConnections = new CrossConnectList_THolder();
		   CCIterator_IHolder ccIt = new CCIterator_IHolder();
		   meMgr.getAllCrossConnections(meName, connectionRateList, how_many, crossConnections, ccIt);
		   CrossConnect_T[] XC = crossConnections.value;
		   for(int i = 0;i<XC.length;i++)
		   {
		   System.out.println(XC[i].active+"/"
				   +XC[i].direction.toString()+"/"
				   +XC[i].ccType.toString()+"/"
				   +XC[i].aEndNameList[0][0].name+"{"+XC[i].aEndNameList[0][0].value+"}"
				   +XC[i].aEndNameList[0][1].name+"{"+XC[i].aEndNameList[0][1].value+"}"
				   +XC[i].aEndNameList[0][2].name+"{"+XC[i].aEndNameList[0][2].value+"}"
				   +XC[i].aEndNameList[0][3].name+"{"+XC[i].aEndNameList[0][3].value+"}"
				   +XC[i].zEndNameList[0][0].name+"{"+XC[i].zEndNameList[0][0].value+"}"
				   +XC[i].zEndNameList[0][1].name+"{"+XC[i].zEndNameList[0][1].value+"}"
				   +XC[i].zEndNameList[0][2].name+"{"+XC[i].zEndNameList[0][2].value+"}"
				   +XC[i].zEndNameList[0][3].name+"{"+XC[i].zEndNameList[0][3].value+"}"
				   +XC[i].additionalInfo[0].name+"{"+XC[i].additionalInfo[0].value+"}"
				   +XC[i].additionalInfo[1].name+"{"+XC[i].additionalInfo[1].value+"}"
				   +XC[i].additionalInfo[2].name+"{"+XC[i].additionalInfo[2].value+"}"
				   +XC[i].additionalInfo[3].name+"{"+XC[i].additionalInfo[3].value+"}");
		   }
		   
		   
		   
		   CrossConnect_T[] add = new CrossConnect_T[2];		   
		   add[0] = new CrossConnect_T();
		   add[0].active = true;
		   add[0].direction = ConnectionDirection_T.from_int(0);
		   add[0].ccType = SNCType_T.from_int(0);
		   add[0].aEndNameList = new NameAndStringValue_T[1][2];
		   add[0].aEndNameList[0] = new NameAndStringValue_T[]{
				   new NameAndStringValue_T("EMS","ZTE/1"),
				   new NameAndStringValue_T("ManagedElement",meId),
				   new NameAndStringValue_T("FTP",srcPort),
				   new NameAndStringValue_T("CTP",ctp)
		   };
		   add[0].zEndNameList = new NameAndStringValue_T[1][2];
		   add[0].zEndNameList[0] = new NameAndStringValue_T[]{
				   new NameAndStringValue_T("EMS","ZTE/1"),
				   new NameAndStringValue_T("ManagedElement",meId),
				   new NameAndStringValue_T("FTP",destPort),
				   new NameAndStringValue_T("CTP",ctp)
		   };
		   add[0].additionalInfo = new NameAndStringValue_T[]{
//				   new NameAndStringValue_T("IsFixed","FALSE"),
//				   new NameAndStringValue_T("LayerRate","10105"),
//				   new NameAndStringValue_T("MEName","ME{1}"),
//				   new NameAndStringValue_T("CrossConnection","EMS{ZTE/1}ManagedElement{1(P)}CrossConnection{1655}")
		   };
		   add[1] = new CrossConnect_T();
		   add[1].active = true;
		   add[1].direction = ConnectionDirection_T.from_int(0);
		   add[1].ccType = SNCType_T.from_int(0);
		   add[1].aEndNameList = new NameAndStringValue_T[1][2];
		   add[1].aEndNameList[0] = new NameAndStringValue_T[]{
				   new NameAndStringValue_T("EMS","ZTE/1"),
				   new NameAndStringValue_T("ManagedElement",meId),
				   new NameAndStringValue_T("FTP",destPort),
				   new NameAndStringValue_T("CTP",ctp)
		   };
		   add[1].zEndNameList = new NameAndStringValue_T[1][2];
		   add[1].zEndNameList[0] = new NameAndStringValue_T[]{
				   new NameAndStringValue_T("EMS","ZTE/1"),
				   new NameAndStringValue_T("ManagedElement",meId),
				   new NameAndStringValue_T("FTP",srcPort),
				   new NameAndStringValue_T("CTP",ctp)
		   };
		   add[1].additionalInfo = new NameAndStringValue_T[]{
//				   new NameAndStringValue_T("IsFixed","FALSE"),
//				   new NameAndStringValue_T("LayerRate","10105"),
//				   new NameAndStringValue_T("MEName","ME{1}"),
//				   new NameAndStringValue_T("CrossConnection","EMS{ZTE/1}ManagedElement{1(P)}CrossConnection{1655}")
		   };
		   CrossConnect_T[] remove = new CrossConnect_T[]{};
//		   remove[0] = new CrossConnect_T();
//		   remove[0].active = true;
//		   remove[0].direction = ConnectionDirection_T.from_int(1);
//		   remove[0].ccType = SNCType_T.from_int(0);
//		   remove[0].aEndNameList = new NameAndStringValue_T[1][2];
//		   remove[0].aEndNameList[0] = new NameAndStringValue_T[]{};
//		   remove[0].zEndNameList = new NameAndStringValue_T[1][2];
//		   remove[0].zEndNameList[0] = new NameAndStringValue_T[]{};
//		   remove[0].additionalInfo = new NameAndStringValue_T[]{};
		   CrossConnectList_THolder addSuccess = new CrossConnectList_THolder();
		   CrossConnectList_THolder removeSuccess = new CrossConnectList_THolder();
//		   meMgr.createCrossConnections(meName, add, addSuccess);
		   meMgr.setCrossConnections(add, remove, addSuccess, removeSuccess);
//		   CrossConnect_T[] xcAdd = addSuccess.value;
//		   System.out.println(xcAdd[0].active);
		   
		   
	  } 
	  catch (ProcessingFailureException pfe) { 
		   System.out.println(
		   "初始化 ManagedElement 管理器异常!---ProcessingFailureException---");
		   System.out.println(pfe.toString());
	  } 
	}
	  
	public static void deleteXC() {	  
		   //LSP建立和拆除（ManagedElement 管理器）  
		try { 
			 System.out.println("初始化 ManagedElement 管理器!");
			 Common_IHolder mgrHolder = new Common_IHolder();
			 emsSession.getManager("ManagedElement", mgrHolder);
			 meMgr = ManagedElementMgr_IHelper.narrow(mgrHolder.value);
			   CrossConnect_T[] ccList = new CrossConnect_T[2];
			   ccList[0] = new CrossConnect_T();
			   ccList[0].active = true;
			   ccList[0].direction = ConnectionDirection_T.from_int(0);
			   ccList[0].ccType = SNCType_T.from_int(0);
			   ccList[0].aEndNameList = new NameAndStringValue_T[1][2];
			   ccList[0].aEndNameList[0] = new NameAndStringValue_T[]{
					   new NameAndStringValue_T("EMS","ZTE/1"),
					   new NameAndStringValue_T("ManagedElement","1(P)"),
					   new NameAndStringValue_T("FTP","/rack=0/shelf=4/slot=50/port=1192_15"),
					   new NameAndStringValue_T("CTP","/odu0=1")
			   };
			   ccList[0].zEndNameList = new NameAndStringValue_T[1][2];
			   ccList[0].zEndNameList[0] = new NameAndStringValue_T[]{
					   new NameAndStringValue_T("EMS","ZTE/1"),
					   new NameAndStringValue_T("ManagedElement","1(P)"),
					   new NameAndStringValue_T("FTP","/rack=0/shelf=4/slot=50/port=1193_19"),
					   new NameAndStringValue_T("CTP","/odu0=1")
			   };
			   ccList[0].additionalInfo = new NameAndStringValue_T[]{
//			   new NameAndStringValue_T("IsFixed","FALSE"),
//			   new NameAndStringValue_T("LayerRate","0"),
//			   new NameAndStringValue_T("MEName","ME{1}"),
//			   new NameAndStringValue_T("CrossConnection","EMS{ZTE/1}ManagedElement{1(P)}CrossConnection{1692}")
	   };
			   ccList[1] = new CrossConnect_T();
			   ccList[1].active = true;
			   ccList[1].direction = ConnectionDirection_T.from_int(1);
			   ccList[1].ccType = SNCType_T.from_int(0);
			   ccList[1].aEndNameList = new NameAndStringValue_T[1][2];
			   ccList[1].aEndNameList[0] = new NameAndStringValue_T[]{
					   new NameAndStringValue_T("EMS","ZTE/1"),
					   new NameAndStringValue_T("ManagedElement","1(P)"),
					   new NameAndStringValue_T("FTP","/rack=0/shelf=4/slot=50/port=1192_19"),
					   new NameAndStringValue_T("CTP","/odu0=1")
			   };
			   ccList[1].zEndNameList = new NameAndStringValue_T[1][2];
			   ccList[1].zEndNameList[0] = new NameAndStringValue_T[]{
					   new NameAndStringValue_T("EMS","ZTE/1"),
					   new NameAndStringValue_T("ManagedElement","1(P)"),
					   new NameAndStringValue_T("FTP","/rack=0/shelf=4/slot=50/port=1193_15"),
					   new NameAndStringValue_T("CTP","/odu0=1")
			   };
			   ccList[1].additionalInfo = new NameAndStringValue_T[]{
//			   new NameAndStringValue_T("IsFixed","FALSE"),
//			   new NameAndStringValue_T("LayerRate","0"),
//			   new NameAndStringValue_T("MEName","ME{1}"),
//			   new NameAndStringValue_T("CrossConnection","EMS{ZTE/1}ManagedElement{1(P)}CrossConnection{1693}")
	   };
			 CrossConnectList_THolder successedList = new CrossConnectList_THolder();
			 CrossConnectList_THolder failedList = new CrossConnectList_THolder();
			 meMgr.deleteCrossConnections(ccList, successedList, failedList);

		} 
		catch (ProcessingFailureException pfe) { 
			 System.out.println(
			 "初始化 ManagedElement 管理器异常!---ProcessingFailureException---");
			 System.out.println(pfe.toString());
		} 
//	
//	
//	  // 初始化 EMS 管理器 
//	  try { 
//		   System.out.println("初始化 EMS 管理器!");
//		   Common_IHolder mgrHolder = new Common_IHolder();
//		   emsSession.getManager("EMS", mgrHolder);
//		   emsMgr = EMSMgr_IHelper.narrow(mgrHolder.value);
//		   System.out.println("EMS_Manager To String ---" + emsMgr.toString());
//	  } 
//	  catch (ProcessingFailureException pfe) { 
//		   System.out.println("初始化 EMS 管理器异常!---ProcessingFailureException---");
//		   System.out.println(pfe.toString());
//	  } 
	
	//  emsSession.endSession();
	 }   
	
	 public static void main(String args[]) {  
		  try { 
			  CORBAClient ss = new CORBAClient();
			  emsSession = ss.initial();
//			   ss.getAllMEInfo();
//			   ss.getAllEQInfo();
//			   ss.getInnerNELink();
			  ss.getTopologicalLink();
//			   ss.createXC();
//			   ss.deleteXC();
		  } 
		  catch (Exception e) { 
			  e.printStackTrace();
		  } 
	 }
}