package alarmMgr;


/**
 * Generated from IDL struct "TCAData_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:46
 */

public final class TCAData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(alarmMgr.TCAData_THelper.id(),"TCAData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("alarmSource", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("alarmDetectInfo", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("granularity", performance.Granularity_THelper.type(), null),new org.omg.CORBA.StructMember("pmParameter", performance.PMParameter_THelper.type(), null),new org.omg.CORBA.StructMember("performanceValue", performance.PMMeasurement_THelper.type(), null),new org.omg.CORBA.StructMember("thresholdValue", performance.PMMeasurement_THelper.type(), null),new org.omg.CORBA.StructMember("thresholdType", performance.PMThresholdType_THelper.type(), null),new org.omg.CORBA.StructMember("perceivedSeverity", alarmMgr.PerceivedSeverity_THelper.type(), null),new org.omg.CORBA.StructMember("layerRate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("raiseTime", globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("clearTime", globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NamingAttributesList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final alarmMgr.TCAData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static alarmMgr.TCAData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/alarmMgr/TCAData_T:1.0";
	}
	public static alarmMgr.TCAData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		alarmMgr.TCAData_T result = new alarmMgr.TCAData_T();
		result.alarmSource = globaldefs.NVSList_THelper.read(in);
		result.alarmDetectInfo = globaldefs.NVSList_THelper.read(in);
		result.granularity=in.read_string();
		result.pmParameter=in.read_string();
		result.performanceValue=performance.PMMeasurement_THelper.read(in);
		result.thresholdValue=performance.PMMeasurement_THelper.read(in);
		result.thresholdType=performance.PMThresholdType_THelper.read(in);
		result.perceivedSeverity=alarmMgr.PerceivedSeverity_THelper.read(in);
		result.layerRate=in.read_short();
		result.raiseTime=in.read_string();
		result.clearTime=in.read_string();
		result.additionalInfo = globaldefs.NamingAttributesList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final alarmMgr.TCAData_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.alarmSource);
		globaldefs.NVSList_THelper.write(out,s.alarmDetectInfo);
		out.write_string(s.granularity);
		out.write_string(s.pmParameter);
		performance.PMMeasurement_THelper.write(out,s.performanceValue);
		performance.PMMeasurement_THelper.write(out,s.thresholdValue);
		performance.PMThresholdType_THelper.write(out,s.thresholdType);
		alarmMgr.PerceivedSeverity_THelper.write(out,s.perceivedSeverity);
		out.write_short(s.layerRate);
		out.write_string(s.raiseTime);
		out.write_string(s.clearTime);
		globaldefs.NamingAttributesList_THelper.write(out,s.additionalInfo);
	}
}
