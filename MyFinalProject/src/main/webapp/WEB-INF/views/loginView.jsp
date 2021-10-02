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
      	<h1>Login</h1>
      		<input placeholder="user name" type="text" autocomplete="off" name="login" value= "${user.login}" />
      		<input placeholder="password" type="password" name="password" value= "${user.password}" />
      		<input type="submit" name="" value="Login" />
      </form>
      		
<%--          <input type="hidden" name="redirectId" value="${param.redirectId}"/> --%>
<%--                   <a href="${pageContext.request.contextPath}/">Cancel</a> --%>
        
   </body>
