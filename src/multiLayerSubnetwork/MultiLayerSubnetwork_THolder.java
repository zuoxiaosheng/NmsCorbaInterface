package multiLayerSubnetwork;

/**
 * Generated from IDL struct "MultiLayerSubnetwork_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:02
 */

public final class MultiLayerSubnetwork_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public multiLayerSubnetwork.MultiLayerSubnetwork_T value;

	public MultiLayerSubnetwork_THolder ()
	{
	}
	public MultiLayerSubnetwork_THolder(final multiLayerSubnetwork.MultiLayerSubnetwork_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return multiLayerSubnetwork.MultiLayerSubnetwork_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = multiLayerSubnetwork.MultiLayerSubnetwork_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		multiLayerSubnetwork.MultiLayerSubnetwork_THelper.write(_out, value);
	}
}
