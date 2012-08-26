package emsMgr;

/**
 * Generated from IDL alias "VBList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public final class VBList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public emsMgr.VB_T[] value;

	public VBList_THolder ()
	{
	}
	public VBList_THolder (final emsMgr.VB_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return VBList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = VBList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		VBList_THelper.write (out,value);
	}
}
