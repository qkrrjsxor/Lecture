
public class APS_Tree_순회 {
	//배열로 트리 표현
	static char[] tree = new char[] {'\0', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 0, 0, 'H', 'I'};
			
	public static void main(String[] args) {
		preorder(1);
		System.out.println();
		postorder(1);
		System.out.println();
		inorder(1);
	}
	
	//전위 순회
	//VLR
	static void preorder(int i) {
		
		if(tree.length <= i || tree[i] == 0) {
			return;
		}
		//부모노드 방문(출력)
		System.out.print(tree[i] + " ");
		//왼쪽 자식
		preorder(i*2);
		//오른쪽 자식
		preorder(i*2+1);  
	}
	
	//중위 순회
	//LVR
	static void inorder(int i) {
		
		if(tree.length <= i || tree[i] == 0) {
			return;
		}
		
		//왼쪽 자식 
		inorder(i*2);
		
		System.out.print(tree[i] + " ");
		//오른쪽 자식
		inorder(i*2+1);  
		
	}  
	
	//후위 순회
	//LRV
	static void postorder(int i) {
		
		if(tree.length <= i || tree[i] == 0) {
			return;
		}
		
		//왼쪽 자식 
		postorder(i*2);
				
		//오른쪽 자식
		postorder(i*2+1);  
		
		System.out.print(tree[i] + " ");
	}
}
