package servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;


	@WebServlet("/logout")
	public class LogoutServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
   
		public LogoutServlet() {
			super();
        
		}

		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			request.getSession().invalidate();

			// Redirect to Home Page.
			response.sendRedirect(request.getContextPath() + "/");

		}

		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			this.doGet(request, response);
		}
				
}
