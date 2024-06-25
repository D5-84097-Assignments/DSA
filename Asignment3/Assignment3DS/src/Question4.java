class SinlglyList{
		
		static class Node{
		
			private int data;
			private Node next;
			
			public Node(int value)
			{
				data = value;
				next = null;
			}						
		}
		
		public Node head;
		public Node next;
		public Node trav;
		public boolean isEmpty()
		{
			return head == null;
		}
		
		public void addFirst(int value)
		{
			if(head == null)
				return;
			Node newNode = new Node(value);
				newNode.next = head;
				head = newNode;
		}
		
		public void addNode(int value)
		{	
			Node newNode = new Node(value);
			
			trav = head;

			if(head == null)
				head = newNode;		
			
			else if(value < trav.data)
			{	
//				trav = head;
				addFirst(value);
				System.out.println("-------------");
			}
			
			else if(value > trav.data)
			{	  
				trav = head;
					while(trav.next != null)
					{ 
						if(trav.data < newNode.data && trav.data > newNode.data)
						{	
							newNode.next = trav.next;
							trav.next = newNode;
							return;
						}
						trav = trav.next;
					}			
					trav.next = newNode;
			}
			else
			{
				trav.next = newNode;
			}
		}
		public void displayNodes()
		{
			trav = head;
			while(trav != null) 
			{ 
				System.out.println("Nodes - "  + trav.data);	
				trav = trav.next;
			}
			
		}
}
			

public class Question4 {

	public static void main(String[] args) 
	{
		SinlglyList s1 = new SinlglyList();
		s1.addNode(10);
		s1.addNode(20);
		s1.addNode(5);
		s1.addNode(99);
		s1.addNode(1);
		s1.displayNodes();
	}

}
