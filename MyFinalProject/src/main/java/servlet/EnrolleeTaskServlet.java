package servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;


//@WebServlet("/enrolleeTask")
public class EnrolleeTaskServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

   public EnrolleeTaskServlet() {
      super();
   }

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {

      RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/enrolleeTaskView.jsp");

      dispatcher.forward(request, response);
   }

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {

      doGet(request, response);
   }

}
