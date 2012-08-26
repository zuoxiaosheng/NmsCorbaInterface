package managedElement;
/**
 * Generated from IDL enum "MEModel_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:58
 */

public final class MEModel_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(managedElement.MEModel_THelper.id(),"MEModel_T",new String[]{"MM_VIRTUAL","MM_PHYSICA","MM_LOGICAL"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final managedElement.MEModel_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static managedElement.MEModel_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/managedElement/MEModel_T:1.0";
	}
	public static MEModel_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return MEModel_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final MEModel_T s)
	{
		out.write_long(s.value());
	}
}
