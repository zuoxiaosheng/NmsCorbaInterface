package alarmMgr;


/**
 * Generated from IDL interface "AlarmMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:46
 */

public interface AlarmMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	void getPerceivedSeverities(alarmMgr.SeverityAssignmentList_THolder severityAssignmentList) throws globaldefs.ProcessingFailureException;
	void setPerceivedSeverities(alarmMgr.SeverityAssignment_T[] severityAssignmentList) throws globaldefs.ProcessingFailureException;
	void setAlarmReportingOn(alarmMgr.ObjectAndRate_T[] objectAndRateList) throws globaldefs.ProcessingFailureException;
	void setAlarmReportingOff(alarmMgr.ObjectAndRate_T[] objectAndRateList) throws globaldefs.ProcessingFailureException;
}
