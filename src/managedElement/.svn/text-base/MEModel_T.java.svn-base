package managedElement;
/**
 * Generated from IDL enum "MEModel_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:58
 */

public final class MEModel_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _MM_VIRTUAL = 0;
	public static final MEModel_T MM_VIRTUAL = new MEModel_T(_MM_VIRTUAL);
	public static final int _MM_PHYSICA = 1;
	public static final MEModel_T MM_PHYSICA = new MEModel_T(_MM_PHYSICA);
	public static final int _MM_LOGICAL = 2;
	public static final MEModel_T MM_LOGICAL = new MEModel_T(_MM_LOGICAL);
	public int value()
	{
		return value;
	}
	public static MEModel_T from_int(int value)
	{
		switch (value) {
			case _MM_VIRTUAL: return MM_VIRTUAL;
			case _MM_PHYSICA: return MM_PHYSICA;
			case _MM_LOGICAL: return MM_LOGICAL;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _MM_VIRTUAL: return "MM_VIRTUAL";
			case _MM_PHYSICA: return "MM_PHYSICA";
			case _MM_LOGICAL: return "MM_LOGICAL";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected MEModel_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
