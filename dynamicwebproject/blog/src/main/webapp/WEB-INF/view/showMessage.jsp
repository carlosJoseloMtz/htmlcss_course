<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		<h2>${message}</h2>
		<hr/>
		<h2>Hola ${loggedUser.name}, bienvenido</h2>
		tu rfc es: ${loggedUser.rfc}
	</body>
</html>
