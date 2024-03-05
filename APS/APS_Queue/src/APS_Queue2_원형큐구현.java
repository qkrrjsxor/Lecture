import java.util.Arrays;

public class APS_Queue2_원형큐구현 {
	static String[] queue = new String[5];
	static int front = 0, rear = 0;

	public static void main(String[] args) {
		System.out.println(Arrays.toString(queue));
		System.out.println(deQueue());
		
		enQueue("A");
		enQueue("B");
		enQueue("C");
		enQueue("D");
		enQueue("E");
		deQueue();
		enQueue("F");
		enQueue("K");
		deQueue();
		enQueue("L");
		deQueue();
		
		System.out.println(Arrays.toString(queue));
		
	}

	public static boolean isEmpty() {
		return front == rear;
	}

	public static boolean isFull() {
		return front == (rear + 1) % queue.length;
	}
	
	public static void enQueue(String data) {
		if(isFull()) {
			System.out.println("Full");
			return;
		}
		
		rear = (rear+1)%queue.length;
		queue[rear] = data;
	}
	
	public static String deQueue() {
		if(isEmpty()) {
			System.out.println("Empty");
			return null;
		}
		
		front = (front+1)%queue.length;
		return queue[front];
	}
}
