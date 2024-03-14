package com.ssafy.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {	//pojo 스타일로 상속 없이 순수 자바로 작성
	//메서드 명은 중요한게 아니야, 하지만 지금은 직관적으로 
	public void before() {
		System.out.println("컴퓨터 부팅");
	}
	
	//정상 수행 후
	public void afterReturning(int line) {
		System.out.println("git push. : " + line + "개의 line을..");
	}
	
	//예외 발생 후
	public void afterThrowing(Throwable th) {	//exception의 상위 클래스 Throwable
		System.out.println("조퇴를 한다");
		if(th instanceof OuchException) {
			((OuchException) th).handleException();
		}
	}
	
	//이후에 할 것
	public void after() {
		System.out.println("하루를 마무리한다");
	}
	
	////////////////////////////////////////////////////
	//around
	
	public int around(ProceedingJoinPoint pjt) {
		int line = 0;
		
		this.before();
		try {
			line = (int)pjt.proceed();
			this.afterReturning(line);
		}catch(Throwable e) {
			this.afterThrowing(e);
		}finally {
			this.after();
		}
		
		return line;
	}
}
