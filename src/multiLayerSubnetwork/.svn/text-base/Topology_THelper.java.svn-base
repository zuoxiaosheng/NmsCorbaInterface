package multiLayerSubnetwork;
/**
 * Generated from IDL enum "Topology_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:02
 */

public final class Topology_THelper
{
	private static org.omg.CORBA.TypeCode _type = null;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			_type = org.omg.CORBA.ORB.init().create_enum_tc(multiLayerSubnetwork.Topology_THelper.id(),"Topology_T",new String[]{"TOPO_SINGLETON","TOPO_CHAIN","TOPO_PSR","TOPO_OPEN_PSR","TOPO_SPRING","TOPO_OPEN_SPRING","TOPO_MESH"});
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final multiLayerSubnetwork.Topology_T s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static multiLayerSubnetwork.Topology_T extract (final org.omg.CORBA.Any any)
	{
		return read(any.create_input_stream());
	}

	public static String id()
	{
		return "IDL:mtnm.tmforum.org/multiLayerSubnetwork/Topology_T:1.0";
	}
	public static Topology_T read (final org.omg.CORBA.portable.InputStream in)
	{
		return Topology_T.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final Topology_T s)
	{
		out.write_long(s.value());
	}
}
