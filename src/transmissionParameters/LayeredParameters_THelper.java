package transmissionParameters;


/**
 * Generated from IDL struct "LayeredParameters_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:13
 */

public final class LayeredParameters_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_struct_tc(transmissionParameters.LayeredParameters_THelper.id(),"LayeredParameters_T",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("layer", transmissionParameters.LayerRate_THelper.type(), null),new org.omg.CORBA.StructMember("transmissionParams", globaldefs.NVSList_THelper.type(), null)});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final transmissionParameters.LayeredParameters_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static transmissionParameters.LayeredParameters_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/transmissionParameters/LayeredParameters_T:1.0";
	}
	public static transmissionParameters.LayeredParameters_T read (final org.omg.CORBA.portable.InputStream in)
	{
		transmissionParameters.LayeredParameters_T result = new transmissionParameters.LayeredParameters_T();
		result.layer=in.read_short();
		result.transmissionParams = globaldefs.NVSList_THelper.read(in);
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final transmissionParameters.LayeredParameters_T s)
	{
		out.write_short(s.layer);
		globaldefs.NVSList_THelper.write(out,s.transmissionParams);
	}
}
