package emsMgr;
/**
 * Generated from IDL enum "EthernetServiceType_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public final class EthernetServiceType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _EST_EPL = 0;
	public static final EthernetServiceType_T EST_EPL = new EthernetServiceType_T(_EST_EPL);
	public static final int _EST_EVPL = 1;
	public static final EthernetServiceType_T EST_EVPL = new EthernetServiceType_T(_EST_EVPL);
	public static final int _EST_EPLAN = 2;
	public static final EthernetServiceType_T EST_EPLAN = new EthernetServiceType_T(_EST_EPLAN);
	public static final int _EST_EVPLAN = 3;
	public static final EthernetServiceType_T EST_EVPLAN = new EthernetServiceType_T(_EST_EVPLAN);
	public int value()
	{
		return value;
	}
	public static EthernetServiceType_T from_int(int value)
	{
		switch (value) {
			case _EST_EPL: return EST_EPL;
			case _EST_EVPL: return EST_EVPL;
			case _EST_EPLAN: return EST_EPLAN;
			case _EST_EVPLAN: return EST_EVPLAN;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _EST_EPL: return "EST_EPL";
			case _EST_EVPL: return "EST_EVPL";
			case _EST_EPLAN: return "EST_EPLAN";
			case _EST_EVPLAN: return "EST_EVPLAN";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected EthernetServiceType_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
