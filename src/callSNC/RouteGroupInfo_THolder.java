package callSNC;

/**
 * Generated from IDL struct "RouteGroupInfo_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class RouteGroupInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public callSNC.RouteGroupInfo_T value;

	public RouteGroupInfo_THolder ()
	{
	}
	public RouteGroupInfo_THolder(final callSNC.RouteGroupInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return callSNC.RouteGroupInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = callSNC.RouteGroupInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		callSNC.RouteGroupInfo_THelper.write(_out, value);
	}
}
