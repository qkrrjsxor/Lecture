package com.ssafy.proxy2;

public class Test {
	public static void main(String[] args) {
		Programmer p = new Programmer();	//핵심 기능을 갖고있는 
		
		PersonProxy px = new PersonProxy();	//부가 기능을 갖고있는 프록시
		px.setPerson(p);
		
//		p.coding();
		px.coding();
	}
}
