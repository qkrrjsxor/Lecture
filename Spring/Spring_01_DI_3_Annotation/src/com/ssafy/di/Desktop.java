package com.ssafy.di;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
	
	public Desktop() {
		System.out.println("데스크탑 생성");
	}
	public String getInfo() {
		return "데스크톱";
	}
}
