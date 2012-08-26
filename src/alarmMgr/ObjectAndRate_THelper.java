package alarmMgr;


/**
 * Generated from IDL struct "ObjectAndRate_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:46
 */

public final class ObjectAndRate_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(alarmMgr.ObjectAndRate_THelper.id(),"ObjectAndRate_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("objectName", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("rateList", transmissionParameters.LayerRateList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final alarmMgr.ObjectAndRate_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static alarmMgr.ObjectAndRate_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/alarmMgr/ObjectAndRate_T:1.0";
	}
	public static alarmMgr.ObjectAndRate_T read (final org.omg.CORBA.portable.InputStream in)
	{
		alarmMgr.ObjectAndRate_T result = new alarmMgr.ObjectAndRate_T();
		result.objectName = globaldefs.NVSList_THelper.read(in);
		result.rateList = transmissionParameters.LayerRateList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final alarmMgr.ObjectAndRate_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.objectName);
		transmissionParameters.LayerRateList_THelper.write(out,s.rateList);
	}
}
