<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>게시글 목록</h2>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>조회수</th>
			<th>등록일</th>
			<th>내용</th>
		</tr>
		<c:forEach items="${list }"	var="board">	<%-- request영역의 list에서 for문 돌리기?! --%>
			<tr>
				<td>${board.id }</td>			<!-- java bean으로 접근하는것이다. propertyㄹ 접근하는것, property 이므로 ? field가 아니라 getter로 접근하는것!-->
				<td><a href="board?action=detail&id=${board.id }">${board.title }</a></td>
				<td>${board.writer }</td>
				<td>${board.viewCnt }</td>
				<td>${board.regDate }</td>
				<td>${board.content }</td>
			</tr>
		</c:forEach>	
	</table>
		<a href="board?action=writeform">게시글등록</a>
</body>
</html>