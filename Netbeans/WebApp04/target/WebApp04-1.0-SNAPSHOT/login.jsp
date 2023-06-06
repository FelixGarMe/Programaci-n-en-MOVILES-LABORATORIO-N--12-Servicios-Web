<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Iniciar sesión</title>
	<meta charset="UTF-8">
</head>
<body>
	<h1>Iniciar sesión</h1>
	<% if (request.getParameter("error") != null) { %>
		<p style="color:red">Nombre de usuario o contraseña incorrectos</p>
	<% } %>
	<form method="post" action="LoginServlet">
		<label for="username">Nombre de usuario:</label>
		<input type="text" name="username" id="username" required><br>
		<label for="password">Contraseña:</label>
		<input type="password" name="password" id="password" required><br>
		<button type="submit">Iniciar sesión</button>
	</form>
</body>
</html>
