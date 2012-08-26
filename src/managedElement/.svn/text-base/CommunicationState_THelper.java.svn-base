package managedElement;
/**
 * Generated from IDL enum "CommunicationState_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:58
 */

public final class CommunicationState_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(managedElement.CommunicationState_THelper.id(),"CommunicationState_T",new String[]{"CS_AVAILABLE","CS_UNAVAILABLE"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final managedElement.CommunicationState_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static managedElement.CommunicationState_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/managedElement/CommunicationState_T:1.0";
	}
	public static CommunicationState_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return CommunicationState_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final CommunicationState_T s)
	{
		out.write_long(s.value());
	}
}
