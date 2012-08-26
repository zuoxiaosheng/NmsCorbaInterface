package performance;

/**
 * Generated from IDL alias "PMTPSelectList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMTPSelectList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public performance.PMTPSelect_T[] value;

	public PMTPSelectList_THolder ()
	{
	}
	public PMTPSelectList_THolder (final performance.PMTPSelect_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMTPSelectList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMTPSelectList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMTPSelectList_THelper.write (out,value);
	}
}
