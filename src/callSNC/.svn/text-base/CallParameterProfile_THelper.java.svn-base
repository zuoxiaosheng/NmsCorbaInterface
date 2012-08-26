package callSNC;


/**
 * Generated from IDL struct "CallParameterProfile_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class CallParameterProfile_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(callSNC.CallParameterProfile_THelper.id(),"CallParameterProfile_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("severelyDegradedThreshold", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("degradedTreshold", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("classOfService", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("classOfServiceParameters", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final callSNC.CallParameterProfile_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static callSNC.CallParameterProfile_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/callSNC/CallParameterProfile_T:1.0";
	}
	public static callSNC.CallParameterProfile_T read (final org.omg.CORBA.portable.InputStream in)
	{
		callSNC.CallParameterProfile_T result = new callSNC.CallParameterProfile_T();
		result.severelyDegradedThreshold=in.read_string();
		result.degradedTreshold=in.read_string();
		result.classOfService=in.read_string();
		result.classOfServiceParameters = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final callSNC.CallParameterProfile_T s)
	{
		out.write_string(s.severelyDegradedThreshold);
		out.write_string(s.degradedTreshold);
		out.write_string(s.classOfService);
		globaldefs.NVSList_THelper.write(out,s.classOfServiceParameters);
	}
}
