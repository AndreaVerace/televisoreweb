<%@page import="it.televisoreweb.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% Televisore tvItem = (Televisore) request.getAttribute("tvDaModificare"); %>
	<form action="ExecuteUpdateTelevisoreServlet" method="post">
		<label for="marcaInputId">MARCA:</label><br>
		<input type="text" name="marcaInput" id="marcaInputId">
		<br>
		<label for="modelloInputId">MODELLO:</label><br>
		<input type="text" name="modelloInput" id="modelloInputId">
		<br>
		<label for="prezzoInputId">MODELLO:</label><br>
		<input type="number" name="prezzoInput" id="prezzoInputId">
		<br>
		<label for="numeropolliciInputId">MODELLO:</label><br>
		<input type="number" name="numeropolliciInput" id="numeropolliciInputId">
		<br>
		<label for="codiceInputId">MODELLO:</label><br>
		<input type="text" name="codiceInput" id="codiceInputId">
		<br>
		<input type="hidden" name="idInput" value="<%= tvItem.getId()%>">
		<br><br>
		<input type="submit" value="MODIFICA">
	</form>
</body>
</html>