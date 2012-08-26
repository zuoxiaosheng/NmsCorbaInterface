package callSNC;


/**
 * Generated from IDL struct "SNCAndRoute_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class SNCAndRoute_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(callSNC.SNCAndRoute_THelper.id(),"SNCAndRoute_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("connection", subnetworkConnection.SubnetworkConnection_THelper.type(), null),new org.omg.CORBA.StructMember("connectionRoutes", subnetworkConnection.RouteList_THelper.type(), null),new org.omg.CORBA.StructMember("routeType", callSNC.RouteType_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final callSNC.SNCAndRoute_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static callSNC.SNCAndRoute_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/callSNC/SNCAndRoute_T:1.0";
	}
	public static callSNC.SNCAndRoute_T read (final org.omg.CORBA.portable.InputStream in)
	{
		callSNC.SNCAndRoute_T result = new callSNC.SNCAndRoute_T();
		result.connection=subnetworkConnection.SubnetworkConnection_THelper.read(in);
		result.connectionRoutes = subnetworkConnection.RouteList_THelper.read(in);
		result.routeType=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final callSNC.SNCAndRoute_T s)
	{
		subnetworkConnection.SubnetworkConnection_THelper.write(out,s.connection);
		subnetworkConnection.RouteList_THelper.write(out,s.connectionRoutes);
		out.write_string(s.routeType);
	}
}
