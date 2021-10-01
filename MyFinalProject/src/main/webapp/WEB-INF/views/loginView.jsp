<%@ page language="java" session = "true" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page isELIgnored="false"%>
<%@ page import="jakarta.servlet.jsp.*"%>

    
<!DOCTYPE html>
   <head>
   		<meta charset="UTF-8">
      	<title>Login</title>
      	<meta name="description" content="">
      	<meta name="viewport" content="width=device-width, initial-scale=1">
      	<link rel="stylesheet" type="text/css" href="resources/css/styleLogin.css" />
   </head>
   <body>
		
      <jsp:include page="menu.jsp"></jsp:include>   

      <form class="box" action="${pageContext.request.contextPath}/login" method="POST" >
      	<h1>Ligin</h1>
      		<input placeholder="User name" type="text" name="login" value= "${user.login}" />
      		<input placeholder="password" type="password" name="password" value= "${user.password}" />
      		<input type="submit" name="" value="Login" />
      </form>
      		
<%--          <input type="hidden" name="redirectId" value="${param.redirectId}"/> --%>
<!--          <table border="1"> -->
<!--             <tr> -->
<!--                <td>User Name</td> -->
<%--                <td><input tabindex="1" placeholder="login" type="text" name="login" value= "${user.login}" /> </td> --%>
<!--             </tr> -->
<!--             <tr> -->
<!--                <td>Password</td> -->
<%--                <td><input tabindex="2" placeholder="password" type="password" name="password" value= "${user.password}" /> </td> --%>
<!--             </tr> -->
         
<!--             <tr> -->
<!--                <td colspan ="2"> -->
<!--                   <input type="submit" value= "Submit" /> -->
<%--                   <a href="${pageContext.request.contextPath}/">Cancel</a> --%>
<!--                </td> -->
<!--             </tr> -->
<!--          </table> -->
<!--       </form> -->
        
   </body>
