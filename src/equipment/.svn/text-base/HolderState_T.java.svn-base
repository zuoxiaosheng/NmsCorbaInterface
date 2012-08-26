package equipment;
/**
 * Generated from IDL enum "HolderState_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:09
 */

public final class HolderState_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _EMPTY = 0;
	public static final HolderState_T EMPTY = new HolderState_T(_EMPTY);
	public static final int _INSTALLED_AND_EXPECTED = 1;
	public static final HolderState_T INSTALLED_AND_EXPECTED = new HolderState_T(_INSTALLED_AND_EXPECTED);
	public static final int _EXPECTED_AND_NOT_INSTALLED = 2;
	public static final HolderState_T EXPECTED_AND_NOT_INSTALLED = new HolderState_T(_EXPECTED_AND_NOT_INSTALLED);
	public static final int _INSTALLED_AND_NOT_EXPECTED = 3;
	public static final HolderState_T INSTALLED_AND_NOT_EXPECTED = new HolderState_T(_INSTALLED_AND_NOT_EXPECTED);
	public static final int _MISMATCH_OF_INSTALLED_AND_EXPECTED = 4;
	public static final HolderState_T MISMATCH_OF_INSTALLED_AND_EXPECTED = new HolderState_T(_MISMATCH_OF_INSTALLED_AND_EXPECTED);
	public static final int _UNAVAILABLE = 5;
	public static final HolderState_T UNAVAILABLE = new HolderState_T(_UNAVAILABLE);
	public static final int _UNKNOWN = 6;
	public static final HolderState_T UNKNOWN = new HolderState_T(_UNKNOWN);
	public int value()
	{
		return value;
	}
	public static HolderState_T from_int(int value)
	{
		switch (value) {
			case _EMPTY: return EMPTY;
			case _INSTALLED_AND_EXPECTED: return INSTALLED_AND_EXPECTED;
			case _EXPECTED_AND_NOT_INSTALLED: return EXPECTED_AND_NOT_INSTALLED;
			case _INSTALLED_AND_NOT_EXPECTED: return INSTALLED_AND_NOT_EXPECTED;
			case _MISMATCH_OF_INSTALLED_AND_EXPECTED: return MISMATCH_OF_INSTALLED_AND_EXPECTED;
			case _UNAVAILABLE: return UNAVAILABLE;
			case _UNKNOWN: return UNKNOWN;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _EMPTY: return "EMPTY";
			case _INSTALLED_AND_EXPECTED: return "INSTALLED_AND_EXPECTED";
			case _EXPECTED_AND_NOT_INSTALLED: return "EXPECTED_AND_NOT_INSTALLED";
			case _INSTALLED_AND_NOT_EXPECTED: return "INSTALLED_AND_NOT_EXPECTED";
			case _MISMATCH_OF_INSTALLED_AND_EXPECTED: return "MISMATCH_OF_INSTALLED_AND_EXPECTED";
			case _UNAVAILABLE: return "UNAVAILABLE";
			case _UNKNOWN: return "UNKNOWN";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected HolderState_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
