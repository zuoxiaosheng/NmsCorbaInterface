package callSNC;

/**
 * Generated from IDL struct "Diversity_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class Diversity_THolder
	implements org.omg.CORBA.portable.Streamable
{
	public callSNC.Diversity_T value;

	public Diversity_THolder ()
	{
	}
	public Diversity_THolder(final callSNC.Diversity_T initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return callSNC.Diversity_THelper.type ();
	}
	public void _read(final org.omg.CORBA.portable.InputStream _in)
	{
		value = callSNC.Diversity_THelper.read(_in);
	}
	public void _write(final org.omg.CORBA.portable.OutputStream _out)
	{
		callSNC.Diversity_THelper.write(_out, value);
	}
}
