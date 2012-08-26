package callSNC;

/**
 * Generated from IDL alias "SharedResourceList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class SharedResourceList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public callSNC.SharedResource_T[] value;

	public SharedResourceList_THolder ()
	{
	}
	public SharedResourceList_THolder (final callSNC.SharedResource_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return SharedResourceList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = SharedResourceList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		SharedResourceList_THelper.write (out,value);
	}
}
