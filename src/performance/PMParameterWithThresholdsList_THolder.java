package performance;

/**
 * Generated from IDL alias "PMParameterWithThresholdsList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMParameterWithThresholdsList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public performance.PMParameterWithThresholds_T[] value;

	public PMParameterWithThresholdsList_THolder ()
	{
	}
	public PMParameterWithThresholdsList_THolder (final performance.PMParameterWithThresholds_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PMParameterWithThresholdsList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PMParameterWithThresholdsList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PMParameterWithThresholdsList_THelper.write (out,value);
	}
}
