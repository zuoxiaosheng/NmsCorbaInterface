package subnetworkConnection;

/**
 * Generated from IDL alias "RouteList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class RouteList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public subnetworkConnection.RouteDescriptor_T[] value;

	public RouteList_THolder ()
	{
	}
	public RouteList_THolder (final subnetworkConnection.RouteDescriptor_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RouteList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RouteList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RouteList_THelper.write (out,value);
	}
}
