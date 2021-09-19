package beans;

public class Enrollee {
	
	private Integer id;
	private String fullName;
	private String passport;
	private Integer userID;
	
	public Enrollee() {
		super();
	}
	
	public void setId(Integer id) {
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
	
}
