package StackwithLinkList;

public class Queue {
	
	public static void main(String[] args) {
		
		DoublyCircularLinklist dcll = new DoublyCircularLinklist();
		
		dcll.addFirst(10);
		dcll.addFirst(20);
		dcll.addFirst(30);
		dcll.addFirst(40);
		
		dcll.fDisplay();
		
		dcll.deleteLast();
		dcll.deleteLast();
		dcll.deleteLast();
		
		dcll.fDisplay();
		
	}

}
