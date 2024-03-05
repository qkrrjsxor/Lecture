import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class APS_Queue_마이쮸 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Queue<Person> queue = new LinkedList<>();
				
		int N = 20;		//마이쮸 개수
		int pNum = 1;
		
		queue.offer(new Person(sc.next(),1));
		
		while(N>0) {
			if(!queue.isEmpty()) {
				Person p = queue.poll();
				N -= p.cnt;
				
				if(N <= 0) {
					System.out.println(p.name + "님이 마지막 마이쮸");
				}
				else {
					System.out.println(p.name + "님이"  + p.cnt + "만큼 가져갔습니다");
					p.cnt++;
					System.out.println("남은 마이쮸" + N + "개");
					queue.offer(p);
					queue.offer(new Person(sc.next(),1));
					
				}
			}
		}
	
	}
}


class Person{
	String name;
	int cnt;
	
	Person(String name, int cnt){
		this.name = name;
		this.cnt = cnt;
	}
}
