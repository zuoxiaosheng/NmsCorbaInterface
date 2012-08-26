package notifications;
/**
 * Generated from IDL enum "ObjectType_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:05
 */

public final class ObjectType_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _OT_EMS = 0;
	public static final ObjectType_T OT_EMS = new ObjectType_T(_OT_EMS);
	public static final int _OT_MANAGED_ELEMENT = 1;
	public static final ObjectType_T OT_MANAGED_ELEMENT = new ObjectType_T(_OT_MANAGED_ELEMENT);
	public static final int _OT_MULTILAYER_SUBNETWORK = 2;
	public static final ObjectType_T OT_MULTILAYER_SUBNETWORK = new ObjectType_T(_OT_MULTILAYER_SUBNETWORK);
	public static final int _OT_TOPOLOGICAL_LINK = 3;
	public static final ObjectType_T OT_TOPOLOGICAL_LINK = new ObjectType_T(_OT_TOPOLOGICAL_LINK);
	public static final int _OT_SUBNETWORK_CONNECTION = 4;
	public static final ObjectType_T OT_SUBNETWORK_CONNECTION = new ObjectType_T(_OT_SUBNETWORK_CONNECTION);
	public static final int _OT_PHYSICAL_TERMINATION_POINT = 5;
	public static final ObjectType_T OT_PHYSICAL_TERMINATION_POINT = new ObjectType_T(_OT_PHYSICAL_TERMINATION_POINT);
	public static final int _OT_CONNECTION_TERMINATION_POINT = 6;
	public static final ObjectType_T OT_CONNECTION_TERMINATION_POINT = new ObjectType_T(_OT_CONNECTION_TERMINATION_POINT);
	public static final int _OT_TERMINATION_POINT_POOL = 7;
	public static final ObjectType_T OT_TERMINATION_POINT_POOL = new ObjectType_T(_OT_TERMINATION_POINT_POOL);
	public static final int _OT_EQUIPMENT_HOLDER = 8;
	public static final ObjectType_T OT_EQUIPMENT_HOLDER = new ObjectType_T(_OT_EQUIPMENT_HOLDER);
	public static final int _OT_EQUIPMENT = 9;
	public static final ObjectType_T OT_EQUIPMENT = new ObjectType_T(_OT_EQUIPMENT);
	public static final int _OT_PROTECTION_GROUP = 10;
	public static final ObjectType_T OT_PROTECTION_GROUP = new ObjectType_T(_OT_PROTECTION_GROUP);
	public static final int _OT_TRAFFIC_DESCRIPTOR = 11;
	public static final ObjectType_T OT_TRAFFIC_DESCRIPTOR = new ObjectType_T(_OT_TRAFFIC_DESCRIPTOR);
	public static final int _OT_AID = 12;
	public static final ObjectType_T OT_AID = new ObjectType_T(_OT_AID);
	public int value()
	{
		return value;
	}
	public static ObjectType_T from_int(int value)
	{
		switch (value) {
			case _OT_EMS: return OT_EMS;
			case _OT_MANAGED_ELEMENT: return OT_MANAGED_ELEMENT;
			case _OT_MULTILAYER_SUBNETWORK: return OT_MULTILAYER_SUBNETWORK;
			case _OT_TOPOLOGICAL_LINK: return OT_TOPOLOGICAL_LINK;
			case _OT_SUBNETWORK_CONNECTION: return OT_SUBNETWORK_CONNECTION;
			case _OT_PHYSICAL_TERMINATION_POINT: return OT_PHYSICAL_TERMINATION_POINT;
			case _OT_CONNECTION_TERMINATION_POINT: return OT_CONNECTION_TERMINATION_POINT;
			case _OT_TERMINATION_POINT_POOL: return OT_TERMINATION_POINT_POOL;
			case _OT_EQUIPMENT_HOLDER: return OT_EQUIPMENT_HOLDER;
			case _OT_EQUIPMENT: return OT_EQUIPMENT;
			case _OT_PROTECTION_GROUP: return OT_PROTECTION_GROUP;
			case _OT_TRAFFIC_DESCRIPTOR: return OT_TRAFFIC_DESCRIPTOR;
			case _OT_AID: return OT_AID;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _OT_EMS: return "OT_EMS";
			case _OT_MANAGED_ELEMENT: return "OT_MANAGED_ELEMENT";
			case _OT_MULTILAYER_SUBNETWORK: return "OT_MULTILAYER_SUBNETWORK";
			case _OT_TOPOLOGICAL_LINK: return "OT_TOPOLOGICAL_LINK";
			case _OT_SUBNETWORK_CONNECTION: return "OT_SUBNETWORK_CONNECTION";
			case _OT_PHYSICAL_TERMINATION_POINT: return "OT_PHYSICAL_TERMINATION_POINT";
			case _OT_CONNECTION_TERMINATION_POINT: return "OT_CONNECTION_TERMINATION_POINT";
			case _OT_TERMINATION_POINT_POOL: return "OT_TERMINATION_POINT_POOL";
			case _OT_EQUIPMENT_HOLDER: return "OT_EQUIPMENT_HOLDER";
			case _OT_EQUIPMENT: return "OT_EQUIPMENT";
			case _OT_PROTECTION_GROUP: return "OT_PROTECTION_GROUP";
			case _OT_TRAFFIC_DESCRIPTOR: return "OT_TRAFFIC_DESCRIPTOR";
			case _OT_AID: return "OT_AID";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected ObjectType_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
