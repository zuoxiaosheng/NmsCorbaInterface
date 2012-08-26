package transmissionParameters;

/**
 * Generated from IDL alias "LayerRateList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:13
 */

public final class LayerRateList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public short[] value;

	public LayerRateList_THolder ()
	{
	}
	public LayerRateList_THolder (final short[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return LayerRateList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = LayerRateList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		LayerRateList_THelper.write (out,value);
	}
}
