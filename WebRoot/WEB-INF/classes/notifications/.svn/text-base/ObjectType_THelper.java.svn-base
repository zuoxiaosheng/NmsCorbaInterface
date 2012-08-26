package notifications;
/**
 * Generated from IDL enum "ObjectType_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:05
 */

public final class ObjectType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(notifications.ObjectType_THelper.id(),"ObjectType_T",new String[]{"OT_EMS","OT_MANAGED_ELEMENT","OT_MULTILAYER_SUBNETWORK","OT_TOPOLOGICAL_LINK","OT_SUBNETWORK_CONNECTION","OT_PHYSICAL_TERMINATION_POINT","OT_CONNECTION_TERMINATION_POINT","OT_TERMINATION_POINT_POOL","OT_EQUIPMENT_HOLDER","OT_EQUIPMENT","OT_PROTECTION_GROUP","OT_TRAFFIC_DESCRIPTOR","OT_AID"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final notifications.ObjectType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static notifications.ObjectType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/notifications/ObjectType_T:1.0";
	}
	public static ObjectType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return ObjectType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final ObjectType_T s)
	{
		out.write_long(s.value());
	}
}
