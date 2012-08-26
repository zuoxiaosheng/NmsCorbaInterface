package multiLayerSubnetwork;

/**
 * Generated from IDL struct "TopoMember_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:02
 */

public final class TopoMember_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public multiLayerSubnetwork.TopoMember_T value;

	public TopoMember_THolder ()
	{
	}
	public TopoMember_THolder(final multiLayerSubnetwork.TopoMember_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return multiLayerSubnetwork.TopoMember_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = multiLayerSubnetwork.TopoMember_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		multiLayerSubnetwork.TopoMember_THelper.write(_out, value);
	}
}
