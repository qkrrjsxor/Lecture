package doubly;



class Node {
	String data;
	Node prev;
	Node next;

	Node() {
	}

	Node(String data) {
		this.data = data;
	}
}

class DoublyLinkedList {
	Node head;
	Node tail;
	int size;

	DoublyLinkedList() {
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.prev = head;
	}

	// 삽입
	// 마지막에삽입
	void addLast(String data) {
		Node newNode = new Node(data);

		// newNode 먼저 연결
		newNode.next = tail;
		newNode.prev = tail.prev;

		// newNode 양옆에 있는 노드가 newNode를 가리키도록
		newNode.next.prev = newNode;
		newNode.prev.next = newNode;
	}

	// 삭제
	void remove(int idx) {
		if (!(0 <= idx && idx < size)) {
			System.out.println("삭제할 수 없는 범위입니다.");
			return;
		}
		
		Node rmNode = head;
		
		for(int i = 0; i <= idx; i++) {	//반복문이 끝나면 rmNode는 삭제할 노드를 가리킴
			rmNode = rmNode.next;		
		}
		
		rmNode.prev.next = rmNode.next;
		rmNode.next.prev = rmNode.prev;
		
		size--;
	}
	
	// 출력
		void printList() {
			Node curr = head.next;

			while (curr != null) {
				System.out.print(curr.data + " -> ");
				curr = curr.next;
			}
			System.out.println();
		}


}

public class APS_LinkedList_양방향연결리스트 {
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.addLast("a");
		list.addLast("b");
		list.addLast("c");
		list.printList();
	}
}
