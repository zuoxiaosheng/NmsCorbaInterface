package performance;


/**
 * Generated from IDL interface "PMDataIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:26:06
 */

public interface PMDataIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, performance.PMDataList_THolder pmDataList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
