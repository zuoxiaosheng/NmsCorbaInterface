package equipment;

/**
 * Generated from IDL union "EquipmentOrHolder_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:09
 */

public final class EquipmentOrHolder_THelper
{
	private static org.omg.CORBA.TypeCode _type;
	public static void insert (final org.omg.CORBA.Any any, final equipment.EquipmentOrHolder_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static equipment.EquipmentOrHolder_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/equipment/EquipmentOrHolder_T:1.0";
	}
	public static EquipmentOrHolder_T read (org.omg.CORBA.portable.InputStream in)
	{
		EquipmentOrHolder_T result = new EquipmentOrHolder_T ();
		equipment.EquipmentTypeQualifier_T disc = equipment.EquipmentTypeQualifier_T.from_int(in.read_long());
		switch (disc.value ())
		{
			case equipment.EquipmentTypeQualifier_T._EQT:
			{
				equipment.Equipment_T _var;
				_var=equipment.Equipment_THelper.read(in);
				result.equip (_var);
				break;
			}
			case equipment.EquipmentTypeQualifier_T._EQT_HOLDER:
			{
				equipment.EquipmentHolder_T _var;
				_var=equipment.EquipmentHolder_THelper.read(in);
				result.holder (_var);
				break;
			}
		}
		return result;
	}
	public static void write (org.omg.CORBA.portable.OutputStream out, EquipmentOrHolder_T s)
	{
		out.write_long (s.discriminator().value ());
		switch (s.discriminator().value ())
		{
			case equipment.EquipmentTypeQualifier_T._EQT:
			{
				equipment.Equipment_THelper.write(out,s.equip ());
				break;
			}
			case equipment.EquipmentTypeQualifier_T._EQT_HOLDER:
			{
				equipment.EquipmentHolder_THelper.write(out,s.holder ());
				break;
			}
		}
	}
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			org.omg.CORBA.UnionMember[] members = new org.omg.CORBA.UnionMember[2];
			org.omg.CORBA.Any label_any;
			label_any = org.omg.CORBA.ORB.init().create_any ();
			equipment.EquipmentTypeQualifier_THelper.insert(label_any, equipment.EquipmentTypeQualifier_T.EQT);
			members[0] = new org.omg.CORBA.UnionMember ("equip", label_any, equipment.Equipment_THelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			equipment.EquipmentTypeQualifier_THelper.insert(label_any, equipment.EquipmentTypeQualifier_T.EQT_HOLDER);
			members[1] = new org.omg.CORBA.UnionMember ("holder", label_any, equipment.EquipmentHolder_THelper.type(),null);
			 _type = org.omg.CORBA.ORB.init().create_union_tc(id(),"EquipmentOrHolder_T",equipment.EquipmentTypeQualifier_THelper.type(), members);
		}
		return _type;
	}
}
