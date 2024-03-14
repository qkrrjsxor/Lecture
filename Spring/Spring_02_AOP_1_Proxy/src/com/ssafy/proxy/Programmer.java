package com.ssafy.proxy;

import java.util.Random;

public class Programmer {
	//필드는 일단 생략
	
	//프로그래머 일상 비유 예시
	public void coding() {
		
		System.out.println("컴퓨터 부팅");			// 핵심 동작 시행 전
		
		try {
			System.out.println("코드 작성");			// -> 이게 핵심 동작, 핵심 관심사항
			
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
