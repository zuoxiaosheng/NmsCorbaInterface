package subnetworkConnection;
/**
 * Generated from IDL enum "GradesOfImpact_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class GradesOfImpact_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _GOI_HITLESS = 0;
	public static final GradesOfImpact_T GOI_HITLESS = new GradesOfImpact_T(_GOI_HITLESS);
	public static final int _GOI_MINOR_IMPACT = 1;
	public static final GradesOfImpact_T GOI_MINOR_IMPACT = new GradesOfImpact_T(_GOI_MINOR_IMPACT);
	public static final int _GOI_MAJOR_IMPACT = 2;
	public static final GradesOfImpact_T GOI_MAJOR_IMPACT = new GradesOfImpact_T(_GOI_MAJOR_IMPACT);
	public int value()
	{
		return value;
	}
	public static GradesOfImpact_T from_int(int value)
	{
		switch (value) {
			case _GOI_HITLESS: return GOI_HITLESS;
			case _GOI_MINOR_IMPACT: return GOI_MINOR_IMPACT;
			case _GOI_MAJOR_IMPACT: return GOI_MAJOR_IMPACT;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _GOI_HITLESS: return "GOI_HITLESS";
			case _GOI_MINOR_IMPACT: return "GOI_MINOR_IMPACT";
			case _GOI_MAJOR_IMPACT: return "GOI_MAJOR_IMPACT";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected GradesOfImpact_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
