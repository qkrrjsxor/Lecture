import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class APS06_Stack2_계산기 {
	public static void main(String[] args) {
		Map<Character, Integer> priority = new HashMap<>();
		
		priority.put('+', 1);
		priority.put('-', 1);
		
		priority.put('*', 2);
		priority.put('/', 2);
		
		priority.put('(', 0);
		
		Scanner sc = new Scanner(System.in);
		
		String expression = sc.next();
		
		//중위 표기식 -> 후위 표기식
		String postfix = "";
		Stack<Character> op = new Stack<>();
		
		for(int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);
			
			if(c == '(') {		//왼쪽 괄호를 만나면 push
				op.push(c);
				
			}else if(c == ')') {	//오른쪽 괄호를 만나면 stack에서 왼쪽 괄호가 나올 때 까지 pop
				
				while(op.peek() != '(') {
					postfix += op.pop();		//pop한 연산자 postfix 문자열에 추가
				}
				op.pop();			//왼쪽 괄호 바로 직전까지 pop 하여 문자열에 추가하였고, 한번 더 pop 하고 버려서 왼쪽 괄호 빼내기
				
			}else if('0' <= c && c <= '9') {	//숫자인 경우 바로 postfix 문자열에 추가
				
				postfix += c;
				
			}else{				//사칙연산 연산자 인 경우!!!!
				if(op.isEmpty()) {	//조건 1. 스택이 비어있으면 push
					op.push(c);
					
				}else {
					//조건 2. 스택이 빌 때 까지,스택 top에 있는 연산자가 우선순위가 낮으면 pop
					while(!op.isEmpty() && priority.get(c) <= priority.get(op.peek())) {
						postfix += op.pop();
					}
					op.push(c);
					
				}
				
			}
		}
		
		System.out.println(postfix);
		
	}
}
