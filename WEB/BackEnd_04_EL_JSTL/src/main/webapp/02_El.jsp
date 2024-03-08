<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL</title>
</head>
<body>
	문자열 : ${"Yang"}<br>
	정수형 : ${10}<br>
	실수형 : ${10.12} <br>
	논리형 : ${true} <br>
	null : ${null} <br>
	<%-- null : <%=null %> <br>   이건 에러가 난다. out.print(null) 을 한 거라서--%>
</body>
</html>