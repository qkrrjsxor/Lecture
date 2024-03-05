
public class APS_Queue_구현 {
	static int[] queue = new int[10];
	static int front = -1, rear = -1;
	
	public static void main(String[] args) {
		for(int  i = 0; i < 11; i++) {
			enQueue(i);
		}
		for(int i = 0; i<11; i++) {
			System.out.println(deQueue());
		}
		
	}
	
	
	public static void enQueue(int data) {
		if(isFull()) {
			System.out.println("큐가 꽉 차있어요");
			return;
		}
		
		queue[++rear] = data;
	}
	
	public static int deQueue() {
		if(isEmpty()) {
			System.out.println("큐가 비어있어요");
			return -1;
		}
		int item = queue[++front];
		
		return item;
	}
	
	public static boolean isFull() {
		return rear == queue.length -1;
	}
	
	public static boolean isEmpty() {
		return front == rear;
	}
}