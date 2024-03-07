<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("password");
	
	//실제로는 id / pw 를 이용하여 DB 저장되어 있는 유저가 맞는지 체크
	//아니면 적어도 Manager 있어야 했지만 없이 만들자
	//if("ssafy".equals(id)&&"1234".equlas(pw)))
	if(id.equals("ssafy")&& pw.equals("1234")){
		//로그인 성공
		//세션에 정보 저장할거에요

		/*  servlet에선 이렇게 작성해야함. 바로 session으로 접근할 수 없어서 
		HttpSession mySession = request.getSession();
		mySession.setAttribute("id", id); 
		*/	
		
		//JSP는 session 영역을 기본으로 접근할 수 있다.
		session.setAttribute("id",id);
		response.sendRedirect("08_Main.jsp");
		
	}else{
		response.sendRedirect("07_LoginForm.jsp"); 
	}

%>