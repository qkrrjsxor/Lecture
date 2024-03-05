
public class APS05_Stack_스택구현 {
	static int[] stack = new int[5];
	static int top = -1;
	
	public static void main(String[] args) {
		push(1);
		int data = pop();
		int data2 = pop();

	}
	
	//스택이 비어있는지 확인, 비어있으면 1 반환
	public static boolean isEmpty() {
		return top == -1;
	}
	
	public static boolean isFull() {
		return top == stack.length -1;
	}
	
	public static void push(int data) {
		if(isFull()) {
			System.out.println("꽉 찼습니다.");
			return;
		}
		stack[++top] = data;
	}
	
	public static int pop() {
		if(isEmpty()) {
			System.out.println("비어있습니다.");
			return Integer.MIN_VALUE;
		}
		System.out.println(stack[top]);
		return stack[top--];
	}
}
