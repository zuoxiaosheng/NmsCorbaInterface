package callSNC;


/**
 * Generated from IDL struct "CallModifyData_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class CallModifyData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(callSNC.CallModifyData_THelper.id(),"CallModifyData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("additionalModificationInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final callSNC.CallModifyData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static callSNC.CallModifyData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/callSNC/CallModifyData_T:1.0";
	}
	public static callSNC.CallModifyData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		callSNC.CallModifyData_T result = new callSNC.CallModifyData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.networkAccessDomain=in.read_string();
		result.additionalModificationInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final callSNC.CallModifyData_T s)
	{
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		out.write_string(s.networkAccessDomain);
		globaldefs.NVSList_THelper.write(out,s.additionalModificationInfo);
	}
}
