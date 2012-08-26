package performance;
/**
 * Generated from IDL enum "PMMonitorOrReportStatus_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMMonitorOrReportStatus_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _Locked = 0;
	public static final PMMonitorOrReportStatus_T Locked = new PMMonitorOrReportStatus_T(_Locked);
	public static final int _Unlocked = 1;
	public static final PMMonitorOrReportStatus_T Unlocked = new PMMonitorOrReportStatus_T(_Unlocked);
	public int value()
	{
		return value;
	}
	public static PMMonitorOrReportStatus_T from_int(int value)
	{
		switch (value) {
			case _Locked: return Locked;
			case _Unlocked: return Unlocked;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _Locked: return "Locked";
			case _Unlocked: return "Unlocked";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected PMMonitorOrReportStatus_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
