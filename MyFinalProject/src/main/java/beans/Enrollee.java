package beans;

public class Enrollee {
	
	private Integer id;
	private String fullName;
	private String passport;
	private Integer userID;
	
	public Enrollee(Integer id, String fullName, String passport, Integer userID) {
		this.id = id;
		this.fullName = fullName;
		this.passport = passport;
		this.userID = userID;
	}
	
	public void setID(Integer id) {
		this.id = id;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public Integer getID() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public String getPassport() {
		return passport;
	}

	public Integer getUserID() {
		return userID;
	}
	
	
}
