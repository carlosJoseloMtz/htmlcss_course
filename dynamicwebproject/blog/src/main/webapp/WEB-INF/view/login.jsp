<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
something
	<c:if test="${success}">
		Hola, ${loggedUser}, bienvenido, success ${success eq true ? 'algo' : 'noe'}
	</c:if>
	
	<c:if test="${not success}">
		<form action="login/auth" method="post">
			username <input name="username" type="text" placeholder="username" />
			password <input name="password" type="password" />
			<button type="submit">Login</button>
		</form>
	</c:if>
</body>
</html>