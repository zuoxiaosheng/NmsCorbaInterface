package terminationPoint;
/**
 * Generated from IDL enum "TPProtectionAssociation_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:23
 */

public final class TPProtectionAssociation_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(terminationPoint.TPProtectionAssociation_THelper.id(),"TPProtectionAssociation_T",new String[]{"TPPA_NA","TPPA_PSR_RELATED"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final terminationPoint.TPProtectionAssociation_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static terminationPoint.TPProtectionAssociation_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/terminationPoint/TPProtectionAssociation_T:1.0";
	}
	public static TPProtectionAssociation_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return TPProtectionAssociation_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final TPProtectionAssociation_T s)
	{
		out.write_long(s.value());
	}
}
