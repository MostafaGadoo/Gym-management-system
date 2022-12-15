

/**
 * @author agh
 * @version 1.0
 * @created 18-Nov-2022 8:46:43 AM
 */
package gym.managment.system;
public class MemberShip {

	private Customer customerId;
	private MemberShip_Duration memberhsipDuration;
	private int membershipId;
	private int membershipPrice;
	private Membership_Status membershipStatus;

	public MemberShip(){

	}

    public MemberShip(Customer customerId, MemberShip_Duration memberhsipDuration, int membershipId, int membershipPrice, Membership_Status membershipStatus) {
        this.customerId = customerId;
        this.memberhsipDuration = memberhsipDuration;
        this.membershipId = membershipId;
        this.membershipPrice = membershipPrice;
        this.membershipStatus = membershipStatus;
    }

        
        
	/*
	 * 
	 * @param membershipId
	 */
	public void cancelMembership(int membershipId){

	}

	/**
	 * 
	 * @param membershipDuration
	 * @param c
	 */
	public void chooseMembership(int membershipDuration, Customer c){

	}

	/**
	 * 
	 * @param membershipId
	 * @param membershipDuration
	 * @param c
	 */
	public void freezeMembership(int membershipId, int membershipDuration, Customer c){

	}

//	public getters(){
//
//	}

	/**
	 * 
	 * @param membershipId
	 * @param membershipDuration
	 * @param c
	 */
	public void renewMembership(int membershipId, int membershipDuration, Customer c){

	}

	public void setters(){

	}
}//end MemberShip