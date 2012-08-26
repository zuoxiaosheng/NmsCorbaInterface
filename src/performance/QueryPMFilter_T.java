package performance;

/**
 * Generated from IDL struct "QueryPMFilter_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class QueryPMFilter_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public QueryPMFilter_T(){}
	public globaldefs.NameAndStringValue_T[][] pmSourceSelect;
	public java.lang.String[] pmParameterSelect;
	public java.lang.String pmGranularitySelect;
	public short[] layerRateList;
	public java.lang.String[] pMLocationList;
	public java.lang.String raiseTime;
	public java.lang.String clearTime;
	public QueryPMFilter_T(globaldefs.NameAndStringValue_T[][] pmSourceSelect, java.lang.String[] pmParameterSelect, java.lang.String pmGranularitySelect, short[] layerRateList, java.lang.String[] pMLocationList, java.lang.String raiseTime, java.lang.String clearTime)
	{
		this.pmSourceSelect = pmSourceSelect;
		this.pmParameterSelect = pmParameterSelect;
		this.pmGranularitySelect = pmGranularitySelect;
		this.layerRateList = layerRateList;
		this.pMLocationList = pMLocationList;
		this.raiseTime = raiseTime;
		this.clearTime = clearTime;
	}
}
