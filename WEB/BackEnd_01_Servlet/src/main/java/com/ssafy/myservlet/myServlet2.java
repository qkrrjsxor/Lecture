package com.ssafy.myservlet;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

// myServlet1에서 한 귀찮은 초기설정?들 하기 싫으면
// 추상 class GenericServlet 상속, 요청과 응답 처리만 Override 하면 된다
public class myServlet2 extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// 요청과 응답 처리는 해줘잉(나머지는 부모 클래스에서 했어)
		
	}


}
