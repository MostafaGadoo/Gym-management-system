

/**
 * @author mostafa gado
 * @version 1.0
 * @created 18-Nov-2022 8:46:52 AM
 */
package gym.managment.system;
public class TrainingStaff extends  Person {

	private String specialization;

	public TrainingStaff(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

    public TrainingStaff(String specialization) {
        this.specialization = specialization;
    }

    public TrainingStaff(String specialization, String Address, String email, char Gender, int Id, String name, String password, String phoneNumber, String type, String username) {
        super(Address, email, Gender, Id, name, password, phoneNumber, type, username);
        this.specialization = specialization;
    }
        
        
	public void contactCustomer(){

	}

//	public getters(){
//
//	}

	public void setters(){

	}

	/**
	 * 
	 * @param username
	 * @param password
	 */
	public void Signin(String username, String password){

	}
}//end TrainingStaff