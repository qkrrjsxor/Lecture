import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 프림_반복문 {
	
	static final int INF = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(input);
		
		int V = sc.nextInt(); 	//정점의 수 0부터 시작
		int E = sc.nextInt();	//간선의 수
		
		//인접 행렬
		int[][] adjArr = new int[V][V];
		
		for(int i = 0; i< E; i++) {
			int A = sc.nextInt();	//from
			int B = sc.nextInt();	//to
			int W = sc.nextInt();	//가중치
			
			adjArr[A][B] = adjArr[B][A] = W;	//무향 그래프 
		}
		
		//방문 처리를 위해 배열 선언
		boolean[] visited = new boolean[V];
		int[] parent = new int[V];		//내가 어디서 왔는지, 문제에 따라서 필요할수도 있고 없을수도
		int[] dist = new int[V];		//key 라고 했던 가장 작은 비용을 저장하기 위한 배열
		
		//dist를 초기화
		for(int i = 0; i< V; i++) {
			dist[i] = INF;
			parent[i] = -1;
		}
		
		// 임의의 한 점 시작해서 돌려
		dist[0] = 0;
		
		int ans =0;
		
		//정점 선택하며 돌리는 사이클
		for(int i = 0; i < V-1; i++) { // i<V 까지 해도 상관은 없다
			int min = INF;
			int idx = -1;
			//아직 안뽑힌 정점들 중 가장 작은 값을 뽑겠다.
			
			for(int j = 0 ; j < V; j++) {
				if(!visited[j]&&dist[j] < min) {
					min = dist[j];
					idx = j;
				}
			} //해당 for 문 종료 시 idx : 가장 작은 값을 가지고 있는 방문하지 않은 정점이 선택됨
			
			visited[idx] = true;
			
			//뽑은 친구(idx)와 인접한 정점들 중 갱신할 수 있으면 갱신
			for(int j = 0 ; j< V; j++) {
				//방문하지 않았고, idx에 붙어있고, 그 가중치 (adj[idx][j]) 가 dist[j]에 저장된 값보다 작으면 갱신
				if(!visited[j] && adjArr[idx][j] != 0 && dist[j] > adjArr[idx][j]) {
					dist[j] = adjArr[idx][j];
					parent[j] = idx;
				}
			}
		}
		
		for(int i = 0; i< V; i++) {
			ans += dist[i];
		}
		
		System.out.println(Arrays.toString(dist));
		System.out.println(Arrays.toString(parent));
		System.out.println(ans);
	}
	
	static String input = "7 11\r\n" + "0 1 32\r\n" + "0 2 31\r\n" + "0 5 60\r\n" + "0 6 51\r\n" + "1 2 21\r\n"
			+ "2 4 46\r\n" + "2 6 25\r\n" + "3 4 34\r\n" + "3 5 18\r\n" + "4 5 40\r\n" + "4 6 51\r\n" + "";
}
