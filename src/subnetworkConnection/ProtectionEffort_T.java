package subnetworkConnection;
/**
 * Generated from IDL enum "ProtectionEffort_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class ProtectionEffort_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _EFFORT_WHATEVER = 0;
	public static final ProtectionEffort_T EFFORT_WHATEVER = new ProtectionEffort_T(_EFFORT_WHATEVER);
	public static final int _EFFORT_SAME_OR_BETTER = 1;
	public static final ProtectionEffort_T EFFORT_SAME_OR_BETTER = new ProtectionEffort_T(_EFFORT_SAME_OR_BETTER);
	public static final int _EFFORT_SAME_OR_WORSE = 2;
	public static final ProtectionEffort_T EFFORT_SAME_OR_WORSE = new ProtectionEffort_T(_EFFORT_SAME_OR_WORSE);
	public static final int _EFFORT_SAME = 3;
	public static final ProtectionEffort_T EFFORT_SAME = new ProtectionEffort_T(_EFFORT_SAME);
	public int value()
	{
		return value;
	}
	public static ProtectionEffort_T from_int(int value)
	{
		switch (value) {
			case _EFFORT_WHATEVER: return EFFORT_WHATEVER;
			case _EFFORT_SAME_OR_BETTER: return EFFORT_SAME_OR_BETTER;
			case _EFFORT_SAME_OR_WORSE: return EFFORT_SAME_OR_WORSE;
			case _EFFORT_SAME: return EFFORT_SAME;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _EFFORT_WHATEVER: return "EFFORT_WHATEVER";
			case _EFFORT_SAME_OR_BETTER: return "EFFORT_SAME_OR_BETTER";
			case _EFFORT_SAME_OR_WORSE: return "EFFORT_SAME_OR_WORSE";
			case _EFFORT_SAME: return "EFFORT_SAME";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ProtectionEffort_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
