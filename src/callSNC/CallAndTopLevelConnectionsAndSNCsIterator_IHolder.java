package callSNC;

/**
 * Generated from IDL interface "CallAndTopLevelConnectionsAndSNCsIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class CallAndTopLevelConnectionsAndSNCsIterator_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public CallAndTopLevelConnectionsAndSNCsIterator_I value;
	public CallAndTopLevelConnectionsAndSNCsIterator_IHolder()
	{
	}
	public CallAndTopLevelConnectionsAndSNCsIterator_IHolder (final CallAndTopLevelConnectionsAndSNCsIterator_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CallAndTopLevelConnectionsAndSNCsIterator_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CallAndTopLevelConnectionsAndSNCsIterator_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CallAndTopLevelConnectionsAndSNCsIterator_IHelper.write (_out,value);
	}
}
