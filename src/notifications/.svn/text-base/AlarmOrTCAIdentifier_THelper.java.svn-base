package notifications;

/**
 * Generated from IDL union "AlarmOrTCAIdentifier_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:05
 */

public final class AlarmOrTCAIdentifier_THelper
{
	private static org.omg.CORBA.TypeCode _type;
	public static void insert (final org.omg.CORBA.Any any, final notifications.AlarmOrTCAIdentifier_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static notifications.AlarmOrTCAIdentifier_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/notifications/AlarmOrTCAIdentifier_T:1.0";
	}
	public static AlarmOrTCAIdentifier_T read (org.omg.CORBA.portable.InputStream in)
	{
		AlarmOrTCAIdentifier_T result = new AlarmOrTCAIdentifier_T ();
		notifications.AlarmTypeQualifier_T disc = notifications.AlarmTypeQualifier_T.from_int(in.read_long());
		switch (disc.value ())
		{
			case notifications.AlarmTypeQualifier_T._ALARM:
			{
				notifications.AlarmId_T _var;
				_var=notifications.AlarmId_THelper.read(in);
				result.alarmId (_var);
				break;
			}
			case notifications.AlarmTypeQualifier_T._TCA:
			{
				notifications.TCAId_T _var;
				_var=notifications.TCAId_THelper.read(in);
				result.tcaId (_var);
				break;
			}
		}
		return result;
	}
	public static void write (org.omg.CORBA.portable.OutputStream out, AlarmOrTCAIdentifier_T s)
	{
		out.write_long (s.discriminator().value ());
		switch (s.discriminator().value ())
		{
			case notifications.AlarmTypeQualifier_T._ALARM:
			{
				notifications.AlarmId_THelper.write(out,s.alarmId ());
				break;
			}
			case notifications.AlarmTypeQualifier_T._TCA:
			{
				notifications.TCAId_THelper.write(out,s.tcaId ());
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
			notifications.AlarmTypeQualifier_THelper.insert(label_any, notifications.AlarmTypeQualifier_T.ALARM);
			members[0] = new org.omg.CORBA.UnionMember ("alarmId", label_any, notifications.AlarmId_THelper.type(),null);
			label_any = org.omg.CORBA.ORB.init().create_any ();
			notifications.AlarmTypeQualifier_THelper.insert(label_any, notifications.AlarmTypeQualifier_T.TCA);
			members[1] = new org.omg.CORBA.UnionMember ("tcaId", label_any, notifications.TCAId_THelper.type(),null);
			 _type = org.omg.CORBA.ORB.init().create_union_tc(id(),"AlarmOrTCAIdentifier_T",notifications.AlarmTypeQualifier_THelper.type(), members);
		}
		return _type;
	}
}
