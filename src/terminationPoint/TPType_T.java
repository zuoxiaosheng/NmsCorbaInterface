package terminationPoint;
/**
 * Generated from IDL enum "TPType_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:23
 */

public final class TPType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _TPT_PTP = 0;
	public static final TPType_T TPT_PTP = new TPType_T(_TPT_PTP);
	public static final int _TPT_CTP = 1;
	public static final TPType_T TPT_CTP = new TPType_T(_TPT_CTP);
	public static final int _TPT_TPPool = 2;
	public static final TPType_T TPT_TPPool = new TPType_T(_TPT_TPPool);
	public int value()
	{
		return value;
	}
	public static TPType_T from_int(int value)
	{
		switch (value) {
			case _TPT_PTP: return TPT_PTP;
			case _TPT_CTP: return TPT_CTP;
			case _TPT_TPPool: return TPT_TPPool;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _TPT_PTP: return "TPT_PTP";
			case _TPT_CTP: return "TPT_CTP";
			case _TPT_TPPool: return "TPT_TPPool";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected TPType_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
