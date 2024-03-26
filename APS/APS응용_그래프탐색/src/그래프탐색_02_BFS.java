import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class 그래프탐색_02_BFS {
	static int V;	//정점의 수
	static List<Integer>[] adj;
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(input);
		
		V = sc.nextInt();
		int E= sc.nextInt();
		visited = new boolean[V+1];
		
		adj = new ArrayList[V+1]; //시작 정점이 1번부터 시작 -> V+1 크기
		for(int i = 1; i<=V; i++) {
			adj[i] = new ArrayList<>();
		}
		
		
		for(int i = 0; i < E ; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			adj[A].add(B);
			adj[B].add(A);
		}
		
//		for(List list : adj) {
//			System.out.println(list);
//		}

		BFS(1);
		
	}
	
	//v : 시작 정점
	public static void BFS(int v) {
		Queue<Integer> queue = new LinkedList<>();
		
		queue.add(v);	// 시작 정점을 큐에 넣기
		visited[v] = true;
		
		//인접 리스트
		//큐가 공백상태가 될 때 까지 반복문 수행
		while(!queue.isEmpty()) {
			int curr = queue.poll();
			System.out.println(curr);
			
			//인접 리스트
			for(int w : adj[curr]) {
				if(!visited[w]) {
					queue.add(w);
					visited[w] = true;
				}
			}
		}
		
	}
	
	
	static String input = " 7 9\r\n"
			+ "1 2\r\n"
			+ "1 3\r\n"
			+ "1 6\r\n"
			+ "2 4\r\n"
			+ "2 7\r\n"
			+ "3 4\r\n"
			+ "4 7\r\n"
			+ "5 6\r\n"
			+ "5 7\r\n"
			+ "";
}
