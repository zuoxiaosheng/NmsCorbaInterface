package alarmMgr;
/**
 * Generated from IDL enum "PerceivedSeverity_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:46
 */

public final class PerceivedSeverity_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _PS_INDETERMINATE = 0;
	public static final PerceivedSeverity_T PS_INDETERMINATE = new PerceivedSeverity_T(_PS_INDETERMINATE);
	public static final int _PS_CRITICAL = 1;
	public static final PerceivedSeverity_T PS_CRITICAL = new PerceivedSeverity_T(_PS_CRITICAL);
	public static final int _PS_MAJOR = 2;
	public static final PerceivedSeverity_T PS_MAJOR = new PerceivedSeverity_T(_PS_MAJOR);
	public static final int _PS_MINOR = 3;
	public static final PerceivedSeverity_T PS_MINOR = new PerceivedSeverity_T(_PS_MINOR);
	public static final int _PS_WARNING = 4;
	public static final PerceivedSeverity_T PS_WARNING = new PerceivedSeverity_T(_PS_WARNING);
	public static final int _PS_CLEARED = 5;
	public static final PerceivedSeverity_T PS_CLEARED = new PerceivedSeverity_T(_PS_CLEARED);
	public int value()
	{
		return value;
	}
	public static PerceivedSeverity_T from_int(int value)
	{
		switch (value) {
			case _PS_INDETERMINATE: return PS_INDETERMINATE;
			case _PS_CRITICAL: return PS_CRITICAL;
			case _PS_MAJOR: return PS_MAJOR;
			case _PS_MINOR: return PS_MINOR;
			case _PS_WARNING: return PS_WARNING;
			case _PS_CLEARED: return PS_CLEARED;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _PS_INDETERMINATE: return "PS_INDETERMINATE";
			case _PS_CRITICAL: return "PS_CRITICAL";
			case _PS_MAJOR: return "PS_MAJOR";
			case _PS_MINOR: return "PS_MINOR";
			case _PS_WARNING: return "PS_WARNING";
			case _PS_CLEARED: return "PS_CLEARED";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected PerceivedSeverity_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
