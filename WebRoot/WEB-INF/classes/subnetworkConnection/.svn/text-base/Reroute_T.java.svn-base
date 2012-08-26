package subnetworkConnection;
/**
 * Generated from IDL enum "Reroute_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class Reroute_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _RR_NA = 0;
	public static final Reroute_T RR_NA = new Reroute_T(_RR_NA);
	public static final int _RR_NO = 1;
	public static final Reroute_T RR_NO = new Reroute_T(_RR_NO);
	public static final int _RR_YES = 2;
	public static final Reroute_T RR_YES = new Reroute_T(_RR_YES);
	public int value()
	{
		return value;
	}
	public static Reroute_T from_int(int value)
	{
		switch (value) {
			case _RR_NA: return RR_NA;
			case _RR_NO: return RR_NO;
			case _RR_YES: return RR_YES;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _RR_NA: return "RR_NA";
			case _RR_NO: return "RR_NO";
			case _RR_YES: return "RR_YES";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected Reroute_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
