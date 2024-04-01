
public class 힙정렬 {
	static int[] heap = new int[100];
	static int heapSize;
	
	public static void main(String[] args) {
		heapPush(18);
		heapPush(5);
		heapPush(14);
		heapPush(3);
		
		System.out.println(heapPop());
		System.out.println(heapPop());
		System.out.println(heapPop());
		System.out.println(heapPop());
	}
	
	private static int heapPop() {
		int popItem = heap[1];
		
		heap[1] = heap[heapSize--];
		
		int parent = 1; 
		int child = parent*2;
		
		while(child <= heapSize && heap[parent] < heap[child]) {
			if(child +1 <= heapSize && heap[child]<heap[child+1]) {
				child++;
			}
			
			swap(child, parent);
			
			parent= child;
			child = parent*2;
			
		}
		return popItem;
	}

	private static void heapPush(int data) {

		//마지막 위치에 노드 추가
		heap[++heapSize] = data;
		
		int child = heapSize;
		int parent = heapSize/2;
		
		while(parent > 0 && heap[parent] < heap[child]) {
			swap(parent, child);
			
			child = parent;
			parent = child/2;
		}
	}

	static void swap(int a, int b) {
		int tmp = heap[a];
		heap[a] = heap[b];
		heap[b] = tmp;
	}
}
