package test04_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
    	Queue<Integer> queue = new LinkedList<>();
    	
    	//queue에 순차적으로 끝에 값 집어넣기
    	for(int i=0; i<5; i++) {
    		queue.offer(i);
    	}
    	
    	//queue에서 값 제거
    	while(!queue.isEmpty()) {
    		System.out.println(queue.poll());
    	}
    	
    }
}
