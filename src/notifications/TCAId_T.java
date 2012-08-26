package notifications;

/**
 * Generated from IDL struct "TCAId_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:05
 */

public final class TCAId_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public TCAId_T(){}
	public globaldefs.NameAndStringValue_T[] objectName;
	public short layerRate;
	public java.lang.String pmParameterName;
	public java.lang.String pmLocation;
	public java.lang.String granularity;
	public TCAId_T(globaldefs.NameAndStringValue_T[] objectName, short layerRate, java.lang.String pmParameterName, java.lang.String pmLocation, java.lang.String granularity)
	{
		this.objectName = objectName;
		this.layerRate = layerRate;
		this.pmParameterName = pmParameterName;
		this.pmLocation = pmLocation;
		this.granularity = granularity;
	}
}
