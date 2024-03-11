package com.ssafy.di;

public class Desktop implements Computer{
	
	public Desktop() {
		System.out.println("데스크탑 생성");
	}
	public String getInfo() {
		return "데스크톱";
	}
}
