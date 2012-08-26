package aSAP;


/**
 * Generated from IDL struct "AlarmSeverityAssignment_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:48
 */

public final class AlarmSeverityAssignment_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(aSAP.AlarmSeverityAssignment_THelper.id(),"AlarmSeverityAssignment_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("probableCause", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("probableCauseQualifier", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("nativeProbableCause", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("serviceAffecting", aSAP.AssignedSeverity_THelper.type(), null),new org.omg.CORBA.StructMember("serviceNonAffecting", aSAP.AssignedSeverity_THelper.type(), null),new org.omg.CORBA.StructMember("serviceIndependentOrUnknown", aSAP.AssignedSeverity_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final aSAP.AlarmSeverityAssignment_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static aSAP.AlarmSeverityAssignment_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/aSAP/AlarmSeverityAssignment_T:1.0";
	}
	public static aSAP.AlarmSeverityAssignment_T read (final org.omg.CORBA.portable.InputStream in)
	{
		aSAP.AlarmSeverityAssignment_T result = new aSAP.AlarmSeverityAssignment_T();
		result.probableCause=in.read_string();
		result.probableCauseQualifier=in.read_string();
		result.nativeProbableCause=in.read_string();
		result.serviceAffecting=aSAP.AssignedSeverity_THelper.read(in);
		result.serviceNonAffecting=aSAP.AssignedSeverity_THelper.read(in);
		result.serviceIndependentOrUnknown=aSAP.AssignedSeverity_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final aSAP.AlarmSeverityAssignment_T s)
	{
		out.write_string(s.probableCause);
		out.write_string(s.probableCauseQualifier);
		out.write_string(s.nativeProbableCause);
		aSAP.AssignedSeverity_THelper.write(out,s.serviceAffecting);
		aSAP.AssignedSeverity_THelper.write(out,s.serviceNonAffecting);
		aSAP.AssignedSeverity_THelper.write(out,s.serviceIndependentOrUnknown);
	}
}
