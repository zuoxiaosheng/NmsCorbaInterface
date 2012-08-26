package subnetworkConnection;

/**
 * Generated from IDL alias "ResourceList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class ResourceList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public globaldefs.NameAndStringValue_T[][] value;

	public ResourceList_THolder ()
	{
	}
	public ResourceList_THolder (final globaldefs.NameAndStringValue_T[][] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return ResourceList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = ResourceList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		ResourceList_THelper.write (out,value);
	}
}
