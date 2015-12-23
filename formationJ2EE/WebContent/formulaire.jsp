<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>	
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><%= (request.getAttribute("titre")) %></title >
</head>
<body>
		Hello Page1
		</br>
	<form action='page2' methode='POST'>
	    <p>Nom</p>
		<input type='text' name='Nom'/><br>
		<br>
		<p>Prenom</p>
		<input type='text' name='Prenom'/>
		<br>
		<button> valider</button>
		</form>
</body>
</html>