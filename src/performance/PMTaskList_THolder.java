package performance;

/**
 * Generated from IDL alias "PMTaskList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMTaskList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public performance.PMTask_T[] value;

	public PMTaskList_THolder ()
	{
	}
	public PMTaskList_THolder (final performance.PMTask_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMTaskList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMTaskList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMTaskList_THelper.write (out,value);
	}
}
