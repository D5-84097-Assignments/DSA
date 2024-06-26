package Q1;
//1. Write recursive function to add node into bst.

public class BinarySearchTree
{
	public class Node
	{
		private int data;
		private Node right;
		private Node left;
		public Node(int value)
		{
			data=value;
			right=left=null;
		}
	}
	private Node root;
	public BinarySearchTree()
	{
		root=null;
	}
	
	public boolean isEmpty()
	{
		return root==null;
	}
	
	public void recursiveAdd(int value)
	{
		if(isEmpty())
		{
			root=new Node(value);
		}
		else
		{
			recursiveAdd(value,root);
		}
	}

	private void recursiveAdd(int value, Node trav)
	{
		if(value<trav.data)
		{
			if(trav.left==null)
			{
				trav.left=new Node(value);  
				return;
			}
			else
			{
				recursiveAdd(value,trav.left);
			}
		}
		else
		{
			if(trav.right==null)
			{
				trav.right=new Node(value);
				return;
			}
			else
			{
				recursiveAdd(value,trav.right);
			}
		}
		
	}
	
	
	public void preorder()
	{
		System.out.print("Preorder :");
		preorder(root);
	}

	private void preorder(Node trav) {
		if(trav==null)
		{
			return;		
		}
		else
		{
			System.out.print(trav.data+" ");//visit
			preorder(trav.left);//left
			preorder(trav.right);//right
		}
	}
	
	public void inorder()
	{
		System.out.print("Inorder :");
		inorder(root);
	}

	private void inorder(Node trav) {
		if(trav==null)
		{
			return;
		}
		else
		{
			inorder(trav.left);//Left
			System.out.print(trav.data+" ");//value
			inorder(trav.right);//right
		}
	}
	
	public void postorder()
	{
		System.out.print("Postorder :");
		postorder(root);
	}

	public void postorder(Node trav) {
		if(trav==null)
		{
			return;
		}
		else
		{
			postorder(trav.left);//left
			postorder(trav.right);//right
			System.out.print(trav.data+" ");//value
		}
	}
	

}
