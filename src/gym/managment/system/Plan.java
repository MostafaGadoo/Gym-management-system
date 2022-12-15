

/**
 * @author mostafa gado
 * @version 1.0
 * @created 18-Nov-2022 8:46:49 AM
 */
package gym.managment.system;
public interface Plan {

	public TrainingStaff TrainingStaff = new TrainingStaff();

	public void createPlan();

	public void deletePlan();

	public void editPlan();

}