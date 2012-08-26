package emsMgr;

/**
 * Generated from IDL struct "VLAN_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public final class VLAN_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public emsMgr.VLAN_T value;

	public VLAN_THolder ()
	{
	}
	public VLAN_THolder(final emsMgr.VLAN_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return emsMgr.VLAN_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = emsMgr.VLAN_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		emsMgr.VLAN_THelper.write(_out, value);
	}
}
