package managedElement;
/**
 * Generated from IDL enum "MEModel_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:58
 */

public final class MEModel_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public MEModel_T value;

	public MEModel_THolder ()
	{
	}
	public MEModel_THolder (final MEModel_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return MEModel_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = MEModel_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		MEModel_THelper.write (out,value);
	}
}
