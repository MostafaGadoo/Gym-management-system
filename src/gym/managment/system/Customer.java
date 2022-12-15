

/**
 * @author agh
 * @version 1.0
 * @created 18-Nov-2022 8:46:38 AM
 */
package gym.managment.system;
public class Customer extends  Person implements customer_Interface {

	private Feedback F;
	private int Invitation;
	private int MemberShipID;
	private PaymentMethod payment;
	private int Points;
	public PaymentMethod m_PaymentMethod;
	public MemberShip m_MemberShip;

	public Customer(){

	}

    public Customer(Feedback F, int Invitation, int MemberShipID, PaymentMethod payment, int Points, PaymentMethod m_PaymentMethod, MemberShip m_MemberShip) {
        this.F = F;
        this.Invitation = Invitation;
        this.MemberShipID = MemberShipID;
        this.payment = payment;
        this.Points = Points;
        this.m_PaymentMethod = m_PaymentMethod;
        this.m_MemberShip = m_MemberShip;
    }

    public Customer(Feedback F, int Invitation, int MemberShipID, PaymentMethod payment, int Points, PaymentMethod m_PaymentMethod, MemberShip m_MemberShip, String Address, String email, char Gender, int Id, String name, String password, String phoneNumber, String type, String username) {
        super(Address, email, Gender, Id, name, password, phoneNumber, type, username);
        this.F = F;
        this.Invitation = Invitation;
        this.MemberShipID = MemberShipID;
        this.payment = payment;
        this.Points = Points;
        this.m_PaymentMethod = m_PaymentMethod;
        this.m_MemberShip = m_MemberShip;
    }

    public Feedback getF() {
        return F;
    }

    public void setF(Feedback F) {
        this.F = F;
    }

    public int getInvitation() {
        return Invitation;
    }

    public void setInvitation(int Invitation) {
        this.Invitation = Invitation;
    }

    public int getMemberShipID() {
        return MemberShipID;
    }

    public void setMemberShipID(int MemberShipID) {
        this.MemberShipID = MemberShipID;
    }

    public PaymentMethod getPayment() {
        return payment;
    }

    public void setPayment(PaymentMethod payment) {
        this.payment = payment;
    }

    public int getPoints() {
        return Points;
    }

    public void setPoints(int Points) {
        this.Points = Points;
    }

    public PaymentMethod getM_PaymentMethod() {
        return m_PaymentMethod;
    }

    public void setM_PaymentMethod(PaymentMethod m_PaymentMethod) {
        this.m_PaymentMethod = m_PaymentMethod;
    }

    public MemberShip getM_MemberShip() {
        return m_MemberShip;
    }

    public void setM_MemberShip(MemberShip m_MemberShip) {
        this.m_MemberShip = m_MemberShip;
    }

	
	public void contactTrainer(){

	}

	/**
	 * 
	 * @param name
	 * @param email
	 * @param password
	 */
	public void editAccount(String name, String email, String password){

	}

	/**
	 * 
	 * @param msg
	 */
	public void eventNotify(String msg){

	}

//	public getters(){
//
//	}

	
	public void makeFeedback(String className, String description){
            Feedback feedback = new Feedback(className, 1, "12-2-2022", description, 1);
            FeedbackDB feedbackDB = new FeedbackDB();
            feedbackDB.insertFeedback(feedback);
	}

	public void pay(){

	}

	/**
	 * 
	 * @param name
	 * @param Type
	 * @param price
	 */
	public void SelectTrainer(String name, String Type, String price){

	}

	public void setters(){

	}

	/**
	 * 
	 * @param username
	 * @param password
	 */
	public void Signin(String username, String password){

	}

	/**
	 * 
	 * @param username
	 * @param password
	 * @param email
	 * @param phoneNumber
	 * @param Gender
	 * @param Address
	 * @param name
	 */
	public void Signup(String username, String password, String email, String phoneNumber, char Gender, String Address, String name){

	}

	public void update(){

	}

	/**
	 * 
	 * @param Classes
	 */
	public void ViewSchedule(Schedule Classes){

	}

	/**
	 * 
	 * @param Type
	 */
	public void ViewTrainer(TrainingStaff Type){

	}

	/**
	 * 
	 * @param notifyMsg
	 */
	public void update(String notifyMsg){

	}
}//end Customer