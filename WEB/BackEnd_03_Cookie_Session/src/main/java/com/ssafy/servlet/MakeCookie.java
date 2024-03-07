package com.ssafy.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MakeCookie
 */
public class MakeCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String key = req.getParameter("key");
		String value = req.getParameter("value");
		
		//쿠키를 생성하자
		Cookie cookie = new Cookie(key, value);
		
		//유효시간 (만료 단위) : 초단위
		cookie.setMaxAge(60);
		
		//쿠키는 remove 지우는 메서드가 따로 없다
//		cookie.setMaxAge(0);  //이게 쿠키를 삭제하는 방법
		
		//사용자에게 어떻게 돌려주나요?
		resp.addCookie(cookie);
		
		resp.sendRedirect(req.getContextPath() +"/02_CookieResult.jsp");
		
	}
}
