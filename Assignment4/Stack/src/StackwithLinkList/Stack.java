package StackwithLinkList;

public class Stack {
	
	public static void main(String[] args)
	{
		DoublyCircularLinklist dcll = new DoublyCircularLinklist();
		dcll.addFirst(10);
		dcll.addFirst(20);
		dcll.addFirst(30);
		dcll.addFirst(40);
		
		dcll.fDisplay();
		
		dcll.deleteFirst();
		dcll.deleteFirst();
		dcll.deleteFirst();
//		dcll.deleteFirst();
	
		dcll.fDisplay();

		//dcll.deleteFirst();
	
		
	}
}
