package com.ssafy.aop;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Programmer implements Person{
	//필드는 일단 생략
	
	//프로그래머 일상 비유 예시
	public int coding() {
		
		System.out.println("열심히 코드 작성");			// 핵심 관심사항
		if(new Random().nextBoolean())
			throw new OuchException();
		
		return (int) (Math.random()*100) +1;
	}
}
