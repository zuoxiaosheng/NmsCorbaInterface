package performance;

/**
 * Generated from IDL struct "PMCollectionPlan_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMCollectionPlan_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMCollectionPlan_T(){}
	public performance.PMTPSelect_T name;
	public java.lang.String beginTime;
	public java.lang.String endTime;
	public java.lang.String reportInterval;
	public java.lang.String[] pMParameterList;
	public performance.PMMonitorOrReportStatus_T pmMonitorStatus;
	public performance.PMMonitorOrReportStatus_T pmReportStatus;
	public PMCollectionPlan_T(performance.PMTPSelect_T name, java.lang.String beginTime, java.lang.String endTime, java.lang.String reportInterval, java.lang.String[] pMParameterList, performance.PMMonitorOrReportStatus_T pmMonitorStatus, performance.PMMonitorOrReportStatus_T pmReportStatus)
	{
		this.name = name;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.reportInterval = reportInterval;
		this.pMParameterList = pMParameterList;
		this.pmMonitorStatus = pmMonitorStatus;
		this.pmReportStatus = pmReportStatus;
	}
}
