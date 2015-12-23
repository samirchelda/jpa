
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>	
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><%= (request.getAttribute("login")) %></title >

</head>
<body>

<c:choose>
<c:when test="${sessionScope.isLogged == true}">
Allez TLEMCEN
</c:when>
<c:otherwise>
		NEW USER 

	<form action='login' method='POST'>
	<p>user</p>
		<input type='text' name='user'/><br>
		<p>password</p>
		<input type='text' name='password'/>
		<br>
			Format: <input type='text' name='format'/>
		<br>
	
		<button>valider</button>
	
		</form>
</c:otherwise>
</c:choose>
</body>
</html>