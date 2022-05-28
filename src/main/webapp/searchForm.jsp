<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p> INSERIRE DATI DA RICERCARE </p>
	<form action="ExecuteSearchTelevisoreServlet" method="post">
		<label for="marcaInputId">MARCA:</label><br>
		<input type="text" name="marcaInput" id="marcaInputId">
		<br>
		<label for="modelloInputId">MODELLO:</label><br>
		<input type="text" name="modelloInput" id="modelloInputId">
		<br><br>
		<input type="submit" value="CERCA">
	
	</form>


</body>
</html>