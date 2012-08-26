package managedElement;

/**
 * Generated from IDL struct "TCInfo_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:58
 */

public final class TCInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public managedElement.TCInfo_T value;

	public TCInfo_THolder ()
	{
	}
	public TCInfo_THolder(final managedElement.TCInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return managedElement.TCInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = managedElement.TCInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		managedElement.TCInfo_THelper.write(_out, value);
	}
}
