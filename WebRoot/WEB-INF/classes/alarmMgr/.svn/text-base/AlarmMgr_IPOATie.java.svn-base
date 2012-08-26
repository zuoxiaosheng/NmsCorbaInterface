package alarmMgr;

import org.omg.PortableServer.POA;

/**
 * Generated from IDL interface "AlarmMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:46
 */

public class AlarmMgr_IPOATie
	extends AlarmMgr_IPOA
{
	private AlarmMgr_IOperations _delegate;

	private POA _poa;
	public AlarmMgr_IPOATie(AlarmMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public AlarmMgr_IPOATie(AlarmMgr_IOperations delegate, POA poa)
	{
		_delegate = delegate;
		_poa = poa;
	}
	public alarmMgr.AlarmMgr_I _this()
	{
		return alarmMgr.AlarmMgr_IHelper.narrow(_this_object());
	}
	public alarmMgr.AlarmMgr_I _this(org.omg.CORBA.ORB orb)
	{
		return alarmMgr.AlarmMgr_IHelper.narrow(_this_object(orb));
	}
	public AlarmMgr_IOperations _delegate()
	{
		return _delegate;
	}
	public void _delegate(AlarmMgr_IOperations delegate)
	{
		_delegate = delegate;
	}
	public POA _default_POA()
	{
		if (_poa != null)
		{
			return _poa;
		}
		return super._default_POA();
	}
	public void setLocation(globaldefs.NameAndStringValue_T[] objectName, java.lang.String location) throws globaldefs.ProcessingFailureException
	{
_delegate.setLocation(objectName,location);
	}

	public void setAdditionalInfo(globaldefs.NameAndStringValue_T[] objectName, globaldefs.NVSList_THolder additionalInfo) throws globaldefs.ProcessingFailureException
	{
_delegate.setAdditionalInfo(objectName,additionalInfo);
	}

	public void setAlarmReportingOff(alarmMgr.ObjectAndRate_T[] objectAndRateList) throws globaldefs.ProcessingFailureException
	{
_delegate.setAlarmReportingOff(objectAndRateList);
	}

	public void getCapabilities(common.CapabilityList_THolder capabilities) throws globaldefs.ProcessingFailureException
	{
_delegate.getCapabilities(capabilities);
	}

	public void getPerceivedSeverities(alarmMgr.SeverityAssignmentList_THolder severityAssignmentList) throws globaldefs.ProcessingFailureException
	{
_delegate.getPerceivedSeverities(severityAssignmentList);
	}

	public void setUserLabel(globaldefs.NameAndStringValue_T[] objectName, java.lang.String userLabel, boolean enforceUniqueness) throws globaldefs.ProcessingFailureException
	{
_delegate.setUserLabel(objectName,userLabel,enforceUniqueness);
	}

	public void setNativeEMSName(globaldefs.NameAndStringValue_T[] objectName, java.lang.String nativeEMSName) throws globaldefs.ProcessingFailureException
	{
_delegate.setNativeEMSName(objectName,nativeEMSName);
	}

	public void setPerceivedSeverities(alarmMgr.SeverityAssignment_T[] severityAssignmentList) throws globaldefs.ProcessingFailureException
	{
_delegate.setPerceivedSeverities(severityAssignmentList);
	}

	public void setAlarmReportingOn(alarmMgr.ObjectAndRate_T[] objectAndRateList) throws globaldefs.ProcessingFailureException
	{
_delegate.setAlarmReportingOn(objectAndRateList);
	}

}
