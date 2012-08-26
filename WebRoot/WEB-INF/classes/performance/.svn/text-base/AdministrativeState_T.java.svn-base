package performance;
/**
 * Generated from IDL enum "AdministrativeState_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class AdministrativeState_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _AS_Locked = 0;
	public static final AdministrativeState_T AS_Locked = new AdministrativeState_T(_AS_Locked);
	public static final int _AS_Unlocked = 1;
	public static final AdministrativeState_T AS_Unlocked = new AdministrativeState_T(_AS_Unlocked);
	public int value()
	{
		return value;
	}
	public static AdministrativeState_T from_int(int value)
	{
		switch (value) {
			case _AS_Locked: return AS_Locked;
			case _AS_Unlocked: return AS_Unlocked;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _AS_Locked: return "AS_Locked";
			case _AS_Unlocked: return "AS_Unlocked";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected AdministrativeState_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
