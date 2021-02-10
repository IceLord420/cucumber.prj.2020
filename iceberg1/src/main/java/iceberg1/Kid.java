package iceberg1;
import java.util.*;

/**
 * 
 */
public class Kid {

	private String name;
    private String age;
    private Boolean disable;
    private Boolean twins;
    private Boolean sublin;
    private Double points;
    public User User;
    public Admin Admin;
    
   
    /**
     * Default constructor
     */
    public Kid() {
    }
    


	public Kid(String name, String age, Boolean disable, Boolean twins, Boolean sublin) {
		super();
		this.name = name;
		this.age = age;
		this.disable = disable;
		this.twins = twins;
		this.sublin = sublin;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @return the disable
	 */
	public Boolean getDisable() {
		return disable;
	}
	/**
	 * @return the twins
	 */
	public Boolean getTwins() {
		return twins;
	}
	/**
	 * @param twins the twins to set
	 */
	public void setTwins(Boolean twins) {
		this.twins = twins;
	}
	/**
	 * @param disable the disable to set
	 */
	public void setDisable(Boolean disable) {
		this.disable = disable;
	}

	/**
	 * @return the sublin
	 */
	public Boolean getSublin() {
		return sublin;
	}
	/**
	 * @param sublin the sublin to set
	 */
	public void setSublin(Boolean sublin) {
		this.sublin = sublin;
	}



	/**
	 * @return the points
	 */
	public Double getPoints() {
		return points;
	}



	/**
	 * @param points the points to set
	 */
	public void setPoints(Double points) {
		this.points = points;
	}
    
}