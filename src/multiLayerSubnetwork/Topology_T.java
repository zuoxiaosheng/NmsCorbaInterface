package multiLayerSubnetwork;
/**
 * Generated from IDL enum "Topology_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:02
 */

public final class Topology_T
	implements org.omg.CORBA.portable.IDLEntity
{
	private int value = -1;
	public static final int _TOPO_SINGLETON = 0;
	public static final Topology_T TOPO_SINGLETON = new Topology_T(_TOPO_SINGLETON);
	public static final int _TOPO_CHAIN = 1;
	public static final Topology_T TOPO_CHAIN = new Topology_T(_TOPO_CHAIN);
	public static final int _TOPO_PSR = 2;
	public static final Topology_T TOPO_PSR = new Topology_T(_TOPO_PSR);
	public static final int _TOPO_OPEN_PSR = 3;
	public static final Topology_T TOPO_OPEN_PSR = new Topology_T(_TOPO_OPEN_PSR);
	public static final int _TOPO_SPRING = 4;
	public static final Topology_T TOPO_SPRING = new Topology_T(_TOPO_SPRING);
	public static final int _TOPO_OPEN_SPRING = 5;
	public static final Topology_T TOPO_OPEN_SPRING = new Topology_T(_TOPO_OPEN_SPRING);
	public static final int _TOPO_MESH = 6;
	public static final Topology_T TOPO_MESH = new Topology_T(_TOPO_MESH);
	public int value()
	{
		return value;
	}
	public static Topology_T from_int(int value)
	{
		switch (value) {
			case _TOPO_SINGLETON: return TOPO_SINGLETON;
			case _TOPO_CHAIN: return TOPO_CHAIN;
			case _TOPO_PSR: return TOPO_PSR;
			case _TOPO_OPEN_PSR: return TOPO_OPEN_PSR;
			case _TOPO_SPRING: return TOPO_SPRING;
			case _TOPO_OPEN_SPRING: return TOPO_OPEN_SPRING;
			case _TOPO_MESH: return TOPO_MESH;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _TOPO_SINGLETON: return "TOPO_SINGLETON";
			case _TOPO_CHAIN: return "TOPO_CHAIN";
			case _TOPO_PSR: return "TOPO_PSR";
			case _TOPO_OPEN_PSR: return "TOPO_OPEN_PSR";
			case _TOPO_SPRING: return "TOPO_SPRING";
			case _TOPO_OPEN_SPRING: return "TOPO_OPEN_SPRING";
			case _TOPO_MESH: return "TOPO_MESH";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected Topology_T(int i)
	{
		value = i;
	}
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
	}
}
