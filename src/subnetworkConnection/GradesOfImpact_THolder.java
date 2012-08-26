package subnetworkConnection;
/**
 * Generated from IDL enum "GradesOfImpact_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class GradesOfImpact_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public GradesOfImpact_T value;

	public GradesOfImpact_THolder ()
	{
	}
	public GradesOfImpact_THolder (final GradesOfImpact_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return GradesOfImpact_THelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = GradesOfImpact_THelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		GradesOfImpact_THelper.write (out,value);
	}
}
