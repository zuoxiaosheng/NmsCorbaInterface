package multiLayerSubnetwork;

/**
 * Generated from IDL alias "RoutePerRouteType_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:02
 */

public final class RoutePerRouteType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public multiLayerSubnetwork.RouteAndRouteType_T[] value;

	public RoutePerRouteType_THolder ()
	{
	}
	public RoutePerRouteType_THolder (final multiLayerSubnetwork.RouteAndRouteType_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RoutePerRouteType_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RoutePerRouteType_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RoutePerRouteType_THelper.write (out,value);
	}
}
