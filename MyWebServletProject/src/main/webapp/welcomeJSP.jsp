<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Benvenuto</title>
</head>
<body>

<%

String name= request.getParameter("uname");
out.print("Benvenuto " + name);

for(int i = 0; i < 5;i++){
	out.print("<br>" + i + "</br>");
}

%>

<a href="welcome.html"> Home </a>

</body>
</html>