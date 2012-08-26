package terminationPoint;
/**
 * Generated from IDL enum "TPConnectionState_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:23
 */

public final class TPConnectionState_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _TPCS_NA = 0;
	public static final TPConnectionState_T TPCS_NA = new TPConnectionState_T(_TPCS_NA);
	public static final int _TPCS_SOURCE_CONNECTED = 1;
	public static final TPConnectionState_T TPCS_SOURCE_CONNECTED = new TPConnectionState_T(_TPCS_SOURCE_CONNECTED);
	public static final int _TPCS_SINK_CONNECTED = 2;
	public static final TPConnectionState_T TPCS_SINK_CONNECTED = new TPConnectionState_T(_TPCS_SINK_CONNECTED);
	public static final int _TPCS_BI_CONNECTED = 3;
	public static final TPConnectionState_T TPCS_BI_CONNECTED = new TPConnectionState_T(_TPCS_BI_CONNECTED);
	public static final int _TPCS_NOT_CONNECTED = 4;
	public static final TPConnectionState_T TPCS_NOT_CONNECTED = new TPConnectionState_T(_TPCS_NOT_CONNECTED);
	public int value()
	{
		return value;
	}
	public static TPConnectionState_T from_int(int value)
	{
		switch (value) {
			case _TPCS_NA: return TPCS_NA;
			case _TPCS_SOURCE_CONNECTED: return TPCS_SOURCE_CONNECTED;
			case _TPCS_SINK_CONNECTED: return TPCS_SINK_CONNECTED;
			case _TPCS_BI_CONNECTED: return TPCS_BI_CONNECTED;
			case _TPCS_NOT_CONNECTED: return TPCS_NOT_CONNECTED;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _TPCS_NA: return "TPCS_NA";
			case _TPCS_SOURCE_CONNECTED: return "TPCS_SOURCE_CONNECTED";
			case _TPCS_SINK_CONNECTED: return "TPCS_SINK_CONNECTED";
			case _TPCS_BI_CONNECTED: return "TPCS_BI_CONNECTED";
			case _TPCS_NOT_CONNECTED: return "TPCS_NOT_CONNECTED";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected TPConnectionState_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
