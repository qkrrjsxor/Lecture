package test03_throws;

//Unchecked Exception -> 빨간 줄 없음
// => 예외처리 강제하지 않는다.
//throws도 강제하지 않는다.
//하고싶으면 try catch로 해라

//내부적으로 자동으로 예외를 넘기고(throw) 있다


public class ThrowTest2 {
	public static void main(String[] args) {
		method1();
		System.out.println("main 종료");
	}
	
	public static void method1() {
		try {
			method2();
		} catch(ArithmeticException e) {
			System.out.println("method1로 throw 하고 method1에서 예외처리");
		}
	}
	
	public static void method2() {
		int i = 1/0;
		System.out.println(i);
		System.out.println("method2");
	}

}
