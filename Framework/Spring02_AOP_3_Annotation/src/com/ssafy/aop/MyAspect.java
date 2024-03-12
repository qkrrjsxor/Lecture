package com.ssafy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {	//pojo 스타일로 상속 없이 순수 자바로 작성
	
	@Pointcut("execution(* com.ssafy.aop.*.coding())")
	public void mypt() {}
	
	@Before("mypt()")
	public void before() {
		System.out.println("컴퓨터 부팅");
	}
	
	@AfterReturning(value="mypt()", returning="line")
	public void afterReturning(int line) {
		System.out.println("git push. : " + line + "개의 line을..");
	}
	
	@AfterThrowing(value="mypt()", throwing = "th")
	public void afterThrowing(Throwable th)  {	//exception의 상위 클래스 Throwable
		System.out.println("조퇴를 한다");
		if(th instanceof OuchException) {
			((OuchException) th).handleException();
		}
	}
	
	//이후에 할 것
	@After("mypt()")
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
