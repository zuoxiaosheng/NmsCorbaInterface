package subnetworkConnection;


/**
 * Generated from IDL struct "RouteNameAndAdminState_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class RouteNameAndAdminState_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(subnetworkConnection.RouteNameAndAdminState_THelper.id(),"RouteNameAndAdminState_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("id", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("administrativeState", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final subnetworkConnection.RouteNameAndAdminState_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static subnetworkConnection.RouteNameAndAdminState_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/RouteNameAndAdminState_T:1.0";
	}
	public static subnetworkConnection.RouteNameAndAdminState_T read (final org.omg.CORBA.portable.InputStream in)
	{
		subnetworkConnection.RouteNameAndAdminState_T result = new subnetworkConnection.RouteNameAndAdminState_T();
		result.id=in.read_string();
		result.administrativeState=in.read_string();
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final subnetworkConnection.RouteNameAndAdminState_T s)
	{
		out.write_string(s.id);
		out.write_string(s.administrativeState);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
