package performance;

/**
 * Generated from IDL alias "PMThresholdList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMThresholdList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public performance.PMThreshold_T[] value;

	public PMThresholdList_THolder ()
	{
	}
	public PMThresholdList_THolder (final performance.PMThreshold_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMThresholdList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMThresholdList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMThresholdList_THelper.write (out,value);
	}
}
