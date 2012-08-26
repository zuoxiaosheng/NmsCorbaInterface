package equipment;


/**
 * Generated from IDL interface "EquipmentOrHolderIterator_I".
 *
 * @author JacORB IDL compiler V 2.3.1, 27-May-2009
 * @version generated at 2010-12-23 15:44:09
 */

public interface EquipmentOrHolderIterator_IOperations
{
	/* constants */
	/* operations  */
	boolean next_n(int how_many, equipment.EquipmentOrHolderList_THolder equipmentOrHolderList) throws globaldefs.ProcessingFailureException;
	int getLength() throws globaldefs.ProcessingFailureException;
	void destroy() throws globaldefs.ProcessingFailureException;
}
