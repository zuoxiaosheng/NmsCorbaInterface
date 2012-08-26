package equipment;
/**
 * Generated from IDL enum "ServiceState_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:09
 */

public final class ServiceState_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(equipment.ServiceState_THelper.id(),"ServiceState_T",new String[]{"IN_SERVICE","OUT_OF_SERVICE","OUT_OF_SERVICE_BY_MAINTENANCE","SERV_NA"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final equipment.ServiceState_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static equipment.ServiceState_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/equipment/ServiceState_T:1.0";
	}
	public static ServiceState_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ServiceState_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ServiceState_T s)
	{
		out.write_long(s.value());
	}
}
