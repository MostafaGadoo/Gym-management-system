

/**
 * @author mostafa gado
 * @version 1.0
 * @created 18-Nov-2022 8:46:41 AM
 */
package gym.managment.system;
public class Feedback {

	private String className;
	private int customerId;
	private String date;
	private String description;
	private int feedbackId;
//	public Customer m_Customer;

	public Feedback(){

	}

    public Feedback(String className, int customerId, String date, String description, int feedbackId) {
        this.className = className;
        this.customerId = customerId;
        this.date = date;
        this.description = description;
        this.feedbackId = feedbackId;
    }

        
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

  

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }
        

	public void finalize() throws Throwable {

	}
}//end Feedback