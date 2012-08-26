package terminationPoint;
/**
 * Generated from IDL enum "Directionality_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:23
 */

public final class Directionality_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(terminationPoint.Directionality_THelper.id(),"Directionality_T",new String[]{"D_NA","D_BIDIRECTIONAL","D_SOURCE","D_SINK"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final terminationPoint.Directionality_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static terminationPoint.Directionality_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/terminationPoint/Directionality_T:1.0";
	}
	public static Directionality_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return Directionality_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final Directionality_T s)
	{
		out.write_long(s.value());
	}
}
