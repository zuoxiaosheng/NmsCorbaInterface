package session;


/**
 * Generated from IDL interface "Session_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:36:29
 */

public final class Session_IHelper
{
	public static void insert (final org.omg.CORBA.Any any, final session.Session_I s)
	{
			any.insert_Object(s);
	}
	public static session.Session_I extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static org.omg.CORBA.TypeCode type()
	{
		return org.omg.CORBA.ORB.init().create_interface_tc("IDL:mtnm.tmforum.org/session/Session_I:1.0", "Session_I");
	}
	public static String id()
	{
		return "IDL:mtnm.tmforum.org/session/Session_I:1.0";
	}
	public static Session_I read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(session._Session_IStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final session.Session_I s)
	{
		_out.write_Object(s);
	}
	public static session.Session_I narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof session.Session_I)
		{
			return (session.Session_I)obj;
		}
		else if (obj._is_a("IDL:mtnm.tmforum.org/session/Session_I:1.0"))
		{
			session._Session_IStub stub;
			stub = new session._Session_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static session.Session_I unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof session.Session_I)
		{
			return (session.Session_I)obj;
		}
		else
		{
			session._Session_IStub stub;
			stub = new session._Session_IStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
