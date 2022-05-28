<%@page import="it.televisoreweb.model.Televisore"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	table, th, td {
	  border: 1px solid black;
	}
	
	th, td {
	  padding: 10px;
	}
	.center {
		margin-left: auto;
		margin-right: auto;
	}
</style>
</head>
<body>
	<table class="center">
		<thead>
			<tr>
				<th>Marca</th>
				<th>Modello</th>
				<th>Azione</th>
			</tr>
		</thead>
		<% List<Televisore> listaDaServlet = (List<Televisore>) request.getAttribute("ListaTvAttributeName"); 
							for (Televisore tvItem : listaDaServlet) { %>
				<tr>
					<td><%= tvItem.getMarca() %></td>
					<td><%= tvItem.getModello() %></td>
					<td>
						<a href="ExecuteShowTelevisoreServlet?idDaPassareComeParametro=<%= tvItem.getId() %>">VISUALIZZA DETTAGLI</a>					
						<a href="PrepareUpdateTelevisoreServlet?idDaPassareComeParametro=<%= tvItem.getId() %>">MODIFICA</a>
						<a href="PrepareDeleteTelevisoreServlet?idDaPassareComeParametro=<%= tvItem.getId() %>">CANCELLA</a>
					</td>
	<% } %>		</tr>
	</table>			
	
	<a href="PrepareInsertTelevisoreServlet">INSERISCI NUOVO TELEVISORE</a>
	
</body>
</html>