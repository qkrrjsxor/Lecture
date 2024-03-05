import java.util.Scanner;

class Node {
	int data;
	int num;
	Node left;
	Node right;

	Node() {
	}

	Node(int data) {
		this.data = data;
	}
}

/*
 13 
 1 2 1 3 2 4 3 5 3 6 4 7 5 8 5 9 6 10 6 11 7 12 11 13
 */
public class APS_Tree_연습문제 {

	static Node[] nodes = new Node[14];
	static int[] count = new int[14];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int i = 1; i < 14; i++) {
			nodes[i] = new Node();
			nodes[i].num = i;
		}
		
		int V = sc.nextInt();

		// V-1개 간선의 정보가 주어진다
		for (int i = 0; i < V - 1; i++) {
			int parent = sc.nextInt();
			int child = sc.nextInt();
			
			count[child]++;
			
			if(nodes[parent].left == null) {
				nodes[parent].left = nodes[child];
				
			}else {
				nodes[parent].right = nodes[child];
			}
			
		}
		
		int root = -1;
		for(int i = 1; i< 14; i++) {
			if(count[i] == 0) {
				root = i;	//child로 나온적 없는 노드
			}
		}
		
		preorder(nodes[root]);
	}
	
	static void preorder(Node node) {
		if(node == null) {
			return;
		}
		System.out.println(node.num);
		
		preorder(node.left);
		preorder(node.right);
	}

}
