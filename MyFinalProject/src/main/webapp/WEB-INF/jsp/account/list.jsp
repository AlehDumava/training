<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="domain.Account"%>

<%--
	@SuppressWarnings("unchecked")
	List<Account> accounts = (List<Account>) request.getAttribute("accounts");
--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Список счетов</h1>
		<table border="1">
			<tr>
				<th>Номер</th>
				<th>Владелец</th>
				<th>Баланс</th>
			</tr>
		<%--
			for(Account account : accounts) {
		--%>
		<%--
			<tr> --%>
				<td><%--= account.getId() --%></td>
				<td><%--= account.getName() --%></td>
				<td><%--= account.getBalance() / 100 --%> руб. <%--= account.getBalance() % 100 --%> коп. </td>
			<%--</tr> --%>
		
		<%--
			}
		--%>
		</table>
</body>
</html>