package StackwithLinkList;

class DoublyCircularLinklist {

	static class Node{
			
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int value)
		{
			data = value;
			next = prev = null;
		}
	}
	
	private Node head;
	private Node tail;
	private Node trav;
	private int count;

	
	public DoublyCircularLinklist()
	{
		head = null;
		count = 0;
	}
	
	public void addFirst(int value)
	{
		Node newNode = new Node(value);

		if(head == null)	
		{
		 head = newNode;
		 newNode.next = newNode.prev = newNode;
		}
		else {
			
			newNode.next = head;
			newNode.prev = head.prev;
			head.prev.next = newNode;
			head.prev = newNode;
			head = newNode;
		}
		count++;
	}
	
	public void addPosition(int value, int pos)
	{
		if(pos < 1 || pos > count + 1)
		{
			System.out.println("Invalid Position");
			return;
		}
		Node newNode = new Node(value);
		if(head == null)
		{
			head = newNode;
			newNode.next = newNode.prev = newNode;
		}
		else {
		trav = head;
		for(int i=1; i<pos-1; i++)
		{
		  trav = trav.next;
		}
	
		newNode.next = trav.next;
		newNode.prev = trav;
		trav.next = newNode;
		newNode.next.prev = newNode;
		}
	}	
	
	public void addLast( int value, int pos)
	{
		Node newNode = new Node(value);
		if(head == null)
		{
			head = newNode;
			
			newNode.next = newNode;
			newNode.prev = newNode;
		}
		else {
			newNode.next = head;
			newNode.prev = head.prev;
			head.prev.next = newNode;
			head.prev = newNode;
		}
		count++;
	}

	public void deleteFirst()
	{	
		if(head == null)
			return;
		else if(head.next == head)
		{
			head = null;
		}
		
		else{
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;
		}
		count--;
	}
	public void deleteLast()
	{
		if(head == null)
			return;
		else if(head.next == head)
		{
			head = null;
		}
		else {
			head.prev = head.prev.prev;
			head.prev.next = head;
		}
		count--;
	}
	public void deletePosition(int pos)
	{	
		if(pos < 1 || pos > count)
		{	System.out.println("Invalid position");
				return;
		}
		 if(head == null)
		{
			return;
		}
		else if(head == head.next)
		{
			head = null;
		}
		else if(pos == 1)
		{
			deleteFirst();
			return;
		}
		else
		{
			trav = head;
			
			for(int i=1; i<pos; i++)
			{
				trav = trav.next;
			}
			trav.prev.next = trav.next;
			trav.next.prev = trav.prev;
		}
		 count--;
	}
	
	public void fDisplay()
	{
		if(head == null)
		{
			return;
		}
		trav = head;
		System.out.println("Link List in Forward Dirn");
		
		do {
			System.out.println(" " + trav.data);			
			trav = trav.next;
			
		}while(trav != head);
		System.out.println(" ");
	
	}
	
	public void RDisplay()
	{
		if(head == null)
		{
			return;
		}
		trav = head;
		System.out.println("Link List in Backward Dirn");
		
		do {
			System.out.println(" " + trav.data);			
			trav = trav.prev;
			
		}while(trav != head.prev);
		System.out.println(" ");
	
	}
	
	public int size()
	{
		return count;
	}
	
	public void deleteAll()
	{
		head = null;
		count =0;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
}
