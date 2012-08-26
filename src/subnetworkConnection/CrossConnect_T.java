package subnetworkConnection;

/**
 * Generated from IDL struct "CrossConnect_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public final class CrossConnect_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CrossConnect_T(){}
	public boolean active;
	public globaldefs.ConnectionDirection_T direction;
	public subnetworkConnection.SNCType_T ccType;
	public globaldefs.NameAndStringValue_T[][] aEndNameList;
	public globaldefs.NameAndStringValue_T[][] zEndNameList;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public CrossConnect_T(boolean active, globaldefs.ConnectionDirection_T direction, subnetworkConnection.SNCType_T ccType, globaldefs.NameAndStringValue_T[][] aEndNameList, globaldefs.NameAndStringValue_T[][] zEndNameList, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.active = active;
		this.direction = direction;
		this.ccType = ccType;
		this.aEndNameList = aEndNameList;
		this.zEndNameList = zEndNameList;
		this.additionalInfo = additionalInfo;
	}
}
