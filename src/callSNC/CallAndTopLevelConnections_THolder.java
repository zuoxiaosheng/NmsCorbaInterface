package callSNC;

/**
 * Generated from IDL struct "CallAndTopLevelConnections_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class CallAndTopLevelConnections_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public callSNC.CallAndTopLevelConnections_T value;

	public CallAndTopLevelConnections_THolder ()
	{
	}
	public CallAndTopLevelConnections_THolder(final callSNC.CallAndTopLevelConnections_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return callSNC.CallAndTopLevelConnections_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = callSNC.CallAndTopLevelConnections_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		callSNC.CallAndTopLevelConnections_THelper.write(_out, value);
	}
}
