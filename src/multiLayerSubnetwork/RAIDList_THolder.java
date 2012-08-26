package multiLayerSubnetwork;

/**
 * Generated from IDL alias "RAIDList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:02
 */

public final class RAIDList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public java.lang.String[] value;

	public RAIDList_THolder ()
	{
	}
	public RAIDList_THolder (final java.lang.String[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return RAIDList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = RAIDList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		RAIDList_THelper.write (out,value);
	}
}
