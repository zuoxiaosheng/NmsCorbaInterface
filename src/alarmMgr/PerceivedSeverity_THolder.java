package alarmMgr;
/**
 * Generated from IDL enum "PerceivedSeverity_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:46
 */

public final class PerceivedSeverity_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public PerceivedSeverity_T value;

	public PerceivedSeverity_THolder ()
	{
	}
	public PerceivedSeverity_THolder (final PerceivedSeverity_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return PerceivedSeverity_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = PerceivedSeverity_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		PerceivedSeverity_THelper.write (out,value);
	}
}
