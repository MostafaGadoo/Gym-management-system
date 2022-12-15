

/**
 * @author agh
 * @version 1.0
 * @created 18-Nov-2022 8:46:31 AM
 */
package gym.managment.system;
public class  Person {

	private String Address;
	private String email;
	private char Gender;
	private int Id;
	private String name;
	private String password;
	private String phoneNumber;
	private String type;
	private String username;

	public  Person(){

	}	

    public Person(String Address, String email, char Gender, int Id, String name, String password, String phoneNumber, String type, String username) {
        this.Address = Address;
        this.email = email;
        this.Gender = Gender;
        this.Id = Id;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.type = type;
        this.username = username;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char Gender) {
        this.Gender = Gender;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}//end  Person