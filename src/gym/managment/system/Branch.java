

/**
 * @author agh
 * @version 1.0
 * @created 18-Nov-2022 8:46:34 AM
 */
package gym.managment.system;
public class Branch {

	private int branchId;
	private String branchLocation;
	private int openingHours;
	private int SuperAdminId;

	public Branch(){

	}

    public Branch(int branchId, String branchLocation, int openingHours, int SuperAdminId) {
        this.branchId = branchId;
        this.branchLocation = branchLocation;
        this.openingHours = openingHours;
        this.SuperAdminId = SuperAdminId;
    }

	
	/**
	 * 
	 * @param Location
	 * @param adminId
	 * @param workingHours
	 * @param branchId
	 */
	public void addBranch(String Location, int adminId, int workingHours, int branchId){

	}

	/**
	 * 
	 * @param branchId
	 */
	public void deleteBranch(int branchId){

	}

	/**
	 * 
	 * @param branchId
	 * @param adminId
	 * @param wokringHours
	 */
	public void editBranch(int branchId, int adminId, int wokringHours){

	}

//	public getters(){
//            
//	}

	public void setters(){

	}
}//end Branch