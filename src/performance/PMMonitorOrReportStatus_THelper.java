package performance;
/**
 * Generated from IDL enum "PMMonitorOrReportStatus_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMMonitorOrReportStatus_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(performance.PMMonitorOrReportStatus_THelper.id(),"PMMonitorOrReportStatus_T",new String[]{"Locked","Unlocked"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final performance.PMMonitorOrReportStatus_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static performance.PMMonitorOrReportStatus_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMMonitorOrReportStatus_T:1.0";
	}
	public static PMMonitorOrReportStatus_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return PMMonitorOrReportStatus_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final PMMonitorOrReportStatus_T s)
	{
		out.write_long(s.value());
	}
}
