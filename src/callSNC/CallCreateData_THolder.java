package callSNC;

/**
 * Generated from IDL struct "CallCreateData_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class CallCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public callSNC.CallCreateData_T value;

	public CallCreateData_THolder ()
	{
	}
	public CallCreateData_THolder(final callSNC.CallCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return callSNC.CallCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = callSNC.CallCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		callSNC.CallCreateData_THelper.write(_out, value);
	}
}
