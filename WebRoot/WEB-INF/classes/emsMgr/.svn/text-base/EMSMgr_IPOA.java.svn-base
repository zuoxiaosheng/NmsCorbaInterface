package emsMgr;


/**
 * Generated from IDL interface "EMSMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public abstract class EMSMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, emsMgr.EMSMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "createEthernetService", new java.lang.Integer(0));
		m_opsHash.put ( "getEthernetServices", new java.lang.Integer(1));
		m_opsHash.put ( "getTopologicalSubnetwork", new java.lang.Integer(2));
		m_opsHash.put ( "createVLAN", new java.lang.Integer(3));
		m_opsHash.put ( "unacknowledgeAlarms", new java.lang.Integer(4));
		m_opsHash.put ( "createASAP", new java.lang.Integer(5));
		m_opsHash.put ( "getAllTopLevelSubnetworkNames", new java.lang.Integer(6));
		m_opsHash.put ( "getASAPAssociatedResourceNames", new java.lang.Integer(7));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(8));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(9));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(10));
		m_opsHash.put ( "getAllASAPNames", new java.lang.Integer(11));
		m_opsHash.put ( "getEMS", new java.lang.Integer(12));
		m_opsHash.put ( "getTopLevelTopologicalLink", new java.lang.Integer(13));
		m_opsHash.put ( "modifyASAP", new java.lang.Integer(14));
		m_opsHash.put ( "getRPRNodesStatus", new java.lang.Integer(15));
		m_opsHash.put ( "getTopologicalSubnetworksByLayer", new java.lang.Integer(16));
		m_opsHash.put ( "deleteVLAN", new java.lang.Integer(17));
		m_opsHash.put ( "getVLANs", new java.lang.Integer(18));
		m_opsHash.put ( "getASAPbyResource", new java.lang.Integer(19));
		m_opsHash.put ( "deleteASAP", new java.lang.Integer(20));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(21));
		m_opsHash.put ( "getAllTopLevelTopologicalLinks", new java.lang.Integer(22));
		m_opsHash.put ( "clearAlarms", new java.lang.Integer(23));
		m_opsHash.put ( "getAllTopLevelSubnetworks", new java.lang.Integer(24));
		m_opsHash.put ( "deassignASAP", new java.lang.Integer(25));
		m_opsHash.put ( "acknowledgeAlarms", new java.lang.Integer(26));
		m_opsHash.put ( "getASAP", new java.lang.Integer(27));
		m_opsHash.put ( "getVBs", new java.lang.Integer(28));
		m_opsHash.put ( "createVB", new java.lang.Integer(29));
		m_opsHash.put ( "getAllTopLevelTopologicalLinkNames", new java.lang.Integer(30));
		m_opsHash.put ( "deleteEthernetService", new java.lang.Integer(31));
		m_opsHash.put ( "deleteVB", new java.lang.Integer(32));
		m_opsHash.put ( "setLocation", new java.lang.Integer(33));
		m_opsHash.put ( "getAllASAPs", new java.lang.Integer(34));
		m_opsHash.put ( "assignASAP", new java.lang.Integer(35));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/emsMgr/EMSMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public emsMgr.EMSMgr_I _this()
	{
		return emsMgr.EMSMgr_IHelper.narrow(_this_object());
	}
	public emsMgr.EMSMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return emsMgr.EMSMgr_IHelper.narrow(_this_object(orb));
	}
	public org.omg.CORBA.portable.OutputStream _invoke(String method, org.omg.CORBA.portable.InputStream _input, org.omg.CORBA.portable.ResponseHandler handler)
		throws org.omg.CORBA.SystemException
	{
		org.omg.CORBA.portable.OutputStream _out = null;
		// do something
		// quick lookup of operation
		java.lang.Integer opsIndex = (java.lang.Integer)m_opsHash.get ( method );
		if ( null == opsIndex )
			throw new org.omg.CORBA.BAD_OPERATION(method + " not found");
		switch ( opsIndex.intValue() )
		{
			case 0: // createEthernetService
			{
			try
			{
				emsMgr.EthernetServiceCreateData_T _arg0=emsMgr.EthernetServiceCreateData_THelper.read(_input);
				emsMgr.EthernetService_THolder _arg1= new emsMgr.EthernetService_THolder();
				_out = handler.createReply();
				createEthernetService(_arg0,_arg1);
				emsMgr.EthernetService_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // getEthernetServices
			{
			try
			{
				globaldefs.NameAndStringValue_T[][] _arg0=globaldefs.NamingAttributesList_THelper.read(_input);
				emsMgr.EthernetServiceList_THolder _arg1= new emsMgr.EthernetServiceList_THolder();
				_out = handler.createReply();
				getEthernetServices(_arg0,_arg1);
				emsMgr.EthernetServiceList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // getTopologicalSubnetwork
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				multiLayerSubnetwork.TopologicalSubnetwork_THolder _arg1= new multiLayerSubnetwork.TopologicalSubnetwork_THolder();
				_out = handler.createReply();
				getTopologicalSubnetwork(_arg0,_arg1);
				multiLayerSubnetwork.TopologicalSubnetwork_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // createVLAN
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				emsMgr.LogicalPort_T[] _arg2=emsMgr.LogicalPortList_THelper.read(_input);
				emsMgr.VLAN_THolder _arg3= new emsMgr.VLAN_THolder();
				_out = handler.createReply();
				createVLAN(_arg0,_arg1,_arg2,_arg3);
				emsMgr.VLAN_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // unacknowledgeAlarms
			{
			try
			{
				notifications.AlarmOrTCAIdentifier_T[] _arg0=notifications.AlarmAndTCAIDList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NVSList_THelper.read(_input);
				notifications.AlarmAndTCAIDList_THolder _arg2= new notifications.AlarmAndTCAIDList_THolder();
				_out = handler.createReply();
				unacknowledgeAlarms(_arg0,_arg1,_arg2);
				notifications.AlarmAndTCAIDList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // createASAP
			{
			try
			{
				aSAP.ASAPCreateModifyData_T _arg0=aSAP.ASAPCreateModifyData_THelper.read(_input);
				aSAP.ASAP_THolder _arg1= new aSAP.ASAP_THolder();
				globaldefs.NVSList_THolder _arg2= new globaldefs.NVSList_THolder();
				_out = handler.createReply();
				createASAP(_arg0,_arg1,_arg2);
				aSAP.ASAP_THelper.write(_out,_arg1.value);
				globaldefs.NVSList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // getAllTopLevelSubnetworkNames
			{
			try
			{
				globaldefs.NamingAttributesList_THolder _arg0= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getAllTopLevelSubnetworkNames(_arg0);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg0.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getASAPAssociatedResourceNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg3= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getASAPAssociatedResourceNames(_arg0,_arg1,_arg2,_arg3);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // setAdditionalInfo
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NVSList_THolder _arg1= new globaldefs.NVSList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setAdditionalInfo(_arg0,_arg1);
				globaldefs.NVSList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // setNativeEMSName
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setNativeEMSName(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 10: // getCapabilities
			{
			try
			{
				common.CapabilityList_THolder _arg0= new common.CapabilityList_THolder();
				_out = handler.createReply();
				getCapabilities(_arg0);
				common.CapabilityList_THelper.write(_out,_arg0.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getAllASAPNames
			{
			try
			{
				int _arg0=_input.read_ulong();
				globaldefs.NamingAttributesList_THolder _arg1= new globaldefs.NamingAttributesList_THolder();
				globaldefs.NamingAttributesIterator_IHolder _arg2= new globaldefs.NamingAttributesIterator_IHolder();
				_out = handler.createReply();
				getAllASAPNames(_arg0,_arg1,_arg2);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg1.value);
				globaldefs.NamingAttributesIterator_IHelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getEMS
			{
			try
			{
				emsMgr.EMS_THolder _arg0= new emsMgr.EMS_THolder();
				_out = handler.createReply();
				getEMS(_arg0);
				emsMgr.EMS_THelper.write(_out,_arg0.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getTopLevelTopologicalLink
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				topologicalLink.TopologicalLink_THolder _arg1= new topologicalLink.TopologicalLink_THolder();
				_out = handler.createReply();
				getTopLevelTopologicalLink(_arg0,_arg1);
				topologicalLink.TopologicalLink_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // modifyASAP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				aSAP.ASAPCreateModifyData_T _arg1=aSAP.ASAPCreateModifyData_THelper.read(_input);
				aSAP.ASAP_THolder _arg2= new aSAP.ASAP_THolder();
				globaldefs.NVSList_THolder _arg3= new globaldefs.NVSList_THolder();
				_out = handler.createReply();
				modifyASAP(_arg0,_arg1,_arg2,_arg3);
				aSAP.ASAP_THelper.write(_out,_arg2.value);
				globaldefs.NVSList_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // getRPRNodesStatus
			{
			try
			{
				globaldefs.NameAndStringValue_T[][] _arg0=globaldefs.NamingAttributesList_THelper.read(_input);
				emsMgr.RPRNodeStatusList_THolder _arg1= new emsMgr.RPRNodeStatusList_THolder();
				_out = handler.createReply();
				getRPRNodesStatus(_arg0,_arg1);
				emsMgr.RPRNodeStatusList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // getTopologicalSubnetworksByLayer
			{
			try
			{
				int _arg0=_input.read_long();
				multiLayerSubnetwork.TopologicalSubnetworkList_THolder _arg1= new multiLayerSubnetwork.TopologicalSubnetworkList_THolder();
				_out = handler.createReply();
				getTopologicalSubnetworksByLayer(_arg0,_arg1);
				multiLayerSubnetwork.TopologicalSubnetworkList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // deleteVLAN
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteVLAN(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // getVLANs
			{
			try
			{
				globaldefs.NameAndStringValue_T[][] _arg0=globaldefs.NamingAttributesList_THelper.read(_input);
				emsMgr.VLANList_THolder _arg1= new emsMgr.VLANList_THolder();
				_out = handler.createReply();
				getVLANs(_arg0,_arg1);
				emsMgr.VLANList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // getASAPbyResource
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				aSAP.ASAPList_THolder _arg3= new aSAP.ASAPList_THolder();
				aSAP.ASAPIterator_IHolder _arg4= new aSAP.ASAPIterator_IHolder();
				_out = handler.createReply();
				getASAPbyResource(_arg0,_arg1,_arg2,_arg3,_arg4);
				aSAP.ASAPList_THelper.write(_out,_arg3.value);
				aSAP.ASAPIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // deleteASAP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NVSList_THolder _arg1= new globaldefs.NVSList_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				deleteASAP(_arg0,_arg1);
				globaldefs.NVSList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // setUserLabel
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				boolean _arg2=_input.read_boolean();
				_out = handler.createReply();
				setUserLabel(_arg0,_arg1,_arg2);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // getAllTopLevelTopologicalLinks
			{
			try
			{
				topologicalLink.TopologicalLinkList_THolder _arg0= new topologicalLink.TopologicalLinkList_THolder();
				_out = handler.createReply();
				getAllTopLevelTopologicalLinks(_arg0);
				topologicalLink.TopologicalLinkList_THelper.write(_out,_arg0.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // clearAlarms
			{
			try
			{
				notifications.AlarmOrTCAIdentifier_T[] _arg0=notifications.AlarmAndTCAIDList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				java.lang.String _arg3=_input.read_string();
				notifications.AlarmAndTCAIDList_THolder _arg4= new notifications.AlarmAndTCAIDList_THolder();
				_out = handler.createReply();
				clearAlarms(_arg0,_arg1,_arg2,_arg3,_arg4);
				notifications.AlarmAndTCAIDList_THelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // getAllTopLevelSubnetworks
			{
			try
			{
				multiLayerSubnetwork.SubnetworkList_THolder _arg0= new multiLayerSubnetwork.SubnetworkList_THolder();
				_out = handler.createReply();
				getAllTopLevelSubnetworks(_arg0);
				multiLayerSubnetwork.SubnetworkList_THelper.write(_out,_arg0.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // deassignASAP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short _arg1=_input.read_short();
				globaldefs.NVSList_THolder _arg2= new globaldefs.NVSList_THolder();
				_arg2._read (_input);
				_out = handler.createReply();
				deassignASAP(_arg0,_arg1,_arg2);
				globaldefs.NVSList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // acknowledgeAlarms
			{
			try
			{
				notifications.AlarmOrTCAIdentifier_T[] _arg0=notifications.AlarmAndTCAIDList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NVSList_THelper.read(_input);
				notifications.AlarmAndTCAIDList_THolder _arg2= new notifications.AlarmAndTCAIDList_THolder();
				_out = handler.createReply();
				acknowledgeAlarms(_arg0,_arg1,_arg2);
				notifications.AlarmAndTCAIDList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 27: // getASAP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				aSAP.ASAP_THolder _arg1= new aSAP.ASAP_THolder();
				_out = handler.createReply();
				getASAP(_arg0,_arg1);
				aSAP.ASAP_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 28: // getVBs
			{
			try
			{
				globaldefs.NameAndStringValue_T[][] _arg0=globaldefs.NamingAttributesList_THelper.read(_input);
				emsMgr.VBList_THolder _arg1= new emsMgr.VBList_THolder();
				_out = handler.createReply();
				getVBs(_arg0,_arg1);
				emsMgr.VBList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 29: // createVB
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				emsMgr.LogicalPort_T[] _arg3=emsMgr.LogicalPortList_THelper.read(_input);
				emsMgr.VB_THolder _arg4= new emsMgr.VB_THolder();
				_out = handler.createReply();
				createVB(_arg0,_arg1,_arg2,_arg3,_arg4);
				emsMgr.VB_THelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 30: // getAllTopLevelTopologicalLinkNames
			{
			try
			{
				globaldefs.NamingAttributesList_THolder _arg0= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getAllTopLevelTopologicalLinkNames(_arg0);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg0.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 31: // deleteEthernetService
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteEthernetService(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 32: // deleteVB
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				_out = handler.createReply();
				deleteVB(_arg0);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 33: // setLocation
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String _arg1=_input.read_string();
				_out = handler.createReply();
				setLocation(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 34: // getAllASAPs
			{
			try
			{
				int _arg0=_input.read_ulong();
				aSAP.ASAPList_THolder _arg1= new aSAP.ASAPList_THolder();
				aSAP.ASAPIterator_IHolder _arg2= new aSAP.ASAPIterator_IHolder();
				_out = handler.createReply();
				getAllASAPs(_arg0,_arg1,_arg2);
				aSAP.ASAPList_THelper.write(_out,_arg1.value);
				aSAP.ASAPIterator_IHelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 35: // assignASAP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				globaldefs.NameAndStringValue_T[] _arg1=globaldefs.NVSList_THelper.read(_input);
				short _arg2=_input.read_short();
				globaldefs.NVSList_THolder _arg3= new globaldefs.NVSList_THolder();
				_arg3._read (_input);
				_out = handler.createReply();
				assignASAP(_arg0,_arg1,_arg2,_arg3);
				globaldefs.NVSList_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
