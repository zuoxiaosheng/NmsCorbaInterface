package managedElement;
/**
 * Generated from IDL enum "TCCapability_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:58
 */

public final class TCCapability_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _TCC_NA = 0;
	public static final TCCapability_T TCC_NA = new TCCapability_T(_TCC_NA);
	public static final int _TCC_4x4 = 1;
	public static final TCCapability_T TCC_4x4 = new TCCapability_T(_TCC_4x4);
	public static final int _TCC_8x8 = 2;
	public static final TCCapability_T TCC_8x8 = new TCCapability_T(_TCC_8x8);
	public static final int _TCC_16x16 = 3;
	public static final TCCapability_T TCC_16x16 = new TCCapability_T(_TCC_16x16);
	public static final int _TCC_32x32 = 4;
	public static final TCCapability_T TCC_32x32 = new TCCapability_T(_TCC_32x32);
	public static final int _TCC_64x64 = 5;
	public static final TCCapability_T TCC_64x64 = new TCCapability_T(_TCC_64x64);
	public static final int _TCC_128x128 = 6;
	public static final TCCapability_T TCC_128x128 = new TCCapability_T(_TCC_128x128);
	public int value()
	{
		return value;
	}
	public static TCCapability_T from_int(int value)
	{
		switch (value) {
			case _TCC_NA: return TCC_NA;
			case _TCC_4x4: return TCC_4x4;
			case _TCC_8x8: return TCC_8x8;
			case _TCC_16x16: return TCC_16x16;
			case _TCC_32x32: return TCC_32x32;
			case _TCC_64x64: return TCC_64x64;
			case _TCC_128x128: return TCC_128x128;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _TCC_NA: return "TCC_NA";
			case _TCC_4x4: return "TCC_4x4";
			case _TCC_8x8: return "TCC_8x8";
			case _TCC_16x16: return "TCC_16x16";
			case _TCC_32x32: return "TCC_32x32";
			case _TCC_64x64: return "TCC_64x64";
			case _TCC_128x128: return "TCC_128x128";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected TCCapability_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
