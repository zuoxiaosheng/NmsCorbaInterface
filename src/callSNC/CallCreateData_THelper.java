package callSNC;


/**
 * Generated from IDL struct "CallCreateData_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class CallCreateData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(callSNC.CallCreateData_THelper.id(),"CallCreateData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("callName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("networkAccessDomain", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("aEnd", callSNC.CallEnd_THelper.type(), null),new org.omg.CORBA.StructMember("zEnd", callSNC.CallEnd_THelper.type(), null),new org.omg.CORBA.StructMember("callParameters", callSNC.CallParameterProfile_THelper.type(), null),new org.omg.CORBA.StructMember("callDiversity", callSNC.Diversity_THelper.type(), null),new org.omg.CORBA.StructMember("additionalCreationInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final callSNC.CallCreateData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static callSNC.CallCreateData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/callSNC/CallCreateData_T:1.0";
	}
	public static callSNC.CallCreateData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		callSNC.CallCreateData_T result = new callSNC.CallCreateData_T();
		result.callName = globaldefs.NVSList_THelper.read(in);
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.networkAccessDomain=in.read_string();
		result.aEnd=callSNC.CallEnd_THelper.read(in);
		result.zEnd=callSNC.CallEnd_THelper.read(in);
		result.callParameters=callSNC.CallParameterProfile_THelper.read(in);
		result.callDiversity=callSNC.Diversity_THelper.read(in);
		result.additionalCreationInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final callSNC.CallCreateData_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.callName);
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		out.write_string(s.networkAccessDomain);
		callSNC.CallEnd_THelper.write(out,s.aEnd);
		callSNC.CallEnd_THelper.write(out,s.zEnd);
		callSNC.CallParameterProfile_THelper.write(out,s.callParameters);
		callSNC.Diversity_THelper.write(out,s.callDiversity);
		globaldefs.NVSList_THelper.write(out,s.additionalCreationInfo);
	}
}
