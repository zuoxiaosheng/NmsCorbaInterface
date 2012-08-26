package globaldefs;

/**
 * Generated from IDL alias "NamingAttributesMultipleList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:57
 */

public final class NamingAttributesMultipleList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public globaldefs.NameAndStringValue_T[][][] value;

	public NamingAttributesMultipleList_THolder ()
	{
	}
	public NamingAttributesMultipleList_THolder (final globaldefs.NameAndStringValue_T[][][] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return NamingAttributesMultipleList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NamingAttributesMultipleList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		NamingAttributesMultipleList_THelper.write (out,value);
	}
}
