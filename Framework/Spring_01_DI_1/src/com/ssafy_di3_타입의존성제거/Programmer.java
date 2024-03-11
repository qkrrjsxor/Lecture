package com.ssafy_di3_타입의존성제거;

public class Programmer {
	private Computer computer;
	
	//객체 생성 의존성 제거 생성자
	public Programmer(Computer computer) {
		//생성자 내에서 객체를 직접 생성하는 것이 아닌, 데스크톱을 인자로 받아서 제공
		this.computer = computer;
	}
	
	public void coding() {
		System.out.println(computer.getInfo()+"으로 개발을 합니다");
	}
}