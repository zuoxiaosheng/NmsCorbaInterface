package emsMgr;

/**
 * Generated from IDL struct "LogicalPort_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public final class LogicalPort_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public emsMgr.LogicalPort_T value;

	public LogicalPort_THolder ()
	{
	}
	public LogicalPort_THolder(final emsMgr.LogicalPort_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return emsMgr.LogicalPort_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = emsMgr.LogicalPort_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		emsMgr.LogicalPort_THelper.write(_out, value);
	}
}
