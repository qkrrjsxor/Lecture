package com.ssafy.proxy2;

import java.util.Random;

public class PersonProxy implements Person {

	//PersonProxy : 핵심 관심사항을 제외한 모든 것들을 작성한다.
	//핵심 관심사항은 교육생 / 프로그래머 냐에 따라서 달라진다 
	//어떻게 교육생 / 프로그래머에 따라서 나눌까? -> 프록시를 만들떄? 주입하는 객체에 따라서 
	
	private Person person;
	public void setPerson(Person person) {
		this.person= person;
	}
	
	@Override
	public void coding() {
		
		System.out.println("컴퓨터 부팅");			// 핵심 동작 시행 전
		
		try {
			//-------이부분이 사람에 따라 달라지는 핵심 관심사항
			person.coding();		
			//--------이 아래부턴 공통적으로 수행하는 예외, 핵심기능 이후, 종료 기능
			if(new Random().nextBoolean()) {
				throw new OuchException();
			}
			
			System.out.println("git push");			// 이상없이 마무리가 되었을 떄
			
		}catch(OuchException e) {
			
			e.handleException();
			System.out.println("조퇴를 한다");
			
		}finally {		// finally : 예외랑 상관없이 무조건 실행되는 부분
			
			System.out.println("하루를 마무리한다");		//모든 게 마무리가 되었을 떄
		}
	}

}
