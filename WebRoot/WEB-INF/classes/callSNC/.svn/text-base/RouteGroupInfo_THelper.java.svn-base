package callSNC;


/**
 * Generated from IDL struct "RouteGroupInfo_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class RouteGroupInfo_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(callSNC.RouteGroupInfo_THelper.id(),"RouteGroupInfo_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("sNCname", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("routeGroupLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final callSNC.RouteGroupInfo_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static callSNC.RouteGroupInfo_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/callSNC/RouteGroupInfo_T:1.0";
	}
	public static callSNC.RouteGroupInfo_T read (final org.omg.CORBA.portable.InputStream in)
	{
		callSNC.RouteGroupInfo_T result = new callSNC.RouteGroupInfo_T();
		result.sNCname = globaldefs.NVSList_THelper.read(in);
		result.routeGroupLabel=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final callSNC.RouteGroupInfo_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.sNCname);
		out.write_string(s.routeGroupLabel);
	}
}
