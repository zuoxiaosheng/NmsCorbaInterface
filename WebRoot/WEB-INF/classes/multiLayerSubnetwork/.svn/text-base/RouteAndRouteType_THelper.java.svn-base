package multiLayerSubnetwork;


/**
 * Generated from IDL struct "RouteAndRouteType_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:02
 */

public final class RouteAndRouteType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(multiLayerSubnetwork.RouteAndRouteType_THelper.id(),"RouteAndRouteType_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("rAIDList", multiLayerSubnetwork.RAIDList_THelper.type(), null),new org.omg.CORBA.StructMember("routeType", callSNC.RouteType_THelper.type(), null),new org.omg.CORBA.StructMember("RouteDescription", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final multiLayerSubnetwork.RouteAndRouteType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static multiLayerSubnetwork.RouteAndRouteType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/multiLayerSubnetwork/RouteAndRouteType_T:1.0";
	}
	public static multiLayerSubnetwork.RouteAndRouteType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		multiLayerSubnetwork.RouteAndRouteType_T result = new multiLayerSubnetwork.RouteAndRouteType_T();
		result.rAIDList = multiLayerSubnetwork.RAIDList_THelper.read(in);
		result.routeType=in.read_string();
		result.RouteDescription=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final multiLayerSubnetwork.RouteAndRouteType_T s)
	{
		multiLayerSubnetwork.RAIDList_THelper.write(out,s.rAIDList);
		out.write_string(s.routeType);
		out.write_string(s.RouteDescription);
	}
}
