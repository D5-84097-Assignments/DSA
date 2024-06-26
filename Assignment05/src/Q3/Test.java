package Q3;

import Q3.BST.Node;

//3. Delete node which is having 2 childs in BST. (Replace node data by inorder successor)

public class Test {

	public static void main(String[] args) {
		BST r= new BST();
		r.addRecursive(30);
		r.addRecursive(20);
		r.addRecursive(50);
		r.addRecursive(80);
		r.addRecursive(40);
		r.addRecursive(10);
		r.addRecursive(70);
		r.inorderDisplay();
		r.deleteNode(50);
		r.inorderDisplay();
//		Node foundNode=r.recursiveSeacrh(60);
//		if(foundNode!=null)
//		{
//		System.out.print(" Node found");
//		}
//		else
//		{
//			System.out.print(" Node not found");
//		}

	}

}
