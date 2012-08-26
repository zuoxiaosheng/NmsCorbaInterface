package subnetworkConnection;


/**
 * Generated from IDL struct "RouteCreateData_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class RouteCreateData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(subnetworkConnection.RouteCreateData_THelper.id(),"RouteCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("intended", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("exclusive", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("ccInclusions", subnetworkConnection.CrossConnectList_THelper.type(), null),new org.omg.CORBA.StructMember("neTpInclusions", subnetworkConnection.ResourceList_THelper.type(), null),new org.omg.CORBA.StructMember("fullRoute", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("neTpSncExclusions", subnetworkConnection.ResourceList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalCreationInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final subnetworkConnection.RouteCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static subnetworkConnection.RouteCreateData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/RouteCreateData_T:1.0";
	}
	public static subnetworkConnection.RouteCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		subnetworkConnection.RouteCreateData_T result = new subnetworkConnection.RouteCreateData_T();
		result.intended=in.read_string();
		result.exclusive=in.read_string();
		result.ccInclusions = subnetworkConnection.CrossConnectList_THelper.read(in);
		result.neTpInclusions = subnetworkConnection.ResourceList_THelper.read(in);
		result.fullRoute=in.read_boolean();
		result.neTpSncExclusions = subnetworkConnection.ResourceList_THelper.read(in);
		result.additionalCreationInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final subnetworkConnection.RouteCreateData_T s)
	{
		out.write_string(s.intended);
		out.write_string(s.exclusive);
		subnetworkConnection.CrossConnectList_THelper.write(out,s.ccInclusions);
		subnetworkConnection.ResourceList_THelper.write(out,s.neTpInclusions);
		out.write_boolean(s.fullRoute);
		subnetworkConnection.ResourceList_THelper.write(out,s.neTpSncExclusions);
		globaldefs.NVSList_THelper.write(out,s.additionalCreationInfo);
	}
}
