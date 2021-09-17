package utils;

import java.util.HashMap;
import java.util.Map;

import bean.UserAccount;
import config.SecurityConfig;

	public class DataDAO {			
		
		private static final Map<String, UserAccount> mapUsers = new HashMap<String, UserAccount>();

		static {
			initUsers();
		}
		
		private static void initUsers() {

			      // This user has a role a ENROLLEE.
			      UserAccount enrollee = new UserAccount("enrollee", "1234", //
			            SecurityConfig.ROLE_ENROLLEE);

			      // This user has a role a ADMINISTRATOR.
			      UserAccount admin = new UserAccount("administrator", "root", //
			            SecurityConfig.ROLE_ADMINISTRATOR);

			      mapUsers.put(enrollee.getUserName(), enrollee);
			      mapUsers.put(admin.getUserName(), admin);
			   }

			   // Find a User by userName and password.
			   public static UserAccount findUser(String userName, String password) {
			      UserAccount u = mapUsers.get(userName);
			      if (u != null && u.getPassword().equals(password)) {
			         return u;
			      }
			      return null;
			   }
}
