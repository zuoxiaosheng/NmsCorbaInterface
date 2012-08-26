package performance;

/**
 * Generated from IDL alias "PMPList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMPList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public performance.PMP_T[] value;

	public PMPList_THolder ()
	{
	}
	public PMPList_THolder (final performance.PMP_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMPList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMPList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMPList_THelper.write (out,value);
	}
}
