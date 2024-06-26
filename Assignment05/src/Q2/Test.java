package Q2;

import Q2.RecurciveBST.Node;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecurciveBST r= new RecurciveBST();
		r.addRecursive(10);
		r.addRecursive(20);
		r.addRecursive(30);
		r.preorderDisplay();
		Node foundNode=r.recursiveSeacrh(60);
		if(foundNode!=null)
		{
		System.out.print(" Node found");
		}
		else
		{
			System.out.print(" Node not found");
		}
	}

}
