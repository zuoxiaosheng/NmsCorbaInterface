package emsMgr;
/**
 * Generated from IDL enum "EthernetServiceType_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:52
 */

public final class EthernetServiceType_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(emsMgr.EthernetServiceType_THelper.id(),"EthernetServiceType_T",new String[]{"EST_EPL","EST_EVPL","EST_EPLAN","EST_EVPLAN"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final emsMgr.EthernetServiceType_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static emsMgr.EthernetServiceType_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/emsMgr/EthernetServiceType_T:1.0";
	}
	public static EthernetServiceType_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return EthernetServiceType_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final EthernetServiceType_T s)
	{
		out.write_long(s.value());
	}
}
