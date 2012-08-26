package callSNC;

/**
 * Generated from IDL struct "SNCAndRoute_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class SNCAndRoute_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SNCAndRoute_T(){}
	public subnetworkConnection.SubnetworkConnection_T connection;
	public subnetworkConnection.RouteDescriptor_T[] connectionRoutes;
	public java.lang.String routeType;
	public SNCAndRoute_T(subnetworkConnection.SubnetworkConnection_T connection, subnetworkConnection.RouteDescriptor_T[] connectionRoutes, java.lang.String routeType)
	{
		this.connection = connection;
		this.connectionRoutes = connectionRoutes;
		this.routeType = routeType;
	}
}
