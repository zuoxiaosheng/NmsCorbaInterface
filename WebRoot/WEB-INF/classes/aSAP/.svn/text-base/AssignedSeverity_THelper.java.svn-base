package aSAP;
/**
 * Generated from IDL enum "AssignedSeverity_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:48
 */

public final class AssignedSeverity_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(aSAP.AssignedSeverity_THelper.id(),"AssignedSeverity_T",new String[]{"AS_INDETERMINATE","AS_CRITICAL","AS_MAJOR","AS_MINOR","AS_WARNING","AS_NONALARMED","AS_FREE_CHOICE"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final aSAP.AssignedSeverity_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static aSAP.AssignedSeverity_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/aSAP/AssignedSeverity_T:1.0";
	}
	public static AssignedSeverity_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return AssignedSeverity_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final AssignedSeverity_T s)
	{
		out.write_long(s.value());
	}
}
