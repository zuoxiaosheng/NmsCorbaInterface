package callSNC;

/**
 * Generated from IDL struct "DiversityInfo_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class DiversityInfo_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public callSNC.DiversityInfo_T value;

	public DiversityInfo_THolder ()
	{
	}
	public DiversityInfo_THolder(final callSNC.DiversityInfo_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return callSNC.DiversityInfo_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = callSNC.DiversityInfo_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		callSNC.DiversityInfo_THelper.write(_out, value);
	}
}
