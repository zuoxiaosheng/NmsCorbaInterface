package notifications;
/**
 * Generated from IDL enum "AlarmTypeQualifier_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:05
 */

public final class AlarmTypeQualifier_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _ALARM = 0;
	public static final AlarmTypeQualifier_T ALARM = new AlarmTypeQualifier_T(_ALARM);
	public static final int _TCA = 1;
	public static final AlarmTypeQualifier_T TCA = new AlarmTypeQualifier_T(_TCA);
	public int value()
	{
		return value;
	}
	public static AlarmTypeQualifier_T from_int(int value)
	{
		switch (value) {
			case _ALARM: return ALARM;
			case _TCA: return TCA;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _ALARM: return "ALARM";
			case _TCA: return "TCA";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected AlarmTypeQualifier_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
