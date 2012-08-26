package equipment;

/**
 * Generated from IDL alias "EquipmentHolderType_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:09
 */

public final class EquipmentHolderType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;

	public static void insert (org.omg.CORBA.Any any, short s)
	{
		any.insert_short(s);
	}

	public static short extract (final org.omg.CORBA.Any any)
	{
		return any.extract_short();
	}

	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_alias_tc(equipment.EquipmentHolderType_THelper.id(), "EquipmentHolderType_T",org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.from_int(2)));
		}
		return _type;
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/equipment/EquipmentHolderType_T:1.0";
	}
	public static short read (final org.omg.CORBA.portable.InputStream _in)
	{
		short _result;
		_result=_in.read_short();
		return _result;
	}

	public static void write (final org.omg.CORBA.portable.OutputStream _out, short _s)
	{
		_out.write_short(_s);
	}
}
