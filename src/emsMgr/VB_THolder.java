package emsMgr;

/**
 * Generated from IDL struct "VB_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public final class VB_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public emsMgr.VB_T value;

	public VB_THolder ()
	{
	}
	public VB_THolder(final emsMgr.VB_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return emsMgr.VB_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = emsMgr.VB_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		emsMgr.VB_THelper.write(_out, value);
	}
}
