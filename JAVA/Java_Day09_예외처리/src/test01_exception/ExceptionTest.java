package test01_exception;

public class ExceptionTest {
	public static void main(String[] args) {
		int[] nums = {10};
		
		//Unchecked Exception
		//컴파일 시간에 확인 x -> 빨간 줄 x 
		//실행 단계에서 발생
		//예외 처리를 강제하지 않음
		//예외처리 방법: try~catch를 이용해서 처리할 수도 있다
		System.out.println(nums[2]);
		
		//Checked Exception
		//컴파일 시간에 확인 -> 빨간 줄 생김
		//예외처리를 강제
		//예외처리 방법 : try~catch 를 사용해서 직접처리 / throws 선언해서 에외처리 위임(간접처리)
		//Thread.sleep(1000);
	}
}
