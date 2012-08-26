package subnetworkConnection;
/**
 * Generated from IDL enum "GradesOfImpact_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class GradesOfImpact_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(subnetworkConnection.GradesOfImpact_THelper.id(),"GradesOfImpact_T",new String[]{"GOI_HITLESS","GOI_MINOR_IMPACT","GOI_MAJOR_IMPACT"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final subnetworkConnection.GradesOfImpact_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static subnetworkConnection.GradesOfImpact_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/subnetworkConnection/GradesOfImpact_T:1.0";
	}
	public static GradesOfImpact_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return GradesOfImpact_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final GradesOfImpact_T s)
	{
		out.write_long(s.value());
	}
}
