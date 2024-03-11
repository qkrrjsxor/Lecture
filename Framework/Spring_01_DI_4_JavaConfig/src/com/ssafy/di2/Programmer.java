package com.ssafy.di2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Programmer {
	
	//필드 주입
	private Computer computer;
	
	public Programmer() {}
	
	//생성자 주입
	@Autowired
	public Programmer (Computer computer) {
		//생성자 내에서 객체를 직접 생성하는 것이 아닌, 데스크톱을 인자로 받아서 제공
		this.computer = computer;
	}
	
	//설정자(setter 주입) 
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	
	public void coding() {
		System.out.println(computer.getInfo()+"으로 개발을 합니다");
	}
}