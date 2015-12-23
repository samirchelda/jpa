<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Details</title>
</head>
<body>
<jsp:include page="login1.jsp"></jsp:include>

		<h1> Details de l'utilisateur </h1>
		<form action='Utilisateur' method='POST'>
		User:      <input type='text' name='Id' value="${sessionScope.user.id}"/><br>
		Lastname:  <input type='text' name='lastName' value="${sessionScope.user.lastName}"/><br>
		Firstname: <input type='text' name='firstName' value="${sessionScope.user.firstName}"/><br>
		Adress:    <input type='text' name='adress' value="${sessionScope.user.adress}"/><br>
        <button>Valider
        
        </button>
      </form>


</body>
</html>