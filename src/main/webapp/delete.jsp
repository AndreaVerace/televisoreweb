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
	<% Televisore tvItem = (Televisore) request.getAttribute("tvDaEliminare"); %>
	
	<tr>
		<td><%=tvItem.getMarca() %></td>
		<br>
		<td><%=tvItem.getModello() %></td>
		<br>
		<td><%=tvItem.getPrezzo() %></td>
		<br>
		<td><%=tvItem.getNumeroPollici() %></td>
		<br>
		<td><%=tvItem.getCodice() %></td>
	</tr>
	
	<form action="ExecuteDeleteTelevisoreServlet" method="post">
		<input type="hidden" name="idInput" value="<%= tvItem.getId()%>">
		<label>Sicuro di voler eliminare ?</label>
		<input type="submit" value="Conferma">
	</form>
</body>
</html>