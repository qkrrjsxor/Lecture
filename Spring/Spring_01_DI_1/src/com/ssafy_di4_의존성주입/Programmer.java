package com.ssafy_di4_의존성주입;

public class Programmer {
	private Computer computer;
	
	public Programmer() {}
	
	//생성자 주입
	public Programmer(Computer computer) {
		//생성자 내에서 객체를 직접 생성하는 것이 아닌, 데스크톱을 인자로 받아서 제공
		this.computer = computer;
	}
	
	//설정자(setter 주입) 
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
//	//메서드 주입(여러개를 동시에 주입하려고 할 때, / 혹은 뭔가 추후에 추가 주입), 잘사용되지 않음
//	public void init(Computer computer, Keyboard keyboard) {
//		this.computer= computer;
//		this.keyboard = keyboard;
//	}
	
	public void coding() {
		System.out.println(computer.getInfo()+"으로 개발을 합니다");
	}
}