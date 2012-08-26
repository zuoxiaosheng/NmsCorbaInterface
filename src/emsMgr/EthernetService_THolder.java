package emsMgr;

/**
 * Generated from IDL struct "EthernetService_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public final class EthernetService_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public emsMgr.EthernetService_T value;

	public EthernetService_THolder ()
	{
	}
	public EthernetService_THolder(final emsMgr.EthernetService_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return emsMgr.EthernetService_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = emsMgr.EthernetService_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		emsMgr.EthernetService_THelper.write(_out, value);
	}
}
