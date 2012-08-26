package terminationPoint;

/**
 * Generated from IDL alias "TerminationPointList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:23
 */

public final class TerminationPointList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public terminationPoint.TerminationPoint_T[] value;

	public TerminationPointList_THolder ()
	{
	}
	public TerminationPointList_THolder (final terminationPoint.TerminationPoint_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TerminationPointList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TerminationPointList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TerminationPointList_THelper.write (out,value);
	}
}
