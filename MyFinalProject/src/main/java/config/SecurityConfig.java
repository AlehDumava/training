package config;

import java.util.List;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class SecurityConfig {	
		
		public static final String ROLE_ADMINISTRATOR = "ADMINISTRATOR";
		public static final String ROLE_ENROLLEE = "ENROLLEE";

		
		private static final Map<String, List<String>> mapConfig = new HashMap<String, List<String>>();

		static {
			init();
		}

		private static void init() {

			
			List<String> urlPatterns1 = new ArrayList<String>();

			urlPatterns1.add("/userInfo");
			urlPatterns1.add("/enrolleeTask");

			mapConfig.put(ROLE_ENROLLEE, urlPatterns1);

			
			List<String> urlPatterns2 = new ArrayList<String>();

			urlPatterns2.add("/userInfo");
			urlPatterns2.add("/adminTask");

			mapConfig.put(ROLE_ADMINISTRATOR, urlPatterns2);
		}

		public static Set<String> getAllAppRoles() {
			return mapConfig.keySet();
		}

		public static List<String> getUrlPatternsForRole(String role) {
			return mapConfig.get(role);
		}
}
