<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃</title>
</head>
<body>

<!-- 로그아웃 하는방법 -->
<%-- 	<%session.removeAttribute("id"); %>
 --%>	
	<%session.invalidate(); %>
	
	<%response.sendRedirect("index.html"); %>
</body>
</html>