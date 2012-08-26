package aSAP;


/**
 * Generated from IDL struct "ASAPCreateModifyData_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:48
 */

public final class ASAPCreateModifyData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(aSAP.ASAPCreateModifyData_THelper.id(),"ASAPCreateModifyData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("userLabel", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("forceUniqueness", org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(8)), null),new org.omg.CORBA.StructMember("owner", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("alarmSeverityAssignmentList", aSAP.AlarmSeverityAssignmentList_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final aSAP.ASAPCreateModifyData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static aSAP.ASAPCreateModifyData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/aSAP/ASAPCreateModifyData_T:1.0";
	}
	public static aSAP.ASAPCreateModifyData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		aSAP.ASAPCreateModifyData_T result = new aSAP.ASAPCreateModifyData_T();
		result.userLabel=in.read_string();
		result.forceUniqueness=in.read_boolean();
		result.owner=in.read_string();
		result.alarmSeverityAssignmentList = aSAP.AlarmSeverityAssignmentList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final aSAP.ASAPCreateModifyData_T s)
	{
		out.write_string(s.userLabel);
		out.write_boolean(s.forceUniqueness);
		out.write_string(s.owner);
		aSAP.AlarmSeverityAssignmentList_THelper.write(out,s.alarmSeverityAssignmentList);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
