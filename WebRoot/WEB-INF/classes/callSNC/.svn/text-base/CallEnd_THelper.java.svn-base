package callSNC;


/**
 * Generated from IDL struct "CallEnd_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class CallEnd_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(callSNC.CallEnd_THelper.id(),"CallEnd_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("tpName", globaldefs.NamingAttributes_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final callSNC.CallEnd_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static callSNC.CallEnd_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/callSNC/CallEnd_T:1.0";
	}
	public static callSNC.CallEnd_T read (final org.omg.CORBA.portable.InputStream in)
	{
		callSNC.CallEnd_T result = new callSNC.CallEnd_T();
		result.tpName = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final callSNC.CallEnd_T s)
	{
		globaldefs.NVSList_THelper.write(out,s.tpName);
	}
}
