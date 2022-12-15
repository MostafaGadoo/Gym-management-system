

/**
 * @author mostafa gado
 * @version 1.0
 * @created 18-Nov-2022 8:46:40 AM
 */
package gym.managment.system;
public class Event implements Event_Interface {

	private String eventDate;
	private int eventId;
	private int eventTime;
	private String eventType;
	private TrainingStaff trainingStaff;

	public Event(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param eventId
	 * @param eventDate
	 * @param eventTime
	 * @param eventType
	 */
	public void addEvent(int eventId, String eventDate, int eventTime, String eventType){

	}

	/**
	 * 
	 * @param eventId
	 */
	public void deleteEvent(int eventId){

	}

//	public getters(){
//
//	}

	public void notifyUser(){

	}

	public void setters(){

	}

	public void addEvent(){

	}

	/**
	 * 
	 * @param notifyMsg
	 */
	public void update(String notifyMsg){

	}
}//end Event