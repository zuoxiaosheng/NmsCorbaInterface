package emsMgr;

/**
 * Generated from IDL struct "RPRNodeStatus_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public final class RPRNodeStatus_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public emsMgr.RPRNodeStatus_T value;

	public RPRNodeStatus_THolder ()
	{
	}
	public RPRNodeStatus_THolder(final emsMgr.RPRNodeStatus_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return emsMgr.RPRNodeStatus_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = emsMgr.RPRNodeStatus_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		emsMgr.RPRNodeStatus_THelper.write(_out, value);
	}
}
