import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 프림_우선순위큐 {
	
	static final int INF = Integer.MAX_VALUE;
	
	static class Edge implements Comparable<Edge>{
		int st, ed, w;

		public Edge(int st, int ed, int w) {
			super();
			this.st = st;
			this.ed = ed;
			this.w = w;
		}
		
		@Override
		public int compareTo(Edge o) {
			return Integer.compare(this.w,  o.w);
		}
	}
	
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(input);
		
		int V = sc.nextInt(); 	//정점의 수 0부터 시작
		int E = sc.nextInt();	//간선의 수
		
		//인접 리스트
		List<Edge>[] adjList = new ArrayList[V];
		                               
		// 리스트 배열의 초기화{
		for(int i =0 ; i < V; i++) {
			adjList[i] = new ArrayList<>();
		}
		
		for(int i = 0; i< E; i++) {
			int A = sc.nextInt();	//from
			int B = sc.nextInt();	//to
			int W = sc.nextInt();	//가중치
			
			adjList[A].add(new Edge(A, B, W));
			adjList[B].add(new Edge(B, A, W));
		}	//입력 끝
		
		
		//방문 처리 배열
		boolean[] visited = new boolean[V];
		PriorityQueue<Edge> pq = new PriorityQueue<>();
		
		visited[0] = true;	//0번 정점에서 시작
		
		//0번 정점과 인접한 친구들을 몽땅 넣어
//		for(int i =0; i< adjList[0].size(); i++) {
//			pq.add(adjList[0].get(i));
//		}
//		for(Edge e : adjList[0]) {
//			pq.add(e);
//		}
		pq.addAll(adjList[0]);
		
		int pick = 1;	//현재 확보한 정점의 개수
		int ans = 0;	//비용 0 초기화
		
		while(pick != V) {
			Edge e = pq.poll();		//처음에는 2번 정점이 뽑힌다. 우선순위 큐에서 가중치가 제일 작은것이 나온다
			
			if(visited[e.ed]) continue;	
			
			ans += e.w;
			
			visited[e.ed] = true;
			pick++;
			
			//반복문을 돌면서 갱신할 수 있는거 전부 갱신
			pq.addAll(adjList[e.ed]);
		}
		
		System.out.println(ans);
	}
	
	static String input = "7 11\r\n" + "0 1 32\r\n" + "0 2 31\r\n" + "0 5 60\r\n" + "0 6 51\r\n" + "1 2 21\r\n"
			+ "2 4 46\r\n" + "2 6 25\r\n" + "3 4 34\r\n" + "3 5 18\r\n" + "4 5 40\r\n" + "4 6 51\r\n" + "";
}
