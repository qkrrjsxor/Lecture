package test02_try_catch;

public class ExceptionTest1 {
	
	public static void main(String[] args) {
		//try catch문 이용
		int[] nums = {10};
		
		//1. 예외가 발생했을 때 : 1, 4, 5
		//2. 예외가 발생했는데 처리하지 못했을 때 : 1 (2<-에러) 종료
		//3. 에러가 발생하지 않았을 때 : 1 2 3 5
		
		try {
			//예외가 발생할 수 있는 코드는 try문 안에 넣는다
			System.out.println("정상 코드 1");	//1
			System.out.println(nums[0]);		//2
			int num = 4/0;
			System.out.println("정상 코드 2");	//3
			
		} catch(ArrayIndexOutOfBoundsException e) {	//catch() 예외를 파라미터로 받는다
			//예외 대처 코드 작성
			System.out.println("배열의 인덱스 범위를 벗어났습니다.");	//4
		}catch(ArithmeticException e) {
			System.out.println("계산 오류가 발생했습니다.");
		}
		
		System.out.println("프로그램 종료");	//5
	}
	
}
