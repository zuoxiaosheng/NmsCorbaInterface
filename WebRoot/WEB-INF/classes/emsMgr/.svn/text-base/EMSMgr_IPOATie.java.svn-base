package emsMgr;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "EMSMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public class EMSMgr_IPOATie
	extends EMSMgr_IPOA
{
	private EMSMgr_IOperations _delegate;

	private POA _poa;
	public EMSMgr_IPOATie(EMSMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public EMSMgr_IPOATie(EMSMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public emsMgr.EMSMgr_I _this()
	{
		return emsMgr.EMSMgr_IHelper.narrow(_this_object());
	}
	public emsMgr.EMSMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return emsMgr.EMSMgr_IHelper.narrow(_this_object(orb));
	}
	public EMSMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(EMSMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public void createEthernetService(emsMgr.EthernetServiceCreateData_T createData, emsMgr.EthernetService_THolder ethernetService) throws globaldefs.ProcessingFailureException
	{
_delegate.createEthernetService(createData,ethernetService);
	}

	public void getEthernetServices(globaldefs.NameAndStringValue_T[][] serviceNameList, emsMgr.EthernetServiceList_THolder serviceList) throws globaldefs.ProcessingFailureException
	{
_delegate.getEthernetServices(serviceNameList,serviceList);
	}

	public void getTopologicalSubnetwork(globaldefs.NameAndStringValue_T[] subnetName, multiLayerSubnetwork.TopologicalSubnetwork_THolder topoSubnetwork) throws globaldefs.ProcessingFailureException
	{
_delegate.getTopologicalSubnetwork(subnetName,topoSubnetwork);
	}

	public void createVLAN(java.lang.String vlanID, java.lang.String userLabel, emsMgr.LogicalPort_T[] logicalPortList, emsMgr.VLAN_THolder vlan) throws globaldefs.ProcessingFailureException
	{
_delegate.createVLAN(vlanID,userLabel,logicalPortList,vlan);
	}

	public void unacknowledgeAlarms(notifications.AlarmOrTCAIdentifier_T[] unacknowledgeIDList, globaldefs.NameAndStringValue_T[] additionalInfo, notifications.AlarmAndTCAIDList_THolder failedunAcknowledgeIDList) throws globaldefs.ProcessingFailureException
	{
_delegate.unacknowledgeAlarms(unacknowledgeIDList,additionalInfo,failedunAcknowledgeIDList);
	}

	public void createASAP(aSAP.ASAPCreateModifyData_T newASAPCreateData, aSAP.ASAP_THolder newASAP, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.createASAP(newASAPCreateData,newASAP,additionalInfo);
	}

	public void getAllTopLevelSubnetworkNames(globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelSubnetworkNames(nameList);
	}

	public void getASAPAssociatedResourceNames(globaldefs.NameAndStringValue_T[] aSAPName, int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getASAPAssociatedResourceNames(aSAPName,how_many,nameList,nameIt);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getAllASAPNames(int how_many, globaldefs.NamingAttributesList_THolder nameList, globaldefs.NamingAttributesIterator_IHolder nameIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllASAPNames(how_many,nameList,nameIt);
	}

	public void getEMS(emsMgr.EMS_THolder emsInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.getEMS(emsInfo);
	}

	public void getTopLevelTopologicalLink(globaldefs.NameAndStringValue_T[] name, topologicalLink.TopologicalLink_THolder topoLink) throws globaldefs.ProcessingFailureException
	{
_delegate.getTopLevelTopologicalLink(name,topoLink);
	}

	public void modifyASAP(globaldefs.NameAndStringValue_T[] aSAPName, aSAP.ASAPCreateModifyData_T aSAPModifyData, aSAP.ASAP_THolder newASAP, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.modifyASAP(aSAPName,aSAPModifyData,newASAP,additionalInfo);
	}

	public void getRPRNodesStatus(globaldefs.NameAndStringValue_T[][] nodeNameList, emsMgr.RPRNodeStatusList_THolder rprnodeStatusList) throws globaldefs.ProcessingFailureException
	{
_delegate.getRPRNodesStatus(nodeNameList,rprnodeStatusList);
	}

	public void getTopologicalSubnetworksByLayer(int nLayer, multiLayerSubnetwork.TopologicalSubnetworkList_THolder topoSubnetworkList) throws globaldefs.ProcessingFailureException
	{
_delegate.getTopologicalSubnetworksByLayer(nLayer,topoSubnetworkList);
	}

	public void deleteVLAN(globaldefs.NameAndStringValue_T[] vlanName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteVLAN(vlanName);
	}

	public void getVLANs(globaldefs.NameAndStringValue_T[][] vlanNameList, emsMgr.VLANList_THolder vlanList) throws globaldefs.ProcessingFailureException
	{
_delegate.getVLANs(vlanNameList,vlanList);
	}

	public void getASAPbyResource(globaldefs.NameAndStringValue_T[] resourceName, short[] layerRateList, int how_many, aSAP.ASAPList_THolder aSAPList, aSAP.ASAPIterator_IHolder asapIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getASAPbyResource(resourceName,layerRateList,how_many,aSAPList,asapIt);
	}

	public void deleteASAP(globaldefs.NameAndStringValue_T[] aSAPName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteASAP(aSAPName,additionalInfo);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void getAllTopLevelTopologicalLinks(topologicalLink.TopologicalLinkList_THolder topoList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelTopologicalLinks(topoList);
	}

	public void clearAlarms(notifications.AlarmOrTCAIdentifier_T[] clearedAlarmIDList, java.lang.String clearState, java.lang.String clearUser, java.lang.String clearTime, notifications.AlarmAndTCAIDList_THolder failedClearAlarmIDList) throws globaldefs.ProcessingFailureException
	{
_delegate.clearAlarms(clearedAlarmIDList,clearState,clearUser,clearTime,failedClearAlarmIDList);
	}

	public void getAllTopLevelSubnetworks(multiLayerSubnetwork.SubnetworkList_THolder sList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelSubnetworks(sList);
	}

	public void deassignASAP(globaldefs.NameAndStringValue_T[] resourceName, short layerRate, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.deassignASAP(resourceName,layerRate,additionalInfo);
	}

	public void acknowledgeAlarms(notifications.AlarmOrTCAIdentifier_T[] acknowledgeIDList, globaldefs.NameAndStringValue_T[] additionalInfo, notifications.AlarmAndTCAIDList_THolder failedAcknowledgeIDList) throws globaldefs.ProcessingFailureException
	{
_delegate.acknowledgeAlarms(acknowledgeIDList,additionalInfo,failedAcknowledgeIDList);
	}

	public void getASAP(globaldefs.NameAndStringValue_T[] aSAPName, aSAP.ASAP_THolder anASAP) throws globaldefs.ProcessingFailureException
	{
_delegate.getASAP(aSAPName,anASAP);
	}

	public void getVBs(globaldefs.NameAndStringValue_T[][] vbNameList, emsMgr.VBList_THolder vbList) throws globaldefs.ProcessingFailureException
	{
_delegate.getVBs(vbNameList,vbList);
	}

	public void createVB(java.lang.String userLabel, java.lang.String vbID, java.lang.String cID, emsMgr.LogicalPort_T[] logicalPortList, emsMgr.VB_THolder vb) throws globaldefs.ProcessingFailureException
	{
_delegate.createVB(userLabel,vbID,cID,logicalPortList,vb);
	}

	public void getAllTopLevelTopologicalLinkNames(globaldefs.NamingAttributesList_THolder nameList) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllTopLevelTopologicalLinkNames(nameList);
	}

	public void deleteEthernetService(globaldefs.NameAndStringValue_T[] ethernetServiceName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteEthernetService(ethernetServiceName);
	}

	public void deleteVB(globaldefs.NameAndStringValue_T[] vbName) throws globaldefs.ProcessingFailureException
	{
_delegate.deleteVB(vbName);
	}

	public void setLocation(globaldefs.NameAndStringValue_T[] objectName, java.lang.String location) throws globaldefs.ProcessingFailureException
	{
_delegate.setLocation(objectName,location);
	}

	public void getAllASAPs(int how_many, aSAP.ASAPList_THolder aSAPList, aSAP.ASAPIterator_IHolder asapIt) throws globaldefs.ProcessingFailureException
	{
_delegate.getAllASAPs(how_many,aSAPList,asapIt);
	}

	public void assignASAP(globaldefs.NameAndStringValue_T[] aSAPName, globaldefs.NameAndStringValue_T[] resourceName, short layerRate, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.assignASAP(aSAPName,resourceName,layerRate,additionalInfo);
	}

}
