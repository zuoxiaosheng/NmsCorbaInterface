package alarmMgr;

/**
 * Generated from IDL struct "AlarmData_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:46
 */

public final class AlarmData_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public AlarmData_T(){}
	public globaldefs.NameAndStringValue_T[] alarmSource;
	public globaldefs.NameAndStringValue_T[] alarmDetectInfo;
	public java.lang.String probableCause;
	public alarmMgr.AlarmType_T alarmType;
	public alarmMgr.PerceivedSeverity_T perceivedSeverity;
	public short layerRate;
	public java.lang.String raiseTime;
	public java.lang.String clearTime;
	public globaldefs.NameAndStringValue_T[][] additionalInfo;
	public AlarmData_T(globaldefs.NameAndStringValue_T[] alarmSource, globaldefs.NameAndStringValue_T[] alarmDetectInfo, java.lang.String probableCause, alarmMgr.AlarmType_T alarmType, alarmMgr.PerceivedSeverity_T perceivedSeverity, short layerRate, java.lang.String raiseTime, java.lang.String clearTime, globaldefs.NameAndStringValue_T[][] additionalInfo)
	{
		this.alarmSource = alarmSource;
		this.alarmDetectInfo = alarmDetectInfo;
		this.probableCause = probableCause;
		this.alarmType = alarmType;
		this.perceivedSeverity = perceivedSeverity;
		this.layerRate = layerRate;
		this.raiseTime = raiseTime;
		this.clearTime = clearTime;
		this.additionalInfo = additionalInfo;
	}
}
