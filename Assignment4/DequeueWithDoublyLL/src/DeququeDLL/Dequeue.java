package DeququeDLL;

public class Dequeue {

	public static void main(String[] args) {
		
		DoublyLLL dll = new DoublyLLL();
		
		dll.addFirst(10);
		dll.addFirst(20);
		dll.addLast(30);
		dll.addLast(40);
		
		dll.deleteFirst();
		dll.deleteLast();
		
		dll.forwardDisplay();
		
	}

}
