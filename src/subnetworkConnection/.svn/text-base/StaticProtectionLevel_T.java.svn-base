package subnetworkConnection;
/**
 * Generated from IDL enum "StaticProtectionLevel_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class StaticProtectionLevel_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _PREEMPTIBLE = 0;
	public static final StaticProtectionLevel_T PREEMPTIBLE = new StaticProtectionLevel_T(_PREEMPTIBLE);
	public static final int _UNPROTECTED = 1;
	public static final StaticProtectionLevel_T UNPROTECTED = new StaticProtectionLevel_T(_UNPROTECTED);
	public static final int _PARTIALLY_PROTECTED = 2;
	public static final StaticProtectionLevel_T PARTIALLY_PROTECTED = new StaticProtectionLevel_T(_PARTIALLY_PROTECTED);
	public static final int _FULLY_PROTECTED = 3;
	public static final StaticProtectionLevel_T FULLY_PROTECTED = new StaticProtectionLevel_T(_FULLY_PROTECTED);
	public static final int _HIGHLY_PROTECTED = 4;
	public static final StaticProtectionLevel_T HIGHLY_PROTECTED = new StaticProtectionLevel_T(_HIGHLY_PROTECTED);
	public int value()
	{
		return value;
	}
	public static StaticProtectionLevel_T from_int(int value)
	{
		switch (value) {
			case _PREEMPTIBLE: return PREEMPTIBLE;
			case _UNPROTECTED: return UNPROTECTED;
			case _PARTIALLY_PROTECTED: return PARTIALLY_PROTECTED;
			case _FULLY_PROTECTED: return FULLY_PROTECTED;
			case _HIGHLY_PROTECTED: return HIGHLY_PROTECTED;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _PREEMPTIBLE: return "PREEMPTIBLE";
			case _UNPROTECTED: return "UNPROTECTED";
			case _PARTIALLY_PROTECTED: return "PARTIALLY_PROTECTED";
			case _FULLY_PROTECTED: return "FULLY_PROTECTED";
			case _HIGHLY_PROTECTED: return "HIGHLY_PROTECTED";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected StaticProtectionLevel_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
