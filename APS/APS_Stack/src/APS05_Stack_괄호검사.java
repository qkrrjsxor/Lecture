import java.util.Stack;

public class APS05_Stack_괄호검사 {
	public static void main(String[] args) {
		//소괄호만 있는 경우만 생각한다
		String text = ")(";
		
		Stack<Character> stack= new Stack<>();	//char의 wrapper 클래스는 Character
		
		for(int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if(c == '(') {
				stack.add(c);
			}else if(c == ')') {
				if(stack.isEmpty()) {
					System.out.println("닫는 괄호가 많습니다.");
					return;
				}
				stack.pop();
				//원래 괄호 종류가 같은지 확인해야하는데 여기선 소괄호만 생각
			}
			
		}
		
		if(stack.isEmpty()) {
			System.out.println("짝이 맞습니다.");
		}
		else {
			System.out.println("여는 괄호가 많습니다.");
		}
	}
}
