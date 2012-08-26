package managedElementManager;


/**
 * Generated from IDL struct "MEConfigData_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:00
 */

public final class MEConfigData_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(managedElementManager.MEConfigData_THelper.id(),"MEConfigData_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("configDatas", notifications.NVList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final managedElementManager.MEConfigData_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static managedElementManager.MEConfigData_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/managedElementManager/MEConfigData_T:1.0";
	}
	public static managedElementManager.MEConfigData_T read (final org.omg.CORBA.portable.InputStream in)
	{
		managedElementManager.MEConfigData_T result = new managedElementManager.MEConfigData_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.configDatas = notifications.NVList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final managedElementManager.MEConfigData_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		notifications.NVList_THelper.write(out,s.configDatas);
	}
}
