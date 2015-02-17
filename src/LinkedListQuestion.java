
class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	private Node head = null;
	private Node tail = null;

	public LinkedList(int data) {
		head = new Node(data);
		tail = head;
	}

	public LinkedList() {
		head = null;
		tail = head;
	}

	public Node getHead() {
		return head;
	}

	public void insert(int data) {
		if (tail != null) {
			Node temp = new Node(data);
			tail.next = temp;
			tail = tail.next;
		} else {
			head = new Node(data);
			tail = head;
		}
	}

	public void printList() {
		Node tempNode = head;
		if (tempNode == null) {
			System.out.println("Linked List is empty");
		}

		while (tempNode != null) {
			System.out.print(tempNode.data + " ");
			tempNode = tempNode.next;
		}
		System.out.println();
	}
}

public class LinkedListQuestion {

	LinkedList _ll = null;

	public LinkedListQuestion() {
		_ll = new LinkedList(1);
		_ll.insert(2);
		_ll.insert(3);
		_ll.insert(4);
		_ll.insert(5);
		//_ll.insert(6);
		//_ll.printList();
		//revAltNodeAppendEnd(_ll);
	}

	// 10-->13-->7-->21-->3
	// reverse alternate node and append to end.
	public void revAltNodeAppendEnd(LinkedList ll) {

		Node head = ll.getHead();

		if (head == null || head.next == null || head.next.next == null)
			return;

		Node even = null;
		Node temp = null;
		Node curr = head;
		while (curr.next != null) {
			temp = curr.next;
			curr.next = temp.next;
			temp.next = even;
			even = temp;
			if (curr.next != null)
				curr = curr.next;
		}
		curr.next = even;

		Node printNode = head;
		while (printNode != null) {
			System.out.print(printNode.data + " ");
			printNode = printNode.next;
		}
	}
}
