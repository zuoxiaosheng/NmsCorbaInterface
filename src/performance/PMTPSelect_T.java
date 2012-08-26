package performance;

/**
 * Generated from IDL struct "PMTPSelect_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMTPSelect_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMTPSelect_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public short[] layerRateList;
	public java.lang.String[] pMLocationList;
	public java.lang.String[] granularityList;
	public PMTPSelect_T(globaldefs.NameAndStringValue_T[] name, short[] layerRateList, java.lang.String[] pMLocationList, java.lang.String[] granularityList)
	{
		this.name = name;
		this.layerRateList = layerRateList;
		this.pMLocationList = pMLocationList;
		this.granularityList = granularityList;
	}
}
