package subscription;


/**
 * Generated from IDL interface "EMSSubscriptionMgr_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:51:58
 */

public interface EMSSubscriptionMgr_IOperations
	extends common.Common_IOperations
{
	/* constants */
	/* operations  */
	boolean unsubscribe(int subscriptionId) throws globaldefs.ProcessingFailureException;
	boolean suspendSubscription(int subscriptionId) throws globaldefs.ProcessingFailureException;
	boolean resumeSubscription(int subscriptionId) throws globaldefs.ProcessingFailureException;
}
