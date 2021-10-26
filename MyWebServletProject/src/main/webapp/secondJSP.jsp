<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Seconda JSP</title>
</head>
<body>
<h3>Esempio JSTL</h3>

<jsp:useBean id="auto" class="draftJSP.Automobile" scope="page" />

<jsp:setProperty name="auto" property="id" value="1"/>
<jsp:setProperty name="auto" property="nome" value="opel"/>
Dati Auto:
<br />
<b>Id:</b>
<c:out value="${auto.id}"></c:out>
<br />
<b>Nome:</b>
<c:out value="${auto.nome}"></c:out>

</body>
</html>