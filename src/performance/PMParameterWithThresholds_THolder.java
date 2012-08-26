package performance;

/**
 * Generated from IDL struct "PMParameterWithThresholds_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMParameterWithThresholds_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public performance.PMParameterWithThresholds_T value;

	public PMParameterWithThresholds_THolder ()
	{
	}
	public PMParameterWithThresholds_THolder(final performance.PMParameterWithThresholds_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return performance.PMParameterWithThresholds_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = performance.PMParameterWithThresholds_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		performance.PMParameterWithThresholds_THelper.write(_out, value);
	}
}
