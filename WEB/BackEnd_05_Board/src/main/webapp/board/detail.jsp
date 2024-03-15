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
	<h2>게시글 상세</h2>
	<div>id : ${board.id }</div>
	<div>제목 : ${board.title }</div>
	<div>글쓴이 : ${board.writer }</div>
	<div>등록일 : ${board.regDate }</div>
	<div>조회수 : ${board.viewCnt }</div>
	<div>내용 : ${board.content }</div>
	
	<div>
		<a href="board?action=delete&id=${board.id }">삭제</a>
	</div>
	<div>
		<a href="board?action=updateform&id=${board.id }">수정</a>
	</div>
</body>
</html>