import java.util.Scanner;
import java.util.Stack;

public class APS05_Stack_실행취소 {
	public static void main(String[] args) {
		Stack<String> ctrlZ = new Stack<>();
		Stack<String> ctrlY = new Stack<>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1 : 새로운 작업");
			System.out.println("2 : 실행 취소(ctrl + Z)");
			System.out.println("3 : 취소를 취소");
			System.out.println("0 : 종료");
			
			int N = sc.nextInt();
			
			if(N == 1) {
				//1. 현재 진행 작업을 ctrlZ스택에 추가
				//2. 새로운 작업을 입력받는다.
				//3. ctrlY스택을 비운다
			}else if(N == 2) {
				//ctrlZ 스택에 있는 친구를 뽑아서 ctrlY 스택으로 넣는다
			}else if(N == 3) {
				//ctrlY 스택에서 pop 후 ctrlZ 스택으로 push
			}else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		
	}
}
