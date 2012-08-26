package subscription;
/**
 * Generated from IDL enum "SubscriptionState_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:51:58
 */

public final class SubscriptionState_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _SS_WORKING = 0;
	public static final SubscriptionState_T SS_WORKING = new SubscriptionState_T(_SS_WORKING);
	public static final int _SS_SUSPEND = 1;
	public static final SubscriptionState_T SS_SUSPEND = new SubscriptionState_T(_SS_SUSPEND);
	public static final int _SS_NO_EXIST = 2;
	public static final SubscriptionState_T SS_NO_EXIST = new SubscriptionState_T(_SS_NO_EXIST);
	public int value()
	{
		return value;
	}
	public static SubscriptionState_T from_int(int value)
	{
		switch (value) {
			case _SS_WORKING: return SS_WORKING;
			case _SS_SUSPEND: return SS_SUSPEND;
			case _SS_NO_EXIST: return SS_NO_EXIST;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _SS_WORKING: return "SS_WORKING";
			case _SS_SUSPEND: return "SS_SUSPEND";
			case _SS_NO_EXIST: return "SS_NO_EXIST";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected SubscriptionState_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
