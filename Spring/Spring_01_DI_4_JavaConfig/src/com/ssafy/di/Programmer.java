package com.ssafy.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Programmer {
	//@Autowired : container에 매칭하는 타입 객체가 있으면 자동으로 조립(의존성 부여? 연결?) 해주는 생성자 annotation 
	
	//필드 주입
	private Computer computer;
	
	public Programmer() {}
	
	//생성자 주입
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