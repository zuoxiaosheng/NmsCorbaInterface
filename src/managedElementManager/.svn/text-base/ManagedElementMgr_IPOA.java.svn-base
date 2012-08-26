package managedElementManager;


/**
 * Generated from IDL interface "ManagedElementMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:00
 */

public abstract class ManagedElementMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, managedElementManager.ManagedElementMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getContainedCurrentTPs", new java.lang.Integer(0));
		m_opsHash.put ( "createCrossConnections", new java.lang.Integer(1));
		m_opsHash.put ( "getAllManagedElements", new java.lang.Integer(2));
		m_opsHash.put ( "getContainedInUseTPNames", new java.lang.Integer(3));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(4));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(5));
		m_opsHash.put ( "deleteCrossConnections", new java.lang.Integer(6));
		m_opsHash.put ( "getContainedPotentialTPs", new java.lang.Integer(7));
		m_opsHash.put ( "getContainedInUseTPs", new java.lang.Integer(8));
		m_opsHash.put ( "setLocation", new java.lang.Integer(9));
		m_opsHash.put ( "setTPData", new java.lang.Integer(10));
		m_opsHash.put ( "getAllCrossConnections", new java.lang.Integer(11));
		m_opsHash.put ( "getTP", new java.lang.Integer(12));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(13));
		m_opsHash.put ( "getContainedPotentialTPNames", new java.lang.Integer(14));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(15));
		m_opsHash.put ( "getMECoordinates", new java.lang.Integer(16));
		m_opsHash.put ( "getAllManagedElementNames", new java.lang.Integer(17));
		m_opsHash.put ( "getContainedCurrentTPNames", new java.lang.Integer(18));
		m_opsHash.put ( "getMEconfigData", new java.lang.Integer(19));
		m_opsHash.put ( "getCrossConnection", new java.lang.Integer(20));
		m_opsHash.put ( "setCrossConnections", new java.lang.Integer(21));
		m_opsHash.put ( "deactivateCrossConnections", new java.lang.Integer(22));
		m_opsHash.put ( "getAllPTPs", new java.lang.Integer(23));
		m_opsHash.put ( "getMEClockCoordinates", new java.lang.Integer(24));
		m_opsHash.put ( "getManagedElement", new java.lang.Integer(25));
		m_opsHash.put ( "activateCrossConnections", new java.lang.Integer(26));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/managedElementManager/ManagedElementMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public managedElementManager.ManagedElementMgr_I _this()
	{
		return managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object());
	}
	public managedElementManager.ManagedElementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return managedElementManager.ManagedElementMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getContainedCurrentTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				terminationPoint.TerminationPointList_THolder _arg3= new terminationPoint.TerminationPointList_THolder();
				terminationPoint.TerminationPointIterator_IHolder _arg4= new terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedCurrentTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // createCrossConnections
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				subnetworkConnection.CrossConnect_T[] _arg1=subnetworkConnection.CrossConnectList_THelper.read(_input);
				subnetworkConnection.CrossConnectList_THolder _arg2= new subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				createCrossConnections(_arg0,_arg1,_arg2);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // getAllManagedElements
			{
			try
			{
				managedElement.ManagedElementList_THolder _arg0= new managedElement.ManagedElementList_THolder();
				_out = handler.createReply();
				getAllManagedElements(_arg0);
				managedElement.ManagedElementList_THelper.write(_out,_arg0.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 3: // getContainedInUseTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getContainedInUseTPNames(_arg0,_arg1,_arg2);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // setUserLabel
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
			case 5: // setAdditionalInfo
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
			case 6: // deleteCrossConnections
			{
			try
			{
				subnetworkConnection.CrossConnect_T[] _arg0=subnetworkConnection.CrossConnectList_THelper.read(_input);
				subnetworkConnection.CrossConnectList_THolder _arg1= new subnetworkConnection.CrossConnectList_THolder();
				subnetworkConnection.CrossConnectList_THolder _arg2= new subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				deleteCrossConnections(_arg0,_arg1,_arg2);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 7: // getContainedPotentialTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				terminationPoint.TerminationPointList_THolder _arg3= new terminationPoint.TerminationPointList_THolder();
				terminationPoint.TerminationPointIterator_IHolder _arg4= new terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedPotentialTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 8: // getContainedInUseTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				terminationPoint.TerminationPointList_THolder _arg3= new terminationPoint.TerminationPointList_THolder();
				terminationPoint.TerminationPointIterator_IHolder _arg4= new terminationPoint.TerminationPointIterator_IHolder();
				_out = handler.createReply();
				getContainedInUseTPs(_arg0,_arg1,_arg2,_arg3,_arg4);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
				terminationPoint.TerminationPointIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // setLocation
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
			case 10: // setTPData
			{
			try
			{
				subnetworkConnection.TPData_T _arg0=subnetworkConnection.TPData_THelper.read(_input);
				terminationPoint.TerminationPoint_THolder _arg1= new terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				setTPData(_arg0,_arg1);
				terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 11: // getAllCrossConnections
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				subnetworkConnection.CrossConnectList_THolder _arg3= new subnetworkConnection.CrossConnectList_THolder();
				subnetworkConnection.CCIterator_IHolder _arg4= new subnetworkConnection.CCIterator_IHolder();
				_out = handler.createReply();
				getAllCrossConnections(_arg0,_arg1,_arg2,_arg3,_arg4);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg3.value);
				subnetworkConnection.CCIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 12: // getTP
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				terminationPoint.TerminationPoint_THolder _arg1= new terminationPoint.TerminationPoint_THolder();
				_out = handler.createReply();
				getTP(_arg0,_arg1);
				terminationPoint.TerminationPoint_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getCapabilities
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
			case 14: // getContainedPotentialTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getContainedPotentialTPNames(_arg0,_arg1,_arg2);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // setNativeEMSName
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
			case 16: // getMECoordinates
			{
			try
			{
				globaldefs.NameAndStringValue_T[][] _arg0=globaldefs.NamingAttributesList_THelper.read(_input);
				managedElement.MECoordinateList_THolder _arg1= new managedElement.MECoordinateList_THolder();
				_out = handler.createReply();
				getMECoordinates(_arg0,_arg1);
				managedElement.MECoordinateList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // getAllManagedElementNames
			{
			try
			{
				globaldefs.NamingAttributesList_THolder _arg0= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getAllManagedElementNames(_arg0);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg0.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // getContainedCurrentTPNames
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				globaldefs.NamingAttributesList_THolder _arg2= new globaldefs.NamingAttributesList_THolder();
				_out = handler.createReply();
				getContainedCurrentTPNames(_arg0,_arg1,_arg2);
				globaldefs.NamingAttributesList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // getMEconfigData
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				java.lang.String[] _arg1=globaldefs.StringList_THelper.read(_input);
				managedElementManager.MEConfigData_THolder _arg2= new managedElementManager.MEConfigData_THolder();
				_out = handler.createReply();
				getMEconfigData(_arg0,_arg1,_arg2);
				managedElementManager.MEConfigData_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // getCrossConnection
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				subnetworkConnection.CrossConnect_THolder _arg1= new subnetworkConnection.CrossConnect_THolder();
				_out = handler.createReply();
				getCrossConnection(_arg0,_arg1);
				subnetworkConnection.CrossConnect_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 21: // setCrossConnections
			{
			try
			{
				subnetworkConnection.CrossConnect_T[] _arg0=subnetworkConnection.CrossConnectList_THelper.read(_input);
				subnetworkConnection.CrossConnect_T[] _arg1=subnetworkConnection.CrossConnectList_THelper.read(_input);
				subnetworkConnection.CrossConnectList_THolder _arg2= new subnetworkConnection.CrossConnectList_THolder();
				subnetworkConnection.CrossConnectList_THolder _arg3= new subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				setCrossConnections(_arg0,_arg1,_arg2,_arg3);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 22: // deactivateCrossConnections
			{
			try
			{
				subnetworkConnection.CrossConnect_T[] _arg0=subnetworkConnection.CrossConnectList_THelper.read(_input);
				subnetworkConnection.CrossConnectList_THolder _arg1= new subnetworkConnection.CrossConnectList_THolder();
				subnetworkConnection.CrossConnectList_THolder _arg2= new subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				deactivateCrossConnections(_arg0,_arg1,_arg2);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 23: // getAllPTPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short[] _arg1=transmissionParameters.LayerRateList_THelper.read(_input);
				short[] _arg2=transmissionParameters.LayerRateList_THelper.read(_input);
				terminationPoint.TerminationPointList_THolder _arg3= new terminationPoint.TerminationPointList_THolder();
				_out = handler.createReply();
				getAllPTPs(_arg0,_arg1,_arg2,_arg3);
				terminationPoint.TerminationPointList_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 24: // getMEClockCoordinates
			{
			try
			{
				globaldefs.NameAndStringValue_T[][] _arg0=globaldefs.NamingAttributesList_THelper.read(_input);
				managedElement.MECoordinateList_THolder _arg1= new managedElement.MECoordinateList_THolder();
				_out = handler.createReply();
				getMEClockCoordinates(_arg0,_arg1);
				managedElement.MECoordinateList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 25: // getManagedElement
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				managedElement.ManagedElement_THolder _arg1= new managedElement.ManagedElement_THolder();
				_out = handler.createReply();
				getManagedElement(_arg0,_arg1);
				managedElement.ManagedElement_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 26: // activateCrossConnections
			{
			try
			{
				subnetworkConnection.CrossConnect_T[] _arg0=subnetworkConnection.CrossConnectList_THelper.read(_input);
				subnetworkConnection.CrossConnectList_THolder _arg1= new subnetworkConnection.CrossConnectList_THolder();
				subnetworkConnection.CrossConnectList_THolder _arg2= new subnetworkConnection.CrossConnectList_THolder();
				_out = handler.createReply();
				activateCrossConnections(_arg0,_arg1,_arg2);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg1.value);
				subnetworkConnection.CrossConnectList_THelper.write(_out,_arg2.value);
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
