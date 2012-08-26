package subnetworkConnection;

/**
 * Generated from IDL struct "SubnetworkConnection_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class SubnetworkConnection_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public SubnetworkConnection_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public subnetworkConnection.SNCState_T sncState;
	public globaldefs.ConnectionDirection_T direction;
	public short rate;
	public subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel;
	public subnetworkConnection.SNCType_T sncType;
	public subnetworkConnection.TPData_T[] aEnd;
	public subnetworkConnection.TPData_T[] zEnd;
	public subnetworkConnection.Reroute_T rerouteAllowed;
	public subnetworkConnection.NetworkRouted_T networkRouted;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public SubnetworkConnection_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, subnetworkConnection.SNCState_T sncState, globaldefs.ConnectionDirection_T direction, short rate, subnetworkConnection.StaticProtectionLevel_T staticProtectionLevel, subnetworkConnection.SNCType_T sncType, subnetworkConnection.TPData_T[] aEnd, subnetworkConnection.TPData_T[] zEnd, subnetworkConnection.Reroute_T rerouteAllowed, subnetworkConnection.NetworkRouted_T networkRouted, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.sncState = sncState;
		this.direction = direction;
		this.rate = rate;
		this.staticProtectionLevel = staticProtectionLevel;
		this.sncType = sncType;
		this.aEnd = aEnd;
		this.zEnd = zEnd;
		this.rerouteAllowed = rerouteAllowed;
		this.networkRouted = networkRouted;
		this.additionalInfo = additionalInfo;
	}
}
