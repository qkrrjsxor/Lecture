package test05_interface;

//인터페이스는 항상 클래스에 의해 구현된다
//구현할 때는 implements 키워드 사용
public class MyClass implements MyInterface{

	@Override
	public void method1() {
		System.out.println("method 1");
	}

	@Override
	public int method2() {
		System.out.println("method 2");
		return 0;
	}
	
}
