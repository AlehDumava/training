package web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


//@WebServlet(urlPatterns = "/MyServlet")


public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
           
    public MyServlet() {
        super();  
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		Integer visitCounter = (Integer) session.getAttribute("visitCounter");
	       if (visitCounter == null) {
	           visitCounter = 1;
	       } else {
	           visitCounter++;
	       }
	       session.setAttribute("visitCounter", visitCounter);
	       String username = request.getParameter("username");
		   response.setContentType("text/html");
		   
		   PrintWriter printWriter = response.getWriter();
		   
	       if (username == null) {
	           printWriter.write("HELLO, Anonymous" + "<br>");
	       } else {
	           printWriter.write("Hello, " + username + "<br>");
	       }
	       
	       printWriter.write("Page was visited " + visitCounter + " times.");
	       response.getWriter().append("Served at: ").append(request.getContextPath());
	       printWriter.close();
		
	}

}
