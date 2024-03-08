<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과일선택</title>
</head>
<body>
	<h3>C:if</h3>
	<c:if test="${param.fruit ==1 }">
		<div>파인애플</div>
	</c:if>
	<c:if test="${param.fruit ==2 }">
		<div>망고스틴</div>
	</c:if>
	<c:if test="${param.fruit ==3 }">
		<div>멜론</div>
	</c:if>
	<c:if test="${param.fruit ==4 }">
		<div>사과div>
	</c:if>
	
	<h3>C:choose</h3>
	<c:choose>
		<c:when test="${param.fruit ==1 }">
			<div>파인애플</div>
		</c:when>
		<c:otherwise>
			<div>그외</div>
		</c:otherwise>
	</c:choose>
</body>
</html>