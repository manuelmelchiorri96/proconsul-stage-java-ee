<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ page import= "com.proconsul.dto.TecnologiaDTO" %>
<%TecnologiaDTO tecnologiaDTO = (TecnologiaDTO) session.getAttribute("tecnologiaDTO");
String message = "Tecnologia con nome " + " " + tecnologiaDTO.getNome() + " inserito correttamente";
%>

<title>Inserimento avvenuto</title>
</head>
<body>
<%=message %>

</body>
</html>