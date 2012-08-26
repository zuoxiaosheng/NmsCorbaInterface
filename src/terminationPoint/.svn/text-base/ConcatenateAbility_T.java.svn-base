package terminationPoint;
/**
 * Generated from IDL enum "ConcatenateAbility_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:23
 */

public final class ConcatenateAbility_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _CA_NOT = 0;
	public static final ConcatenateAbility_T CA_NOT = new ConcatenateAbility_T(_CA_NOT);
	public static final int _CA_STANDARD = 1;
	public static final ConcatenateAbility_T CA_STANDARD = new ConcatenateAbility_T(_CA_STANDARD);
	public static final int _CA_CONTINUAL = 2;
	public static final ConcatenateAbility_T CA_CONTINUAL = new ConcatenateAbility_T(_CA_CONTINUAL);
	public int value()
	{
		return value;
	}
	public static ConcatenateAbility_T from_int(int value)
	{
		switch (value) {
			case _CA_NOT: return CA_NOT;
			case _CA_STANDARD: return CA_STANDARD;
			case _CA_CONTINUAL: return CA_CONTINUAL;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _CA_NOT: return "CA_NOT";
			case _CA_STANDARD: return "CA_STANDARD";
			case _CA_CONTINUAL: return "CA_CONTINUAL";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ConcatenateAbility_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
