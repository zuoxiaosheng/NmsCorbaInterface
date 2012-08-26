package callSNC;

/**
 * Generated from IDL struct "CallParameterProfile_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class CallParameterProfile_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public callSNC.CallParameterProfile_T value;

	public CallParameterProfile_THolder ()
	{
	}
	public CallParameterProfile_THolder(final callSNC.CallParameterProfile_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return callSNC.CallParameterProfile_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = callSNC.CallParameterProfile_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		callSNC.CallParameterProfile_THelper.write(_out, value);
	}
}
