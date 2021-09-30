<%@ page language="java" session = "true" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page isELIgnored="false"%>
<%@ page import="jakarta.servlet.jsp.*"%>

    
<!DOCTYPE html>
<html>
   <head>
   		<meta charset="UTF-8">
      	<title>Login</title>
      	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styleView.css" />
      	<link rel="stylesheet" href="<c:url value='/css/styleView.css'/>">
   </head>
   <body class="_body">
		
      <jsp:include page="menu.jsp"></jsp:include>   

      <h3>Login Page</h3>

      <p style="color: red;">${errorString}</p>
      <br/><br/>

      <form action="${pageContext.request.contextPath}/login" method="POST" >
         <input type="hidden" name="redirectId" value="${param.redirectId}"/>
         <table border="1">
            <tr>
               <td>User Name</td>
               <td><input tabindex="1" placeholder="login" type="text" name="login" value= "${user.login}" /> </td>
            </tr>
            <tr>
               <td>Password</td>
               <td><input tabindex="2" placeholder="password" type="password" name="password" value= "${user.password}" /> </td>
            </tr>
         
            <tr>
               <td colspan ="2">
                  <input type="submit" value= "Submit" />
                  <a href="${pageContext.request.contextPath}/">Cancel</a>
               </td>
            </tr>
         </table>
      </form>

      <p style="color:blue;">Login with:</p>
      
      <p> user/1234 </p>
      <p> admin/admin </p>
  
   </body>
</html>