package performance;

/**
 * Generated from IDL alias "PMDataList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public performance.PMData_T[] value;

	public PMDataList_THolder ()
	{
	}
	public PMDataList_THolder (final performance.PMData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMDataList_THelper.write (out,value);
	}
}
