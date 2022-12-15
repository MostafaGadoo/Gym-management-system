/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym.managment.system;



/**
 *
 * @author mostafa gado
 */
public class gym_management_ystem {
     public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("testing");
        
        customerDB database = new customerDB();
        FeedbackDB FBdatabase = new FeedbackDB();
        BranchDB branchDatabase = new BranchDB();
        trainningStaffDB traningStaffDatabase = new trainningStaffDB();
        MemberShip_Duration duration;
        Membership_Status status;
        Customer c = new Customer();
//        c.makeFeedback("Yoga","Amazing class");
        Admin admin = new Admin();
        admin.addTrainer(2,"Omar","Instractor");
        
//        MemberShip m = new MemberShip(Customer.class.cast(args).setId(2), duration.sixMonth, 1, 1500, status.Active);
        Branch b = new Branch(2, "October", 12, 2);
        Person p = new Person("Nasr city", "Mostafa@gmail.com", 'M' , 1, "Mostafa", "12345678", "123456789", "User", "Mostafa");
        Feedback f = new Feedback("Mostafa", 1, "12-12-2022", "The gym service is amazing", 1);
        TrainingStaff TS = new TrainingStaff("nutritionist", "New cairo", "ahmed@gmail.com", 'M', 1, "Ahmed", "12345678", "12345678", "Trainer", "Ahmed");
//        Customer c = new Customer(f, 10, 1, payment, 0, m_PaymentMethod, m_MemberShip, "new cairo", "mostafa@gmail.com", 'M', 1, "mostafa", "12345678", "12345678", "user", "Mostafa"):
        
//        branchDatabase.insertBranch(b);
//        traningStaffDatabase.insertTrainingStaff(TS);
        
}
}
