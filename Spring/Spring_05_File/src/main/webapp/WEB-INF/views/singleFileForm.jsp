<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>단일파일 업로드</h2>
	<form action="singleFileUpload" method="POST" enctype="multipart/form-data">
		<input type="file" name="file">
		<input type="submit" value="파일 등록">
	</form>
</body>
</html>