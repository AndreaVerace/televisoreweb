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
	<% Televisore tvItem = (Televisore) request.getAttribute("tvDettaglio"); %>
	
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
</body>
</html>