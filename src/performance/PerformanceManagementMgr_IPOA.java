package performance;


/**
 * Generated from IDL interface "PerformanceManagementMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public abstract class PerformanceManagementMgr_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, performance.PerformanceManagementMgr_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getAllPMPs", new java.lang.Integer(0));
		m_opsHash.put ( "enablePMData", new java.lang.Integer(1));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(2));
		m_opsHash.put ( "getAllPMCollectionPlan", new java.lang.Integer(3));
		m_opsHash.put ( "getAllCurrentPMData", new java.lang.Integer(4));
		m_opsHash.put ( "queryPMCollectionPlan", new java.lang.Integer(5));
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(6));
		m_opsHash.put ( "setLocation", new java.lang.Integer(7));
		m_opsHash.put ( "setPMCollectionPlan", new java.lang.Integer(8));
		m_opsHash.put ( "clearPMCollectionPlan", new java.lang.Integer(9));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(10));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(11));
		m_opsHash.put ( "setTCATPParameter", new java.lang.Integer(12));
		m_opsHash.put ( "getAllCurrentPMDataByCond", new java.lang.Integer(13));
		m_opsHash.put ( "disablePMData", new java.lang.Integer(14));
		m_opsHash.put ( "getTCATPParameter", new java.lang.Integer(15));
		m_opsHash.put ( "changePMCollectionPlan", new java.lang.Integer(16));
		m_opsHash.put ( "clearSpecificPMData", new java.lang.Integer(17));
		m_opsHash.put ( "getTPHistoryPMData", new java.lang.Integer(18));
		m_opsHash.put ( "clearPMData", new java.lang.Integer(19));
		m_opsHash.put ( "getHistoryPMData", new java.lang.Integer(20));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/performance/PerformanceManagementMgr_I:1.0","IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public performance.PerformanceManagementMgr_I _this()
	{
		return performance.PerformanceManagementMgr_IHelper.narrow(_this_object());
	}
	public performance.PerformanceManagementMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return performance.PerformanceManagementMgr_IHelper.narrow(_this_object(orb));
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
			case 0: // getAllPMPs
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				performance.PMPList_THolder _arg2= new performance.PMPList_THolder();
				performance.PMPIterator_IHolder _arg3= new performance.PMPIterator_IHolder();
				_out = handler.createReply();
				getAllPMPs(_arg0,_arg1,_arg2,_arg3);
				performance.PMPList_THelper.write(_out,_arg2.value);
				performance.PMPIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // enablePMData
			{
			try
			{
				performance.PMTPSelect_T[] _arg0=performance.PMTPSelectList_THelper.read(_input);
				performance.PMTPSelectList_THolder _arg1= new performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				enablePMData(_arg0,_arg1);
				performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 2: // setUserLabel
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
			case 3: // getAllPMCollectionPlan
			{
			try
			{
				performance.PMTaskList_THolder _arg0= new performance.PMTaskList_THolder();
				_out = handler.createReply();
				getAllPMCollectionPlan(_arg0);
				performance.PMTaskList_THelper.write(_out,_arg0.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 4: // getAllCurrentPMData
			{
			try
			{
				performance.PMTPSelect_T[] _arg0=performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg1=performance.PMParameterNameList_THelper.read(_input);
				int _arg2=_input.read_ulong();
				performance.PMDataList_THolder _arg3= new performance.PMDataList_THolder();
				performance.PMDataIterator_IHolder _arg4= new performance.PMDataIterator_IHolder();
				_out = handler.createReply();
				getAllCurrentPMData(_arg0,_arg1,_arg2,_arg3,_arg4);
				performance.PMDataList_THelper.write(_out,_arg3.value);
				performance.PMDataIterator_IHelper.write(_out,_arg4.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 5: // queryPMCollectionPlan
			{
			try
			{
				int _arg0=_input.read_long();
				performance.PMCollectionPlanList_THolder _arg1= new performance.PMCollectionPlanList_THolder();
				_out = handler.createReply();
				queryPMCollectionPlan(_arg0,_arg1);
				performance.PMCollectionPlanList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 6: // setAdditionalInfo
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
			case 7: // setLocation
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
			case 8: // setPMCollectionPlan
			{
			try
			{
				performance.PMCollectionPlan_T[] _arg0=performance.PMCollectionPlanList_THelper.read(_input);
				org.omg.CORBA.IntHolder _arg1= new org.omg.CORBA.IntHolder();
				_out = handler.createReply();
				setPMCollectionPlan(_arg0,_arg1);
				_out.write_long(_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 9: // clearPMCollectionPlan
			{
			try
			{
				int _arg0=_input.read_long();
				_out = handler.createReply();
				clearPMCollectionPlan(_arg0);
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
			case 11: // setNativeEMSName
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
			case 12: // setTCATPParameter
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				performance.TCAParameters_THolder _arg1= new performance.TCAParameters_THolder();
				_arg1._read (_input);
				_out = handler.createReply();
				setTCATPParameter(_arg0,_arg1);
				performance.TCAParameters_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 13: // getAllCurrentPMDataByCond
			{
			try
			{
				performance.PMTPParamSelect_T[] _arg0=performance.PMTPParamSelectList_THelper.read(_input);
				int _arg1=_input.read_ulong();
				performance.PMData_THolder _arg2= new performance.PMData_THolder();
				performance.PMDataIterator_IHolder _arg3= new performance.PMDataIterator_IHolder();
				_out = handler.createReply();
				getAllCurrentPMDataByCond(_arg0,_arg1,_arg2,_arg3);
				performance.PMData_THelper.write(_out,_arg2.value);
				performance.PMDataIterator_IHelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 14: // disablePMData
			{
			try
			{
				performance.PMTPSelect_T[] _arg0=performance.PMTPSelectList_THelper.read(_input);
				performance.PMTPSelectList_THolder _arg1= new performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				disablePMData(_arg0,_arg1);
				performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 15: // getTCATPParameter
			{
			try
			{
				globaldefs.NameAndStringValue_T[] _arg0=globaldefs.NVSList_THelper.read(_input);
				short _arg1=_input.read_short();
				java.lang.String _arg2=_input.read_string();
				performance.TCAParameters_THolder _arg3= new performance.TCAParameters_THolder();
				_out = handler.createReply();
				getTCATPParameter(_arg0,_arg1,_arg2,_arg3);
				performance.TCAParameters_THelper.write(_out,_arg3.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 16: // changePMCollectionPlan
			{
			try
			{
				int _arg0=_input.read_long();
				performance.PMCollectionPlan_T[] _arg1=performance.PMCollectionPlanList_THelper.read(_input);
				_out = handler.createReply();
				changePMCollectionPlan(_arg0,_arg1);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 17: // clearSpecificPMData
			{
			try
			{
				performance.PMTPParamSelect_T[] _arg0=performance.PMTPParamSelectList_THelper.read(_input);
				performance.PMTPParamSelectList_THolder _arg1= new performance.PMTPParamSelectList_THolder();
				_out = handler.createReply();
				clearSpecificPMData(_arg0,_arg1);
				performance.PMTPParamSelectList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 18: // getTPHistoryPMData
			{
			try
			{
				performance.PMTPSelect_T[] _arg0=performance.PMTPSelectList_THelper.read(_input);
				java.lang.String[] _arg1=performance.PMParameterNameList_THelper.read(_input);
				java.lang.String _arg2=_input.read_string();
				java.lang.String _arg3=_input.read_string();
				int _arg4=_input.read_ulong();
				performance.PMDataList_THolder _arg5= new performance.PMDataList_THolder();
				performance.PMDataIterator_IHolder _arg6= new performance.PMDataIterator_IHolder();
				_out = handler.createReply();
				getTPHistoryPMData(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
				performance.PMDataList_THelper.write(_out,_arg5.value);
				performance.PMDataIterator_IHelper.write(_out,_arg6.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 19: // clearPMData
			{
			try
			{
				performance.PMTPSelect_T[] _arg0=performance.PMTPSelectList_THelper.read(_input);
				performance.PMTPSelectList_THolder _arg1= new performance.PMTPSelectList_THolder();
				_out = handler.createReply();
				clearPMData(_arg0,_arg1);
				performance.PMTPSelectList_THelper.write(_out,_arg1.value);
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 20: // getHistoryPMData
			{
			try
			{
				java.lang.String _arg0=_input.read_string();
				java.lang.String _arg1=_input.read_string();
				java.lang.String _arg2=_input.read_string();
				performance.PMTPParamSelect_T[] _arg3=performance.PMTPParamSelectList_THelper.read(_input);
				java.lang.String _arg4=_input.read_string();
				java.lang.String _arg5=_input.read_string();
				boolean _arg6=_input.read_boolean();
				_out = handler.createReply();
				getHistoryPMData(_arg0,_arg1,_arg2,_arg3,_arg4,_arg5,_arg6);
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
