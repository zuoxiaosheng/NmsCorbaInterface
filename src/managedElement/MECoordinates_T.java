package managedElement;

/**
 * Generated from IDL struct "MECoordinates_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:58
 */

public final class MECoordinates_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public MECoordinates_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String coordinate = "";
	public java.lang.String relativeCoordinate = "";
	public MECoordinates_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String coordinate, java.lang.String relativeCoordinate)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.coordinate = coordinate;
		this.relativeCoordinate = relativeCoordinate;
	}
}
