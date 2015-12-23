<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="Modelutilisateur.Utilisateur, java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste d'utilisateurs</title>
</head>
<body>
<jsp:include page="login1.jsp"></jsp:include>
<br>
	<fmt:setBundle basename="message" var="msg"/>
<c:forEach var="user" items="${sessionScope.listUtilisateur}"> 

	<tr>
		<td> <fmt:message bundle="${msg}" key="id"></fmt:message>${user.id}</td>
		<td> <fmt:message bundle="${msg}" key="firstname"></fmt:message>${user.firstName}</td>
		<td> <fmt:message bundle="${msg}" key="lastname"></fmt:message> ${user.lastName}</td>
		<td> <fmt:message bundle="${msg}" key="adress"></fmt:message>${user.adress}</td>
		<td><a href='detail?id=<c:out value="${user.id}"></c:out>'>detail</a><br></td>
		
	</tr>
</c:forEach>




</body>
</html>