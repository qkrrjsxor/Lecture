package com.ssafy.myservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class myServlet4 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;characterset=UTF-8");	//response에 text를 쓰면 html로 생각하라는 뜻, UTF-8로 인코딩하고
		PrintWriter writer = response.getWriter();	//싱글턴? writer 객체 가져오기

		writer.write("""
				<html>
				  <head><title>Hello! SSAFY!</title></head>
				  <body>
				    <h1>Hello! myServlet4!</h1>
				  </body>
				</html>
				""");

	}
}
