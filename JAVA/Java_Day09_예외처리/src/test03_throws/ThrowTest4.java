package test03_throws;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent{
	public void method1() throws IOException{
		
	}
	
	public void method2() throws ClassNotFoundException{
		
	}
}
public class ThrowTest4 extends Parent {
	@Override
	public void method1() throws FileNotFoundException{	//FileNotFoundException은 IOException보다 작은 범위
		
	}
	
//	// 자식은 부모가 던지는 예외보다 조상 예외를 던질 수 없다
	
//	@Override
//	public void method2() throws Exception{
//		
//	}
//	
//	// 자식 메서드의 접근제한자는 부모의 접근제한잡ㄷ=
}
