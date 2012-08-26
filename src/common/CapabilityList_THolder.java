package common;

/**
 * Generated from IDL alias "CapabilityList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:51
 */

public final class CapabilityList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public globaldefs.NameAndStringValue_T[] value;

	public CapabilityList_THolder ()
	{
	}
	public CapabilityList_THolder (final globaldefs.NameAndStringValue_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return CapabilityList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CapabilityList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		CapabilityList_THelper.write (out,value);
	}
}
