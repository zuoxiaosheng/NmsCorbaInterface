package subnetworkConnection;

/**
 * Generated from IDL alias "TPDataList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class TPDataList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public subnetworkConnection.TPData_T[] value;

	public TPDataList_THolder ()
	{
	}
	public TPDataList_THolder (final subnetworkConnection.TPData_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TPDataList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TPDataList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TPDataList_THelper.write (out,value);
	}
}
