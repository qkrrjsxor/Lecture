<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 기본객체</title>
</head>
<body>
	<p>페이지 속성 : <%= pageContext.getAttribute("name") %></p>	<!-- 새로운 페이지로 포워딩 되어서 pageContext = null -->
	<p>요청 속성 : <%= request.getAttribute("name") %></p>			<!-- 이전 페이지에서 request를 그대로 가지고 포워딩 -->
	<p>세션 속성 : <%= session.getAttribute("name") %></p>			<!-- 브라우저를 끄기 전까지 session은 유지된다. -->
	<p>애플리케이션속성 속성 : <%= application.getAttribute("name") %></p>	<!-- WAS에 application 저장되어 유지 -->
	
	
	<a href="05_ThirdScope.jsp">세번째 페이지</a>	<!-- 새롭게 요청을 보낸것 ->request 사라짐 -->
</body>
</html>