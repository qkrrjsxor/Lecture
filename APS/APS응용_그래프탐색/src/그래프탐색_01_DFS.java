import java.util.Scanner;

public class 그래프탐색_01_DFS {
	static int V;	//정점의 수
	static int[][] adj;	//인접 행렬
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(input);
		
		V = sc.nextInt();
		int E= sc.nextInt();
		
		adj = new int[V+1][V+1]; //시작 정점이 1번부터 시작 -> V+1 크기
		
		visited = new boolean[V+1];
		
		for(int i = 0; i < E ; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			adj[A][B] = adj[B][A] = 1;
		}
		
		DFS(1);
	}
	
	public static void DFS(int V) {
		
		visited[V] = true;
		System.out.println(V);
		
		for(int i = 1; i<=V; i++) {
			if( !visited[i] && adj[V][i] ==1) {
				DFS(i);
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
