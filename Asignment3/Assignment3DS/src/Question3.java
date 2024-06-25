class SinglyLinkList{
	
	static class Node 
	{
		private int data;
		private Node next;		
		
		public Node(int value){
			data = value;
			next = null;
		}
	}
	
	public Node head;
	private Node trav;
	public static int count;
	public SinglyLinkList()
	{
		head = null;
		count =0;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void addFirst(int value)
	{	
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
		count++;
	}
	
	public void addLast(int value)
	{
		if(head == null)
			return;
		
		Node newNode = new Node(value);
		
		trav = head;
		while( trav != null)
		{
			trav  = trav.next;
		}
		trav.next = newNode;
		count++;
	}
	
	public void addPosition(int value, int pos)
	{
		Node newNode = new Node(value);
		if(head == null)
			head = newNode;
		
		else if(pos <= 1)
		{
			addFirst(value);
		}
		else			
		{
			trav = head;
			for(int i=1; i<pos-1 && trav.next != null; i++)
			{
				trav = trav.next;
			}
			 newNode.next = trav.next;
			 trav.next = newNode;
			 
			 count++;
		}
		
	}
	
	public void deleteFirst()
	{
		if(head == null)
		{
			return;
		}
		else{
			
			head = head.next;
		}
	}
	
	public void deleteLast()
	{
		if(head==null)
			return;
		
		else if(head.next == null)
		{
			head = null;
		}
		else
		{
			trav = head;
			while(trav.next.next != null)
			{
				trav = trav.next;
			}
			trav.next = null;
		}
	}	
	
	public void deletePosition(int pos)
	{
		if(head == null)
		return;
		
		else if(pos <= 1)
		{
			head = null;
		}
		else{
			trav = head;
			for(int i=1 ; i < pos-1 && trav.next != null ; i++)
			{
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
	}
	
	public int LinkListValues()
	{	trav = head;
		trav = trav.next;
		return trav.data;
	}
	
	public void display()
	{	trav = head;	
		System.out.println("List :: ");
		while(trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}			
		 System.out.println("");

//		 System.out.println(count);
	}
	
	public void displayReverse(Node trav)
	{	
		if(trav == null)
			return;
		displayReverse(trav.next);
		System.out.print( trav.data + " ");
		
	}
	
	public int count()
	{
		return count;
	}
}


public class Question3 {

	public static void main(String[] args) {

		SinglyLinkList s1 = new SinglyLinkList();
		s1.addFirst(40);
		s1.addFirst(30);
		s1.addFirst(20);
		s1.addFirst(10);
		s1.display();
		s1.displayReverse(s1.head);
//		System.out.print(s1.LinkListValues() + " ");
//		printInReverse(s1, 1);
	}

}
