
public class APS05_Stack_함수호출 {
	public static void main(String[] args) {
		
		System.out.println("main이 호출되었습니다.");
		func1();
		
		System.out.println("main이 종료되었습니다.");
	}
	
	public static void func1() {
		System.out.println("func1이 호출되었습니다.");
		func2();
		
		System.out.println("func1이 종료되었습니다.");
	}
	
	public static void func2() {
		System.out.println("func2이 호출되었습니다.");
		
		System.out.println("func2이 종료되었습니다.");
	}
}
