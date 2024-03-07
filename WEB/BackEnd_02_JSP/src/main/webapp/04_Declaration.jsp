<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언부</title>
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
	
	<%	// %로 작성된 스크립트렛은 service 메서드 내에 코드가 추가된다
	int C = 10;
	
	out.print(add(A,B));
	out.print("<br>");
	
	out.print(abs(B));
	out.print("<br>");	
	%>

	<a href="index.html">홈으로</a>
</body>
</html>