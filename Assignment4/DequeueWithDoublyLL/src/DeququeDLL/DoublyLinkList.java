
public class DoublyLinkList {

	static class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}
	
	private Node head;
	private Node tail;
	public List() {
		head = tail = null;
	}
	
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	
	public void addFirst(int value) {

		Node newnode = new Node(value);
		if(isEmpty())
			head = tail = newnode;

		else {
			newnode.next = head;
			head.prev = newnode;
			head = newnode;
		}
	}
	
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(isEmpty())
			head = tail = newnode;
		else {
			newnode.prev = tail;
			tail.next = newnode;
			tail = newnode;
		}
	}
	
	public void deleteFirst() {
		
		if(isEmpty())
			return;
		else if(head == tail)
			head = tail = null;
		else {		
			head = head.next;
			head.prev = null;
		}
	}
	
	public void deleteLast() {
		if(isEmpty())
			return;
		else if(head == tail)
			head = tail = null;
		else {
			tail = tail.prev;
			tail.next = null;
		}
	}

	public void forwardDisplay() 
		Node trav = head;
		System.out.print("Forward List : ");
		while(trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
	
	public void reverseDisplay() {
		Node trav = tail;
		System.out.print("Reverse List : ");
		while(trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.prev;
		}
		System.out.println("");
	}
	
	public void deleteAll() {
		head = tail = null;
	}
}





















