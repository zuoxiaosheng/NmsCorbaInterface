package performance;

/**
 * Generated from IDL struct "PMParameterWithThresholds_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMParameterWithThresholds_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMParameterWithThresholds_T(){}
	public java.lang.String pmParameterName;
	public performance.PMThreshold_T[] pmThresholdList;
	public PMParameterWithThresholds_T(java.lang.String pmParameterName, performance.PMThreshold_T[] pmThresholdList)
	{
		this.pmParameterName = pmParameterName;
		this.pmThresholdList = pmThresholdList;
	}
}
