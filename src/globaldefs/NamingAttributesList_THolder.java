package globaldefs;

/**
 * Generated from IDL alias "NamingAttributesList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:57
 */

public final class NamingAttributesList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public globaldefs.NameAndStringValue_T[][] value;

	public NamingAttributesList_THolder ()
	{
	}
	public NamingAttributesList_THolder (final globaldefs.NameAndStringValue_T[][] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NamingAttributesList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NamingAttributesList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NamingAttributesList_THelper.write (out,value);
	}
}
