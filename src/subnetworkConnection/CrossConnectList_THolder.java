package subnetworkConnection;

/**
 * Generated from IDL alias "CrossConnectList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class CrossConnectList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public subnetworkConnection.CrossConnect_T[] value;

	public CrossConnectList_THolder ()
	{
	}
	public CrossConnectList_THolder (final subnetworkConnection.CrossConnect_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CrossConnectList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CrossConnectList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CrossConnectList_THelper.write (out,value);
	}
}
