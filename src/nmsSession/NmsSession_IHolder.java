package nmsSession;

/**
 * Generated from IDL interface "NmsSession_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:36:26
 */

public final class NmsSession_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public NmsSession_I value;
	public NmsSession_IHolder()
	{
	}
	public NmsSession_IHolder (final NmsSession_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return NmsSession_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = NmsSession_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		NmsSession_IHelper.write (_out,value);
	}
}
