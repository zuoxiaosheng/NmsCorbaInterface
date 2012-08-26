package multiLayerSubnetwork;
/**
 * Generated from IDL enum "EMSFreedomLevel_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:02
 */

public final class EMSFreedomLevel_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(multiLayerSubnetwork.EMSFreedomLevel_THelper.id(),"EMSFreedomLevel_T",new String[]{"EMSFL_CC_AT_SNC_LAYER","EMSFL_TERMINATE_AND_MAP","EMSFL_HIGHER_ORDER_SNCS","EMSFL_RECONFIGURATION"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final multiLayerSubnetwork.EMSFreedomLevel_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static multiLayerSubnetwork.EMSFreedomLevel_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/multiLayerSubnetwork/EMSFreedomLevel_T:1.0";
	}
	public static EMSFreedomLevel_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return EMSFreedomLevel_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final EMSFreedomLevel_T s)
	{
		out.write_long(s.value());
	}
}
