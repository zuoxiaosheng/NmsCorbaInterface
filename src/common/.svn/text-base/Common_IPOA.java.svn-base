package common;


/**
 * Generated from IDL interface "Common_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:51
 */

public abstract class Common_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, common.Common_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "setAdditionalInfo", new java.lang.Integer(0));
		m_opsHash.put ( "setNativeEMSName", new java.lang.Integer(1));
		m_opsHash.put ( "setUserLabel", new java.lang.Integer(2));
		m_opsHash.put ( "getCapabilities", new java.lang.Integer(3));
		m_opsHash.put ( "setLocation", new java.lang.Integer(4));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/common/Common_I:1.0"};
	public common.Common_I _this()
	{
		return common.Common_IHelper.narrow(_this_object());
	}
	public common.Common_I _this(org.omg.CORBA.ORB orb)
	{
		return common.Common_IHelper.narrow(_this_object(orb));
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
			case 0: // setAdditionalInfo
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
			case 1: // setNativeEMSName
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
			case 3: // getCapabilities
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
			case 4: // setLocation
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
		}
		return _out;
	}

	public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte[] obj_id)
	{
		return ids;
	}
}
