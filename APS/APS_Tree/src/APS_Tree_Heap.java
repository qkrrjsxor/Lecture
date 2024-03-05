import java.util.Arrays;

public class APS_Tree_Heap {
	static int[] heap = new int[100];
	static int heapSize;

	public static void main(String[] args) {
		
		heapPush(55);
		heapPush(56);
		heapPush(54);
		heapPush(32);
		heapPush(1);
		heapPush(11);
		
		
		System.out.println(Arrays.toString(heap));
		System.out.println(heapPop());
		
//		System.out.println(Arrays.toString(heap));
		System.out.println(heapPop());
		
//		System.out.println(Arrays.toString(heap));
		System.out.println(heapPop());
		
//		System.out.println(Arrays.toString(heap));
		System.out.println(heapPop());
		
//		System.out.println(Arrays.toString(heap));
		System.out.println(heapPop());
		
//		System.out.println(Arrays.toString(heap));
		System.out.println(heapPop());
	}

	//삽입연산
	static void heapPush(int data) {

		// 마지막 위치에 노드 추가 (이진트리형태 유지)
		heap[++heapSize] = data;

		// 부모와 비교하면서 swap
		int child = heapSize;
		int parent = heapSize / 2; // 부모 노드의 인덱스

		
		//스왑을 멈추는 조건 : 
		//1.루트 노드이거나 2. 부모노드가 큰 경우(최대 힙)
		while (parent > 0 && heap[parent] < heap[child]) {	
			// swap
			int tmp = heap[parent];
			heap[parent] = heap[child];
			heap[child] = tmp;

			child = parent;
			parent = child / 2;
		}
	}
	
	//삭제연산
	static int heapPop() {
		
		//루트에 있는 원소 제거
		int popItem = heap[1];
		
		//마지막에 있는 leaf node 루트로 옮기기
		heap[1] = heap[heapSize--];
		
		int parent = 1;	//루트노드 인덱스
		int child = parent*2;	//왼쪽 자식 인덱스
			
		
		//스왑을 멈추는 조건 
		//1. leaf 노드 이거나, 자식 노드가 더 작은 경우(최대 힙)
		while(child <= heapSize && heap[parent] < heap[child]) {
			
			//오른쪽 자식이 있고, 왼쪽 자식보다 오른쪽 자식의 수가 더 크면, 
			if(child+1 <= heapSize && heap[child] < heap[child+1]) {
				child++;
			}
			//자식이 더 크면 swap
			int tmp = heap[parent];
			heap[parent] = heap[child];
			heap[child] = tmp;
			
			parent = child;
			child = parent*2;
			

		}
		
		return popItem;
	}
	
	
}
