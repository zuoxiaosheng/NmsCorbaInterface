package notifications;

/**
 * Generated from IDL struct "TCAId_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:05
 */

public final class TCAId_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public notifications.TCAId_T value;

	public TCAId_THolder ()
	{
	}
	public TCAId_THolder(final notifications.TCAId_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return notifications.TCAId_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = notifications.TCAId_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		notifications.TCAId_THelper.write(_out, value);
	}
}
