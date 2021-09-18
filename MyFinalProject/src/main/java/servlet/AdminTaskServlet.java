package servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import jakarta.servlet.RequestDispatcher;

//@WebServlet("/adminTask")
public class AdminTaskServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

   public AdminTaskServlet() {
      super();
   }

   @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {

      RequestDispatcher dispatcher //
            = this.getServletContext()//
                  .getRequestDispatcher("/WEB-INF/views/adminTaskView.jsp");

      dispatcher.forward(request, response);
   }

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {

      doGet(request, response);
   }

}
