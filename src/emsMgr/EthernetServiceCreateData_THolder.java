package emsMgr;

/**
 * Generated from IDL struct "EthernetServiceCreateData_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public final class EthernetServiceCreateData_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public emsMgr.EthernetServiceCreateData_T value;

	public EthernetServiceCreateData_THolder ()
	{
	}
	public EthernetServiceCreateData_THolder(final emsMgr.EthernetServiceCreateData_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return emsMgr.EthernetServiceCreateData_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = emsMgr.EthernetServiceCreateData_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		emsMgr.EthernetServiceCreateData_THelper.write(_out, value);
	}
}
