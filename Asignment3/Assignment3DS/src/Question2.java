class LinearList
{

	static class Node
	{
		private int data;
		private Node next;
		public Node(int value)
		{
			data = value;
			next = null;
		}
	}
		private Node head;
		private Node trav;
		
		public LinearList()
		{
			head = null;
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
		}
		
		public void addLast(int value)
		{
			Node newNode = new Node(value);
			
			if(isEmpty())
			{
				System.out.println("Linik LIst is Empty");
			}
			else {
				trav = head;
				while(trav.next != null)
				{
					trav = trav.next;			
				}				
				trav.next = newNode;
			  }
			}
		
		
		public void addPosition(int value, int pos)
		{
			Node newNode = new Node(value);
			
			if(head == null)
			{
				head = newNode;
			}			
			else if(pos <=1)
			{
				addFirst(value);
			}
			else
			{
				trav = head;
				
				for(int i=1; i<pos -1 && trav.next != null; i++)
				{
					trav = trav.next;
				}
				newNode.next = trav.next;
				trav.next = newNode;
			}
	     }
		
		public void deleteFirst()
		{
			if(head == null)
			{
				System.out.println("Linklist is empty");			
			}
			else {
				head = null;
			}		
		}
		
		public void deleteLast()
		{
			if(head == null)
			{	return;
			}
			else if(head.next == null){
				head = null;
			}
			else {
				
				trav = head;
				while(trav != null)
				{
					trav = trav.next;
				}
				trav.next =null;			
			}
		}
		
		public void deletePosition(int pos)
		{
			if(head == null)
			{
				return;
			}
			else if(head.next == null)
			{
				head = null;
			}
			else {
				trav = head;
				for(int i=1; i<pos-1 && trav.next != null; i++)
				{
					trav = trav.next;
				}
				trav.next = trav.next.next;
			}
		}
		
		public void display()
		{
//			Node newNode = new Node();
			trav = head;
			System.out.println("List :: ");
			
			while(trav != null)
			{
				System.err.print(" " + trav.data);
				trav = trav.next;
			}
			System.out.print(" ");
		}
		
		public void deleteAll()
		{
			head = null;
		}
	}


public class Question2 {

	public static void main(String[] args) 
	{
		LinearList l1 = new LinearList();
//		l1.addFirst(1);
//		l1.addFirst(2);
//		l1.addLast(3);
//		l1.addPosition(4, 2);
		
		l1.addFirst(20);
		l1.addFirst(10);
		l1.addLast(30);
		l1.display();
	}
}
