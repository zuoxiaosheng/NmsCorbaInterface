package callSNC;

/**
 * Generated from IDL struct "Call_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class Call_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public callSNC.Call_T value;

	public Call_THolder ()
	{
	}
	public Call_THolder(final callSNC.Call_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return callSNC.Call_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = callSNC.Call_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		callSNC.Call_THelper.write(_out, value);
	}
}
