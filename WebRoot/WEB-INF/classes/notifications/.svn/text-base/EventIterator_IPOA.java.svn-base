package notifications;


/**
 * Generated from IDL interface "EventIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:05
 */

public abstract class EventIterator_IPOA
	extends org.omg.PortableServer.Servant
	implements org.omg.CORBA.portable.InvokeHandler, notifications.EventIterator_IOperations
{
	static private final java.util.Hashtable m_opsHash = new java.util.Hashtable();
	static
	{
		m_opsHash.put ( "getLength", new java.lang.Integer(0));
		m_opsHash.put ( "destroy", new java.lang.Integer(1));
	}
	private String[] ids = {"IDL:mtnm.tmforum.org/notifications/EventIterator_I:1.0"};
	public notifications.EventIterator_I _this()
	{
		return notifications.EventIterator_IHelper.narrow(_this_object());
	}
	public notifications.EventIterator_I _this(org.omg.CORBA.ORB orb)
	{
		return notifications.EventIterator_IHelper.narrow(_this_object(orb));
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
			case 0: // getLength
			{
			try
			{
				_out = handler.createReply();
				_out.write_ulong(getLength());
			}
			catch(globaldefs.ProcessingFailureException _ex0)
			{
				_out = handler.createExceptionReply();
				globaldefs.ProcessingFailureExceptionHelper.write(_out, _ex0);
			}
				break;
			}
			case 1: // destroy
			{
			try
			{
				_out = handler.createReply();
				destroy();
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
