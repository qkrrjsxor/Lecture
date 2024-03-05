import java.util.LinkedList;
import java.util.Queue;

public class APS_Queue_API {
	public static void main(String[] args) {
		//Queue라는 인터페이스, LinkedList로 
		Queue<Integer> queue = new LinkedList<>();
		
		//삽입
		queue.add(1);
		queue.offer(1);
		
		//삭제
		queue.remove();
		queue.poll();
		
		//조회
		queue.element();
		queue.peek();
		/*
		 * add, remove, element : 동작 실패 시 예외 발생
		 * offer, poll, peek : 동작 실패 시 offer: false / poll, peek: null 반환
		 */
	}
}
