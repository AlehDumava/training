<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@ page import="jakarta.servlet.jsp.PageContext"%>

<a href="${pageContext.request.contextPath}/enrolleeTask"> Enrollee Task </a>
||
<a href="${pageContext.request.contextPath}/adminTask"> Admin Task </a>
||
<a href="${pageContext.request.contextPath}/userInfo"> User Info </a>       
||
<a href="${pageContext.request.contextPath}/login"> Login </a>
||
<a href="${pageContext.request.contextPath}/logout"> Logout </a>

&nbsp;
<span style="color:red">[ ${loginedUser.userName} ]</span>