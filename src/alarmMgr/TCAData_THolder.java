package alarmMgr;

/**
 * Generated from IDL struct "TCAData_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:46
 */

public final class TCAData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public alarmMgr.TCAData_T value;

	public TCAData_THolder ()
	{
	}
	public TCAData_THolder(final alarmMgr.TCAData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return alarmMgr.TCAData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = alarmMgr.TCAData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		alarmMgr.TCAData_THelper.write(_out, value);
	}
}
