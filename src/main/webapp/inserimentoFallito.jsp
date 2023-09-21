<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@page import="com.proconsul.dto.CategoriaDTO"%>
<%
CategoriaDTO categoriaDTO = (CategoriaDTO) session.getAttribute("categoriaDTO");
String messaggio = "Categoria " + categoriaDTO.getNome() + " non inserita";
%>
<style>
body {
	background-color: #dedede;
	color: #333;
	font-family: Verdana, Geneva, Tahoma, sans-serif;
}

a {
	font-family: Verdana, Geneva, Tahoma, sans-serif;
	color: #333;
	text-decoration: none;
}
</style>
<title>Inserimento Fallito</title>
</head>
<body>
	<h2><%=messaggio%></h2>
</body>
</html>
