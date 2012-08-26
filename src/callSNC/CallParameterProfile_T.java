package callSNC;

/**
 * Generated from IDL struct "CallParameterProfile_T".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:49
 */

public final class CallParameterProfile_T
	implements org.omg.CORBA.portable.IDLEntity
{
	public CallParameterProfile_T(){}
	public java.lang.String severelyDegradedThreshold = "";
	public java.lang.String degradedTreshold = "";
	public java.lang.String classOfService = "";
	public globaldefs.NameAndStringValue_T[] classOfServiceParameters;
	public CallParameterProfile_T(java.lang.String severelyDegradedThreshold, java.lang.String degradedTreshold, java.lang.String classOfService, globaldefs.NameAndStringValue_T[] classOfServiceParameters)
	{
		this.severelyDegradedThreshold = severelyDegradedThreshold;
		this.degradedTreshold = degradedTreshold;
		this.classOfService = classOfService;
		this.classOfServiceParameters = classOfServiceParameters;
	}
}
