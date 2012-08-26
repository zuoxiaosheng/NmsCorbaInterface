package emsMgr;

/**
 * Generated from IDL alias "TransmissionRouteList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public final class TransmissionRouteList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public emsMgr.TransmissionRoute_T[] value;

	public TransmissionRouteList_THolder ()
	{
	}
	public TransmissionRouteList_THolder (final emsMgr.TransmissionRoute_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TransmissionRouteList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TransmissionRouteList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TransmissionRouteList_THelper.write (out,value);
	}
}
