package test03_throws;

//Checked Exception
//-컴파일시 예외 처리를 강제
//-빨간 줄 => throws해서 위임할 수 있다.
//		 => 직접 처리(try catch)를 하지 않는다면 throws를 써야한다.
public class ThrowTest1 {
	public static void main(String[] args) {
		method1();
	}
	
	public static void method1() {
		method2();
	}
	
	public static void method2() throws ClassNotFoundException { //예외 처리 위임 method2를 호출한 곳으로
		Class.forName("SSAFY");	//SSAFY라는 이름의 클래스를 로드!
	}

}
