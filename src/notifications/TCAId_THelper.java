package notifications;


/**
 * Generated from IDL struct "TCAId_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:05
 */

public final class TCAId_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(notifications.TCAId_THelper.id(),"TCAId_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("objectName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("layerRate", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("pmParameterName", performance.PMParameterName_THelper.type(), null),new org.omg.CORBA.StructMember("pmLocation", performance.PMLocation_THelper.type(), null),new org.omg.CORBA.StructMember("granularity", performance.Granularity_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final notifications.TCAId_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static notifications.TCAId_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/notifications/TCAId_T:1.0";
	}
	public static notifications.TCAId_T read (final org.omg.CORBA.portable.InputStream in)
	{
		notifications.TCAId_T result = new notifications.TCAId_T();
		result.objectName = globaldefs.NVSList_THelper.read(in);
		result.layerRate=in.read_short();
		result.pmParameterName=in.read_string();
		result.pmLocation=in.read_string();
		result.granularity=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final notifications.TCAId_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.objectName);
		out.write_short(s.layerRate);
		out.write_string(s.pmParameterName);
		out.write_string(s.pmLocation);
		out.write_string(s.granularity);
	}
}
