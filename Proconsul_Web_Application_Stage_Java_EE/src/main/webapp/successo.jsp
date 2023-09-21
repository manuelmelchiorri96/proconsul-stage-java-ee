<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="./style/style.css" />
		<%@page import="com.proconsul.dto.DipendenteDTO" %>
		
		<%
			DipendenteDTO dipendenteDTO = (DipendenteDTO) session.getAttribute("dipendenteDTO");
		%>
		
		<title>Successo</title>
		
	</head>
	<body>
		
		<div class="center">
			<h1>Registrazione avvenuta con successo</h1>
			
			<p>Il Dipendente <%= dipendenteDTO.getNome() %> <%= dipendenteDTO.getCognome() %> è stato registrato
			con successo</p>
			
		</div>
	</body>
</html>