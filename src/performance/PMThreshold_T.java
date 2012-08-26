package performance;

/**
 * Generated from IDL struct "PMThreshold_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMThreshold_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMThreshold_T(){}
	public performance.PMThresholdType_T thresholdType;
	public boolean triggerFlag;
	public float value;
	public java.lang.String unit = "";
	public PMThreshold_T(performance.PMThresholdType_T thresholdType, boolean triggerFlag, float value, java.lang.String unit)
	{
		this.thresholdType = thresholdType;
		this.triggerFlag = triggerFlag;
		this.value = value;
		this.unit = unit;
	}
}
