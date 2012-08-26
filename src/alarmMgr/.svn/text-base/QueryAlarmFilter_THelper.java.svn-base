package alarmMgr;


/**
 * Generated from IDL struct "QueryAlarmFilter_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:46
 */

public final class QueryAlarmFilter_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(alarmMgr.QueryAlarmFilter_THelper.id(),"QueryAlarmFilter_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("alarmSourceSelect", globaldefs.NamingAttributesList_THelper.type(), null),new org.omg.CORBA.StructMember("alarmTypeSelect", alarmMgr.AlarmTypeList_THelper.type(), null),new org.omg.CORBA.StructMember("perceivedSeveritySelect", alarmMgr.PerceivedSeverityList_THelper.type(), null),new org.omg.CORBA.StructMember("probableCauseSelect", alarmMgr.ProbableCauseList_THelper.type(), null),new org.omg.CORBA.StructMember("raiseTimeDuration", globaldefs.Duration_THelper.type(), null),new org.omg.CORBA.StructMember("clearTimeDuration", globaldefs.Duration_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final alarmMgr.QueryAlarmFilter_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static alarmMgr.QueryAlarmFilter_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/alarmMgr/QueryAlarmFilter_T:1.0";
	}
	public static alarmMgr.QueryAlarmFilter_T read (final org.omg.CORBA.portable.InputStream in)
	{
		alarmMgr.QueryAlarmFilter_T result = new alarmMgr.QueryAlarmFilter_T();
		result.alarmSourceSelect = globaldefs.NamingAttributesList_THelper.read(in);
		result.alarmTypeSelect = alarmMgr.AlarmTypeList_THelper.read(in);
		result.perceivedSeveritySelect = alarmMgr.PerceivedSeverityList_THelper.read(in);
		result.probableCauseSelect = alarmMgr.ProbableCauseList_THelper.read(in);
		result.raiseTimeDuration=globaldefs.Duration_THelper.read(in);
		result.clearTimeDuration=globaldefs.Duration_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final alarmMgr.QueryAlarmFilter_T s)
	{
		globaldefs.NamingAttributesList_THelper.write(out,s.alarmSourceSelect);
		alarmMgr.AlarmTypeList_THelper.write(out,s.alarmTypeSelect);
		alarmMgr.PerceivedSeverityList_THelper.write(out,s.perceivedSeveritySelect);
		alarmMgr.ProbableCauseList_THelper.write(out,s.probableCauseSelect);
		globaldefs.Duration_THelper.write(out,s.raiseTimeDuration);
		globaldefs.Duration_THelper.write(out,s.clearTimeDuration);
	}
}
