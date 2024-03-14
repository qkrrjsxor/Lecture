package com.ssafy.mvc.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;

public class MyFilter extends HttpFilter implements Filter {
    
	public FilterConfig filterConfig;
	
	//필터 초기화 하는 과정
	public void init(FilterConfig fConfig) throws ServletException {
		this.filterConfig = fConfig;
	}
	
	
	//필터 종료될때
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	//필터 동작과정
	//인자 : ServletRequest, ServletResponse, FilterChain
	//리퀘스트, 리스폰스 둘다 필터 거치고 다음 필터
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//------서버에 가기전 필요한 코드 작성
		System.out.println("서블릿 전-1");
		String encoding = this.filterConfig.getInitParameter("encoding");
		request.setCharacterEncoding(encoding);
		//------
		
		//다음 필터로 전달
		//다음 필터가 없다면 서블리승로 전달
		chain.doFilter(request, response);
		
		
		
		//----사용자에게 되돌아 가기전 필요한 코드 작성
		System.out.println("서블릿 후-1");
	}


}
