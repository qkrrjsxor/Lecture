<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>드라마 반복</title>
</head>
<body>
	<%
		String[] dramaList = {"a", "b", "c", "d"};
		pageContext.setAttribute("dramaList",dramaList);
	%>
	
	<h3>C:forEach</h3>
		<ul>
			<c:forEach items="${dramaList }" var="drama">
				<li>${drama }</li>
			</c:forEach>
		</ul>
		
	<hr>
	<c:forEach var="drama" items="${dramaList }" varStatus="status">
		<div>${status.index } : ${drama } index</div>
	</c:forEach>
	<hr>
	<c:forEach var="drama" items="${dramaList }" varStatus="status" begin="1" end="3" step="2">
		<div>${status.count } : ${drama } count</div>
	</c:forEach>
</body>
</html>