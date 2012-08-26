package performance;


/**
 * Generated from IDL struct "PMCollectionPlan_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMCollectionPlan_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(performance.PMCollectionPlan_THelper.id(),"PMCollectionPlan_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", performance.PMTPSelect_THelper.type(), null),new org.omg.CORBA.StructMember("beginTime", globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("endTime", globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("reportInterval", globaldefs.Time_THelper.type(), null),new org.omg.CORBA.StructMember("pMParameterList", performance.PMParameterList_THelper.type(), null),new org.omg.CORBA.StructMember("pmMonitorStatus", performance.PMMonitorOrReportStatus_THelper.type(), null),new org.omg.CORBA.StructMember("pmReportStatus", performance.PMMonitorOrReportStatus_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final performance.PMCollectionPlan_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static performance.PMCollectionPlan_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMCollectionPlan_T:1.0";
	}
	public static performance.PMCollectionPlan_T read (final org.omg.CORBA.portable.InputStream in)
	{
		performance.PMCollectionPlan_T result = new performance.PMCollectionPlan_T();
		result.name=performance.PMTPSelect_THelper.read(in);
		result.beginTime=in.read_string();
		result.endTime=in.read_string();
		result.reportInterval=in.read_string();
		result.pMParameterList = performance.PMParameterList_THelper.read(in);
		result.pmMonitorStatus=performance.PMMonitorOrReportStatus_THelper.read(in);
		result.pmReportStatus=performance.PMMonitorOrReportStatus_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final performance.PMCollectionPlan_T s)
	{
		performance.PMTPSelect_THelper.write(out,s.name);
		out.write_string(s.beginTime);
		out.write_string(s.endTime);
		out.write_string(s.reportInterval);
		performance.PMParameterList_THelper.write(out,s.pMParameterList);
		performance.PMMonitorOrReportStatus_THelper.write(out,s.pmMonitorStatus);
		performance.PMMonitorOrReportStatus_THelper.write(out,s.pmReportStatus);
	}
}
