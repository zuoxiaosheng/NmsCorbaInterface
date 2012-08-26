package subnetworkConnection;


/**
 * Generated from IDL interface "SNCIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:07
 */

public interface SNCIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, subnetworkConnection.SubnetworkConnectionList_THolder sncList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
