package alarmMgr;


/**
 * Generated from IDL interface "AlarmDataIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-18 17:25:46
 */

public interface AlarmDataIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, alarmMgr.AlarmDataList_THolder alarmDataList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
