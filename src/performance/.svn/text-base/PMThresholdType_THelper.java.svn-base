package performance;
/**
 * Generated from IDL enum "PMThresholdType_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMThresholdType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(performance.PMThresholdType_THelper.id(),"PMThresholdType_T",new String[]{"TWM_HIGHEST","TWM_HIGH","TWM_LOW","TWM_LOWEST"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final performance.PMThresholdType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static performance.PMThresholdType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/performance/PMThresholdType_T:1.0";
	}
	public static PMThresholdType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return PMThresholdType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final PMThresholdType_T s)
	{
		out.write_long(s.value());
	}
}
