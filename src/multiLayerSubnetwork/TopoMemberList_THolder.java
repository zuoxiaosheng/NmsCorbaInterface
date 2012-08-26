package multiLayerSubnetwork;

/**
 * Generated from IDL alias "TopoMemberList_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:02
 */

public final class TopoMemberList_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public multiLayerSubnetwork.TopoMember_T[] value;

	public TopoMemberList_THolder ()
	{
	}
	public TopoMemberList_THolder (final multiLayerSubnetwork.TopoMember_T[] initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return TopoMemberList_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = TopoMemberList_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		TopoMemberList_THelper.write (out,value);
	}
}
