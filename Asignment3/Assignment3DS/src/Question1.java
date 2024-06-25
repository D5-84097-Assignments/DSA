class List{
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value)
		{
			data = value;
			next = null;	
		}
	}	

	private Node tail;
	private Node trav;
	private int count;

	public List()
	{
	  tail =null;
	  count =0;
	}

	public void addFirst(int value)
	{
		Node newNode = new Node(value);
		if(tail == null)
		{
			tail = newNode;
    		newNode.next = tail;
		}
		else 
		{	
			newNode.next = tail.next;
			tail.next = newNode;
		}	
		count++;
	}
	
	public void addLast(int value)
	{
		Node newNode = new Node(value);
		
		if(isEmpty())
		{
			tail = newNode;
			newNode.next = newNode;
		}
		else {
				
				newNode.next = tail.next;
				tail.next = newNode;
				tail = newNode;
		}
				count++;
	}
	
	public void addPosition(int value, int pos)
	{
		if(pos < 1 || pos > count +1)
		{
			System.out.println("Invalid position");
		}
		
		Node newNode = new Node(value);
		
		if(tail == null)
		{
			tail = newNode;
		}
		else if(pos==1)
		{
			addFirst(value);
		}
		else 
		{	
			trav = tail;
			for(int i =1; i< pos; i++)
			{
				trav = trav.next;	
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}
		count++;		
	}
	
	public void deleteFirst()
	{
		if(isEmpty())
		{
			return;	
		}
		else if(tail.next == tail) 
		{
		  tail = null;
		}
		else{
			tail.next = tail.next.next;
		}
		count--;
	}
	
	public void deleteLast()
	{
		if(isEmpty())
		{
			return;
		}
		else if(tail.next == tail)
		{
			tail = null;
		}
		else{
			trav = tail;
			while(trav.next != tail)
			{
				trav =trav.next;
			}
			trav.next = tail.next;
			tail = trav;
		}
		count--;
	}
	
	public void deletePosition(int pos)
	{
		if(pos < 1 || pos > count)
		{
			System.out.println("invalid position");
		}
		if(isEmpty())
		{
			return;
		}
		else if(pos == 1)
		{
			deleteFirst();
		}
		else
		{
			trav = tail;
			for(int i = 1; i< pos; i++)
			{
				trav = trav.next;
			}
			trav.next = trav.next.next;
			if(pos == count)
				tail = trav;		    
		}
	}
	public boolean isEmpty()
	{
		return tail == null;
	}
	
	public void display()
	{
		if(isEmpty())
		{
			return;
		}
		trav = tail;
		System.out.print("List :  ");
		do {
			trav = trav.next;
			System.out.print(" " + trav.data);
		}while(trav != tail);
		System.out.println(" ");
		System.out.print("Node count :" + count);
	}	
}

public class Question1 {
	public static void main(String[] args) 
	{
		List l1 = new List();
		l1.addFirst(10);	
		l1.addFirst(20);
		l1.addLast(30);
//		l1.addPosition(50, 3);
//		l1.addPosition(50, 2);
//		l1.addPosition(50, 4);
		l1.addFirst(40);
		l1.addFirst(50);
		l1.addFirst(60);
//		l1.deleteFirst();
//		l1.deleteLast();
		l1.deletePosition(3);
		l1.display();
	}
}
