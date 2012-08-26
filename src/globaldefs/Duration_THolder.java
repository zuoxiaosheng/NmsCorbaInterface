package globaldefs;

/**
 * Generated from IDL struct "Duration_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:57
 */

public final class Duration_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public globaldefs.Duration_T value;

	public Duration_THolder ()
	{
	}
	public Duration_THolder(final globaldefs.Duration_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return globaldefs.Duration_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = globaldefs.Duration_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		globaldefs.Duration_THelper.write(_out, value);
	}
}
