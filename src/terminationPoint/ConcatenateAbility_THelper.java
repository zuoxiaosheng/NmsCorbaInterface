package terminationPoint;
/**
 * Generated from IDL enum "ConcatenateAbility_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:23
 */

public final class ConcatenateAbility_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(terminationPoint.ConcatenateAbility_THelper.id(),"ConcatenateAbility_T",new String[]{"CA_NOT","CA_STANDARD","CA_CONTINUAL"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final terminationPoint.ConcatenateAbility_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static terminationPoint.ConcatenateAbility_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/terminationPoint/ConcatenateAbility_T:1.0";
	}
	public static ConcatenateAbility_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ConcatenateAbility_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ConcatenateAbility_T s)
	{
		out.write_long(s.value());
	}
}
