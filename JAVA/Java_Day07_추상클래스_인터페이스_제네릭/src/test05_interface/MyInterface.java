package test05_interface;

//클래스 : class
//인터페이스 : interface
public interface MyInterface {
	//인터페이스의 모든 변수는 상수, 앞에 (public static final) 생략되어있음
	public static final int MEMBER = 10;
	int MEMBER2 = 20;
	
	//인터페이스의 모든 메서드는 추상메서드, 앞에 (public abstract) 생략되어있음
	public abstract void method1();
	int method2();
}
