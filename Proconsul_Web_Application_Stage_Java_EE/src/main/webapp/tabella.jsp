<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ page import="java.util.List"%>
<%@ page import="com.proconsul.vo.DipendenteTecnologiaVO"%>
<%
@SuppressWarnings("unchecked")
List<List<DipendenteTecnologiaVO>> products = (List<List<DipendenteTecnologiaVO>>)session.getAttribute("listaDipendenteTecnologia");
%>

<style type="text/css">
@import url('https://fonts.googleapis.com/css2?family=Open+Sans:wght@300&display=swap');
body{
    font-family: 'Open Sans', sans-serif;
    
}
.search{
  
  top:6px;
  left:10px;
}

.form-control{
    
    border:none;
    padding-left:32px;
}

.form-control:focus{
    
    border:none;
    box-shadow:none;
}

.green{
    
    color:green;
}

</style>

<title>Dipendenti</title>
</head>
<body>

	<h1>Tabella dipendenti</h1>

	<div class="container mt-5 px-2">
    
    <div class="table-responsive">
    <table class="table table-responsive table-borderless">
        
      <thead>
        <tr class="bg-light">
          <th scope="col" width = "20%">Nome</th>
          <th scope="col" width = "20%">Cognome</th>
          <th scope="col" width = "20%">Tecnologia</th>
          <th scope="col" width = "20%">Esperienza</th>
          <th scope="col" width = "20%">Competenza</th>
        </tr>
      </thead>
  <tbody>
    <% boolean shouldBreak = true; %>

		<c:forEach items="${listaDipendenteTecnologia}" var="dipendenti">
			<c:forEach items="${dipendenti}" var="dipendente">
				<tr>
					<td width = "20%">${dipendente.nome}</td>
					<td width = "20%">${dipendente.cognome}</td>
					<td width = "20%">${dipendente.nomeTecnologia }</td>
					<td width = "20%">${dipendente.esperienza }</td>
					<td width = "20%">${dipendente.competenza }</td>
				</tr>


			</c:forEach>

			<% if (shouldBreak) { break; } %>
			
		</c:forEach>
    
    
  </tbody>
</table>
  
  </div>
    
</div>

	<br>
	<br>

	<a href="index.html">Home</a>
	


</body>
</html>