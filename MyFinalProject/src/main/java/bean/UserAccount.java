package bean;




	public class UserAccount {			
		
		private String login;
		private String password;
		private String roles;

		public UserAccount() {

	   }
	
		public UserAccount(String login, String password, String roles) {
			this.login = login;
			this.password = password;
			this.roles = roles;
			
	   }
	
		public String getLogin() {
			return login;
	   }

	   public void setLogin(String login) {
		   this.login = login;
	   }

	   public String getPassword() {
		   return password;
	   }

	   public void setPassword(String password) {
		   this.password = password;
	   }

	   public String getRoles() {
	      return roles;
	   }

	   public void setRoles(String roles) {
	      this.roles = roles;
	   }
}
