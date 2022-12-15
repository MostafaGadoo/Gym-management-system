

/**
 * @author mostafa gado
 * @version 1.0
 * @created 18-Nov-2022 8:46:45 AM
 */
package gym.managment.system;
public class MemebershipDTO {

	private Customer customerId;
	private MemberShip_Duration memberhsipDuration;
	private int membershipId;
	private int membershipPrice;
	private Membership_Status membershipStatus;

	public MemebershipDTO(){

	}

	public void finalize() throws Throwable {

	}

    public MemebershipDTO(Customer customerId, MemberShip_Duration memberhsipDuration, int membershipId, int membershipPrice, Membership_Status membershipStatus) {
        this.customerId = customerId;
        this.memberhsipDuration = memberhsipDuration;
        this.membershipId = membershipId;
        this.membershipPrice = membershipPrice;
        this.membershipStatus = membershipStatus;
    }
	
}