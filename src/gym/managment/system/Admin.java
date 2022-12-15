

/**
 * @author agh
 * @version 1.0
 * @created 18-Nov-2022 8:46:34 AM
 */
package gym.managment.system;
public class Admin extends  Person {

	private Event E;
	private int Salary;
	private Schedule schedule;
	public Event m_Event;

	public Admin(){

	}

    public Admin(Event E, int Salary, Schedule schedule, Event m_Event) {
        this.E = E;
        this.Salary = Salary;
        this.schedule = schedule;
        this.m_Event = m_Event;
    }

    public Admin(Event E, int Salary, Schedule schedule, Event m_Event, String Address, String email, char Gender, int Id, String name, String password, String phoneNumber, String type, String username) {
        super(Address, email, Gender, Id, name, password, phoneNumber, type, username);
        this.E = E;
        this.Salary = Salary;
        this.schedule = schedule;
        this.m_Event = m_Event;
    }

    public Event getE() {
        return E;
    }

    public void setE(Event E) {
        this.E = E;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Event getM_Event() {
        return m_Event;
    }

    public void setM_Event(Event m_Event) {
        this.m_Event = m_Event;
    }

	
//, int workingHours
	public void addTrainer(int trainerId, String Name, String Specialization){
            TrainingStaff TS = new TrainingStaff(Specialization, "Alexandria", "trainer@gmail.com", 'M', trainerId ,Name, "12345678", "12345678", "iTrainer", Name);
            trainningStaffDB TSDB = new trainningStaffDB();
            TSDB.insertTrainingStaff(TS);
	}

	
	public void editTrianer(int trainerId, String trainerName, int workingHours){

	}


	public void publishReport(){

	}

	
	public void removeTrainer(int trainerId, String trainerName){

	}


	
	public void Signin(String username, String password){

	}

	
	public void viewFeedback(Feedback F){

	}
}//end Admin