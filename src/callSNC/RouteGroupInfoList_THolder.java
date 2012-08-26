package callSNC;

/**
 * Generated from IDL alias "RouteGroupInfoList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class RouteGroupInfoList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public callSNC.RouteGroupInfo_T[] value;

	public RouteGroupInfoList_THolder ()
	{
	}
	public RouteGroupInfoList_THolder (final callSNC.RouteGroupInfo_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RouteGroupInfoList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RouteGroupInfoList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RouteGroupInfoList_THelper.write (out,value);
	}
}
