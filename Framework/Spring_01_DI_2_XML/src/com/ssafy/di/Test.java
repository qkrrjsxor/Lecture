package com.ssafy.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		
		System.out.println("1~~~~~~~~");
		Programmer p = (Programmer)context.getBean("programmer");
		Desktop d = (Desktop)context.getBean("desktop");
		p.setComputer(d);
		
		System.out.println("2~~~~~~~~");
		p.coding();
		
		/*
		 * 출력:
		    데스크탑 생성
			1~~~~~~~~
			2~~~~~~~~
			데스크톱으로 개발을 합니다
			-> 스프링 컨테이너 할 때 Bean 객체를 다 생성한 후 전체 코드가 실행된다
		 *
		 *
		 */
			
		Desktop d2 = context.getBean("desktop",Desktop.class);
		
		System.out.println(d==d2); //true : 컨테이너는 기본적으로 객체를 싱글턴으로 관리한다. scope ="prototype" 으로 설정하면 다른 객체 생성
		
	}
}


