package com.ssafy_di3_타입의존성제거;

public class Test {
	public static void main(String[] args) {
		
		Desktop desktop = new Desktop();
		Programmer p = new Programmer(desktop);
		p.coding();
		
		Laptop laptop = new Laptop();
		Programmer p2 = new Programmer(laptop);
		p2.coding();
	}
}
