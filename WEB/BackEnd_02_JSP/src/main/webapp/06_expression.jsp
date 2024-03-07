<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현식</title>
</head>
<body>
	<%!		// %! 로 선언된 선언부는 java 클래스로 작성되고 멤버 변수로 아래 변수들이 생성된다.
	int A = 10;
	int B = -20; 
	String name = "SSAFY";
	
	public int add(int A, int B){
		return A+B;
	}
	
	public int abs(int A){
		return A > 0 ? A : -A;
	}	
	%>
	<!-- out.print( ~~) 로 컴파일러가 변환한다 -->
	<%= name%><br>
	<%=A+B %><br>
	<%=add(A, B) %><br>	 

	<a href="index.html">홈으로</a>
</body>
</html>