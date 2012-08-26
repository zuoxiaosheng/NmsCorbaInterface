package terminationPoint;
/**
 * Generated from IDL enum "TPProtectionAssociation_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:23
 */

public final class TPProtectionAssociation_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _TPPA_NA = 0;
	public static final TPProtectionAssociation_T TPPA_NA = new TPProtectionAssociation_T(_TPPA_NA);
	public static final int _TPPA_PSR_RELATED = 1;
	public static final TPProtectionAssociation_T TPPA_PSR_RELATED = new TPProtectionAssociation_T(_TPPA_PSR_RELATED);
	public int value()
	{
		return value;
	}
	public static TPProtectionAssociation_T from_int(int value)
	{
		switch (value) {
			case _TPPA_NA: return TPPA_NA;
			case _TPPA_PSR_RELATED: return TPPA_PSR_RELATED;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _TPPA_NA: return "TPPA_NA";
			case _TPPA_PSR_RELATED: return "TPPA_PSR_RELATED";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected TPProtectionAssociation_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
