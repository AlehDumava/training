package servlet;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import bean.UserAccount;
import utils.AppUtils;
import utils.DBUtils;
import utils.DataDAO;
import utils.MyUtils;

	//@WebServlet("/login")
	public class LoginServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}
	
	// Show the page loginView.jsp
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Forward to the page /WEB-INF/views/loginView.jsp
		RequestDispatcher dispatcher 
				= this.getServletContext().getRequestDispatcher("/WEB-INF/views/loginView.jsp");

		dispatcher.forward(request, response);
	}
	
	// The user enters userName & password, and press Submit
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String login = request.getParameter("login");
		String password = request.getParameter("password");
		//UserAccount userAccount = DataDAO.findUser(userName, password);

		UserAccount user = null;
		boolean hasError = false;
		String errorString = null;
		
		//if (userAccount == null) {
		if (login == null || password == null || login.length() == 0 || password.length() == 0) {
			hasError = true;
			errorString = "Required username and password!";
		} else {
			
			Connection conn = MyUtils.getStoredConnection(request);
			
			try {
				// Find user in DB.
				user = DBUtils.findUser(conn, login, password);

				if (user == null) {
					hasError = true;
					errorString = "User Name or password invalid";
				}
			} catch (SQLException e) {
				e.printStackTrace();
				hasError = true;
				errorString = e.getMessage();
			}
		}
			/*
			String errorMessage = "Invalid userName or Password";
			request.setAttribute("errorMessage", errorMessage);
			RequestDispatcher dispatcher //
					= this.getServletContext().getRequestDispatcher("/WEB-INF/views/loginView.jsp");

			dispatcher.forward(request, response);
			return;
		}

		AppUtils.storeLoginedUser(request.getSession(), userAccount);

		// 
		int redirectId = -1;
		try {
			redirectId = Integer.parseInt(request.getParameter("redirectId"));
		} catch (Exception e) {
		}
		String requestUri = AppUtils.getRedirectAfterLoginUrl(request.getSession(), redirectId);
		if (requestUri != null) {
			response.sendRedirect(requestUri);
		} else {
			
			response.sendRedirect(request.getContextPath() + "/userInfo");
		}  */
		
		// В случае, если есть ошибка,
		// forward to /WEB-INF/views/loginView.jsp
				if (hasError) {
					user = new UserAccount();
					user.setLogin(login);
					user.setPassword(password);

					// Сохранить информацию в request attribute перед forward.
					request.setAttribute("errorString", errorString);
					request.setAttribute("user", user);

					// Forward to /WEB-INF/views/loginView.jsp
					RequestDispatcher dispatcher //
							= this.getServletContext().getRequestDispatcher("/WEB-INF/views/loginView.jsp");

					dispatcher.forward(request, response);
				}
				// В случае, если нет ошибки.
				// Сохранить информацию пользователя в Session.
				// И перенаправить к странице userInfo.
				else {
						HttpSession session = request.getSession();
						MyUtils.storeLoginedUser(session, user);
						response.sendRedirect(request.getContextPath() + "/userInfo");
				}
		
	}

}
