package iceberg1;
import java.util.*;

/**
 * 
 */
public class User {

	private String firstname;
	private String lastname;
    private Boolean job;
    public Kid kid;
    public Admin Admin;
    
    /**
     * Default constructor
     */
    public User() {
    }
    

	public User(Boolean job, Kid kid) {
		super();
		this.job = job;
		this.kid = kid;
	}


	/**
	 * @return the job
	 */
	public Boolean getJob() {
		return job;
	}
	/**
	 * @param job the job to set
	 */
	public void setJob(Boolean job) {
		this.job = job;
	}
	/**
	 * @return the kid
	 */
	public Kid getKid() {
		return kid;
	}
	/**
	 * @param kid2 the kid to set
	 */
	public void setKid(Kid kid2) {
		this.kid = kid2;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

   

}