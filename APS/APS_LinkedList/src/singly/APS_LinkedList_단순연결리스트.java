package singly;

class Node {
	String data;
	Node link;

	Node() {
	}

	Node(String data) {
		this.data = data;
		// link = null;
	}
}

class SinglyLinkedList {
	Node head;
	int size = 0;

	SinglyLinkedList() {
		head = new Node();
	}

	// 앞에 삽입
	void addFirst(String data) {
		Node newNode = new Node(data);
		newNode.link = head.link;
		head.link = newNode;
		size++;
	}

	// 뒤에 삽입
	void addLast(String data) {
		Node newNode = new Node(data);

		Node curr = head;

		while (curr.link != null) {
			curr = curr.link;
		}
		curr.link = newNode;
		size++;
	}

	// 중간 삽입
	void add(int idx, String data) {
		if (idx < 0 || idx > size) {
			System.out.println("삽입할 수 없습니다");
			return;
		}

		Node curr = head;
		for (int i = 0; i < idx; i++) {
			curr = curr.link;
		}
		//curr 는 삽입하고자 하는 위치의 앞 노드를 가리킴
		
		Node newNode = new Node(data);
		
		newNode.link = curr.link;
		curr.link = newNode;
		
		size++;
		
	}

	// 삭제, idx에 있는 노드 삭제
	void remove(int idx) {
		if (idx < 0 || size <= idx) {
			System.out.println("삭제할 수 있는 범위를 벗어났습니다.");
			return;
		}

		Node curr = head;
		for (int i = 0; i < idx; i++) { // 반복문이 끝나면 curr는 삭제할 노드 앞 노드를 가리킴
			curr = curr.link;
		}
		curr.link = curr.link.link;
		size--;
	}

	// 출력
	void printList() {
		Node curr = head.link;

		while (curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.link;
		}
		System.out.println();
	}

	// 조회
//	int getSize() {
//
//	}
}

public class APS_LinkedList_단순연결리스트 {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();

		list.addFirst("송창용");
		list.addFirst("박건택");
		list.addLast("손영준");
		list.addLast("김윤홍");
		list.add(3, "황민욱");

		list.printList();

		list.remove(4);
		list.printList();
	}
}
