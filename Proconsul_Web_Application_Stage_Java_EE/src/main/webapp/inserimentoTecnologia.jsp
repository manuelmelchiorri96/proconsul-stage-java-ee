<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Inserimento Tecnologia</title>
</head>
<body>
<c:set var= "categorie" value="${sessionScope.categorie}" /> 

    <form name="inserimentoTecnologia" method="post" action="inserimentoTecnologia">
        <label for="nome">Nome</label><input type="text" name="nome"/><br/><br/>
        <label for="nomeCategoria">Seleziona una Categoria</label>
        <select id="nomeCategoria" name="nomeCategoria">
            <c:forEach var="categoria" items="${categorie}">
                <option value="${categoria.nome}">${categoria.nome}</option>
            </c:forEach>
        </select><br/><br/>
        <input type="submit" name="inserimentoTecnologia" value="Inserimento">
    </form>
</body>
</html>

