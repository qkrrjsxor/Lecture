package com.ssafy.myservlet;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

//순수한 클래스 파일. servlet으로 동작하게 만들고 싶으면 이미 만들어져있는 친구를 가져다 등록을 해야한다
// -> implements Servlet
// -> jakarta 머시기 import 되고 myServlet1 클래스이름에 밑줄 쳐진다 
// -> 필요한 메서드들이 있는데 이것들을 생성해야한다는 경고문, add unimplemented method
public class myServlet1 implements Servlet{

	@Override
	public void destroy() {
		// Servlet이 소멸할 때
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// Servlet 설정 객체를 반환
		return null;
	}

	@Override
	public String getServletInfo() {
		// Servlet 정보 반환
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// 파라미터로 넘겨받은 서블릿 설정 파일을 가지고 초기화 하는 작업
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// 요청과 응답을 처리하는 일
		
	}

}
