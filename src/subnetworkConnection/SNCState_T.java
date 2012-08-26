package subnetworkConnection;
/**
 * Generated from IDL enum "SNCState_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class SNCState_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _SNCS_NONEXISTENT = 0;
	public static final SNCState_T SNCS_NONEXISTENT = new SNCState_T(_SNCS_NONEXISTENT);
	public static final int _SNCS_PENDING = 1;
	public static final SNCState_T SNCS_PENDING = new SNCState_T(_SNCS_PENDING);
	public static final int _SNCS_ACTIVE = 2;
	public static final SNCState_T SNCS_ACTIVE = new SNCState_T(_SNCS_ACTIVE);
	public static final int _SNCS_PARTIAL = 3;
	public static final SNCState_T SNCS_PARTIAL = new SNCState_T(_SNCS_PARTIAL);
	public int value()
	{
		return value;
	}
	public static SNCState_T from_int(int value)
	{
		switch (value) {
			case _SNCS_NONEXISTENT: return SNCS_NONEXISTENT;
			case _SNCS_PENDING: return SNCS_PENDING;
			case _SNCS_ACTIVE: return SNCS_ACTIVE;
			case _SNCS_PARTIAL: return SNCS_PARTIAL;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _SNCS_NONEXISTENT: return "SNCS_NONEXISTENT";
			case _SNCS_PENDING: return "SNCS_PENDING";
			case _SNCS_ACTIVE: return "SNCS_ACTIVE";
			case _SNCS_PARTIAL: return "SNCS_PARTIAL";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected SNCState_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
