package subnetworkConnection;
/**
 * Generated from IDL enum "NetworkRouted_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class NetworkRouted_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _NR_NA = 0;
	public static final NetworkRouted_T NR_NA = new NetworkRouted_T(_NR_NA);
	public static final int _NR_NO = 1;
	public static final NetworkRouted_T NR_NO = new NetworkRouted_T(_NR_NO);
	public static final int _NR_YES = 2;
	public static final NetworkRouted_T NR_YES = new NetworkRouted_T(_NR_YES);
	public int value()
	{
		return value;
	}
	public static NetworkRouted_T from_int(int value)
	{
		switch (value) {
			case _NR_NA: return NR_NA;
			case _NR_NO: return NR_NO;
			case _NR_YES: return NR_YES;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _NR_NA: return "NR_NA";
			case _NR_NO: return "NR_NO";
			case _NR_YES: return "NR_YES";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected NetworkRouted_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
