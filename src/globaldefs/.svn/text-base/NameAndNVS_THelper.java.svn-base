package globaldefs;


/**
 * Generated from IDL struct "NameAndNVS_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:57
 */

public final class NameAndNVS_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(globaldefs.NameAndNVS_THelper.id(),"NameAndNVS_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("name", globaldefs.NamingAttributes_THelper.type(), null),new org.omg.CORBA.StructMember("additionalInfo", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final globaldefs.NameAndNVS_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static globaldefs.NameAndNVS_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/globaldefs/NameAndNVS_T:1.0";
	}
	public static globaldefs.NameAndNVS_T read (final org.omg.CORBA.portable.InputStream in)
	{
		globaldefs.NameAndNVS_T result = new globaldefs.NameAndNVS_T();
		result.name = globaldefs.NVSList_THelper.read(in);
		result.additionalInfo = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final globaldefs.NameAndNVS_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.name);
		globaldefs.NVSList_THelper.write(out,s.additionalInfo);
	}
}
