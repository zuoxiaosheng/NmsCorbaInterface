package performance;

/**
 * Generated from IDL struct "PMThreshold_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMThreshold_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public performance.PMThreshold_T value;

	public PMThreshold_THolder ()
	{
	}
	public PMThreshold_THolder(final performance.PMThreshold_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return performance.PMThreshold_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = performance.PMThreshold_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		performance.PMThreshold_THelper.write(_out, value);
	}
}
