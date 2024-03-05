package com.ssafy.practice;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doProcess(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String action = request.getParameter("action");
		
		int num = Integer.parseInt(request.getParameter("dan"));
		StringBuilder htmlcode =  new StringBuilder();
		String line;
		switch (action) {
		case "gugu": {
			
			for(int i = 1; i< 10; i++) {
				line =String.format("<p> %d x %d = %d</p>", num, i, num*i);
				htmlcode.append(line);
			}
			
			response.setContentType("text/html;characterset=UTF-8");
			PrintWriter writer = response.getWriter();

			writer.write(htmlcode.toString());
			
		}
		case "regist" : {
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + action);
		}
	}

	
}
