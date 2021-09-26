package bean;

import java.util.ArrayList;
import java.util.List;


	public class UserAccount {			
		
		private String login;
		private String password;

		private List<String> roles;

		public UserAccount() {

	   }
	
		public UserAccount(String login, String password, String... roles) {
			this.login = login;
			this.password = password;
	      
			this.roles = new ArrayList<String>();
			if (roles != null) {
				for (String r : roles) {
					this.roles.add(r);
				}
			}
	   }
	
		public String getLogin() {
			return login;
	   }

	   public void setLogin(String userName) {
		   this.login = userName;
	   }

	   public String getPassword() {
		   return password;
	   }

	   public void setPassword(String password) {
		   this.password = password;
	   }

	   public List<String> getRoles() {
	      return roles;
	   }

	   public void setRoles(List<String> roles) {
	      this.roles = roles;
	   }
}
