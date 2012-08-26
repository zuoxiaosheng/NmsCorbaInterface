package performance;
/**
 * Generated from IDL enum "PMMonitorOrReportStatus_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMMonitorOrReportStatus_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public PMMonitorOrReportStatus_T value;

	public PMMonitorOrReportStatus_THolder ()
	{
	}
	public PMMonitorOrReportStatus_THolder (final PMMonitorOrReportStatus_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMMonitorOrReportStatus_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMMonitorOrReportStatus_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMMonitorOrReportStatus_THelper.write (out,value);
	}
}
