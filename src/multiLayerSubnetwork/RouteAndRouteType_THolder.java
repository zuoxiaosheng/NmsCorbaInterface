package multiLayerSubnetwork;

/**
 * Generated from IDL struct "RouteAndRouteType_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:02
 */

public final class RouteAndRouteType_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public multiLayerSubnetwork.RouteAndRouteType_T value;

	public RouteAndRouteType_THolder ()
	{
	}
	public RouteAndRouteType_THolder(final multiLayerSubnetwork.RouteAndRouteType_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return multiLayerSubnetwork.RouteAndRouteType_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = multiLayerSubnetwork.RouteAndRouteType_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		multiLayerSubnetwork.RouteAndRouteType_THelper.write(_out, value);
	}
}
