

/**
 * @author agh
 * @version 1.0
 * @created 18-Nov-2022 8:46:50 AM
 */
package gym.managment.system;
public class Schedule {

	private String classDate;
	private int classId;
	private String className;
	private int classTime;
	private String trainerName;
	public Admin m_Admin;

	public Schedule(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param classId
	 * @param className
	 */
	public void cancelReservation(int classId, String className){

	}

	/**
	 * 
	 * @param className
	 * @param classDate
	 * @param classTime
	 */
	public void editClassReservation(String className, String classDate, int classTime){

	}

//	public getters(){
//
//	}

	/**
	 * 
	 * @param classId
	 * @param name
	 * @param time
	 * @param date
	 * @param instructor
	 */
	public void reserveClass(int classId, String name, int time, String date, String instructor){

	}

	public void setters(){

	}

	/**
	 * 
	 * @param className
	 */
	public void viewClass(String className){

	}
}//end Schedule