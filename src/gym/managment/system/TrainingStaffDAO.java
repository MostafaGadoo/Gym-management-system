package gym.managment.system;
import java.util.List;



/**
 * @author mostafa gado
 * @version 1.0
 * @created 18-Nov-2022 8:46:52 AM
 */
public interface TrainingStaffDAO {

	/**
	 * 
	 * @param Id
	 */
	public void getTrainingStaffInfo(int Id);

	public List<TrainingStaff> getTraningStaff();

}