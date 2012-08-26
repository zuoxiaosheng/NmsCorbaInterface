package emsSession;

/**
 * Generated from IDL interface "EmsSession_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:07
 */

public final class EmsSession_IHolder	implements org.omg.CORBA.portable.Streamable{
	 public EmsSession_I value;
	public EmsSession_IHolder()
	{
	}
	public EmsSession_IHolder (final EmsSession_I initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return EmsSession_IHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = EmsSession_IHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		EmsSession_IHelper.write (_out,value);
	}
}
