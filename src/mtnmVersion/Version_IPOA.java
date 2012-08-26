package mtnmVersion;


/**
 * Generated from IDL interface "Version_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:36:23
 */

public abstract class Version_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, mtnmVersion.Version_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getVersion", new java.lang.Integer(0));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/mtnmVersion/Version_I:1.0"};
	public mtnmVersion.Version_I _this()
	{
		return mtnmVersion.Version_IHelper.narrow(_this_object());
	}
	public mtnmVersion.Version_I _this(org.omg.CORBA.ORB orb)
	{
		return mtnmVersion.Version_IHelper.narrow(_this_object(orb));
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
			case 0: // getVersion
			{
				_out = handler.createReply();
				_out.write_string(getVersion());
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
