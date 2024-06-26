package Q1;

public class Test {

	public static void main(String[] args) {
		BinarySearchTree t= new BinarySearchTree();
		t.recursiveAdd(10);
		t.recursiveAdd(30);
		t.recursiveAdd(50);
		t.recursiveAdd(40);
		t.recursiveAdd(20);
		t.preorder();
		t.postorder();
		t.inorder();
	}

}
