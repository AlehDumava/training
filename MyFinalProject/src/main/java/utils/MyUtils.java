package utils;

import java.sql.Connection;

import bean.UserAccount;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class MyUtils {
	
	public static final String ATT_NAME_CONNECTION = "ATTRIBUTE_FOR_CONNECTION";

	private static final String ATT_NAME_USER_NAME = "ATTRIBUTE_FOR_STORE_USER_NAME_IN_COOKIE";

	// Сохранить Connection в attribute в request.
	// Данная информация хранения существует только во время запроса (request)
	// до тех пор, пока данные возвращаются приложению пользователя.
	public static void storeConnection(ServletRequest request, Connection conn) {
		request.setAttribute(ATT_NAME_CONNECTION, conn);
	}

	// Получить объект Connection сохраненный в attribute в request.
	public static Connection getStoredConnection(ServletRequest request) {
		Connection conn = (Connection) request.getAttribute(ATT_NAME_CONNECTION);
		return conn;
	}

	// Сохранить информацию пользователя, который вошел в систему (login) в Session.
	public static void storeLoginedUser(HttpSession session, UserAccount loginedUser) {
		// В JSP можно получить доступ через ${loginedUser}
		session.setAttribute("loginedUser", loginedUser);
	}

	// Get user information, saved in Session.
	public static UserAccount getLoginedUser(HttpSession session) {
		UserAccount loginedUser = (UserAccount) session.getAttribute("loginedUser");
		return loginedUser;
	}

	// Save user information in Cookie.
	public static void storeUserCookie(HttpServletResponse response, UserAccount user) {
		System.out.println("Store user cookie");
		Cookie cookieUserName = new Cookie(ATT_NAME_USER_NAME, user.getLogin());
		// 1 day (Конвертированный в секунды)
		cookieUserName.setMaxAge(24 * 60 * 60);
		response.addCookie(cookieUserName);
	}

	public static String getUserNameInCookie(HttpServletRequest request) {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (ATT_NAME_USER_NAME.equals(cookie.getName())) {
					return cookie.getValue();
				}
			}
		}
		return null;
	}

	// Deleting Users Cookie
	public static void deleteUserCookie(HttpServletResponse response) {
		Cookie cookieUserName = new Cookie(ATT_NAME_USER_NAME, null);
		// 0 секунд. (Данный Cookie будет сразу недействителен)
		cookieUserName.setMaxAge(0);
		response.addCookie(cookieUserName);
	}


}
