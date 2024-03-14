package com.ssafy.di2_객체의존성제거;

public class Test {
	public static void main(String[] args) {
		
		Desktop desktop = new Desktop();
		Programmer p = new Programmer(desktop);
		p.coding();
	}
}
