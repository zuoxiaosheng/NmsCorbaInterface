package performance;

/**
 * Generated from IDL struct "PMP_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public final class PMP_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public PMP_T(){}
	public globaldefs.NameAndStringValue_T[] name;
	public java.lang.String userLabel = "";
	public java.lang.String nativeEMSName = "";
	public java.lang.String owner = "";
	public performance.PMParameterWithThresholds_T[] pmParameterWithThresholdsList;
	public performance.AdministrativeState_T monitoringState;
	public performance.AdministrativeState_T supervisionState;
	public globaldefs.NameAndStringValue_T[] additionalInfo;
	public PMP_T(globaldefs.NameAndStringValue_T[] name, java.lang.String userLabel, java.lang.String nativeEMSName, java.lang.String owner, performance.PMParameterWithThresholds_T[] pmParameterWithThresholdsList, performance.AdministrativeState_T monitoringState, performance.AdministrativeState_T supervisionState, globaldefs.NameAndStringValue_T[] additionalInfo)
	{
		this.name = name;
		this.userLabel = userLabel;
		this.nativeEMSName = nativeEMSName;
		this.owner = owner;
		this.pmParameterWithThresholdsList = pmParameterWithThresholdsList;
		this.monitoringState = monitoringState;
		this.supervisionState = supervisionState;
		this.additionalInfo = additionalInfo;
	}
}
