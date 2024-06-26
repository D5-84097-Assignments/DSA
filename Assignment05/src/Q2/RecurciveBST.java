package Q2;
//2. Write recursive function to perfrom search operation in bst.


public class RecurciveBST 
{
	public static class Node
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
	public RecurciveBST()
	{
		root=null;
	}
	
	public boolean isEmpty()
	{
		return root==null;
	}
	
	public void addRecursive(int value)
	{
		if(isEmpty())
		{
			root=new Node(value);
		}
		else
		{
			addNode(root,value);
		}
	}
	
	public void addNode(Node trav,int value)
	{
		if(value <trav.data)//value is less than node then go to left
		{
			if(trav.left==null)
			{
				trav.left=new Node(value);
			}
			else
			{
			addNode(trav.left,value);	
			}
		}
		
		else//value is greater than node go to left of that node
		{
			if(trav.right==null)
			{
				trav.right=new Node(value);
			}
			else
			{
				addNode(trav.right,value);
			}
		}
	}
	
	public void preorderDisplay()
	{
		System.out.print("Preorder :");
		preorderDisplay(root);
		System.out.println(" ");
		
	}

	private void preorderDisplay(Node trav)//VLR 
	{
		if(trav==null)
		{
			return;
		}
		else
		{
		System.out.print(trav.data+" ");
		preorderDisplay(trav.left);
		preorderDisplay(trav.right);
		}
	}
	
	public Node recursiveSeacrh(int value)
	{
		System.out.print("Recursive Search Result :");
		return  recursiveSeacrh(root,value);
	}

	private Node recursiveSeacrh(Node trav, int value)
	{
		if(trav==null || trav.data==value)//root null or value found
		{
			return trav;
		}
		
		if(value<trav.data)//root is greater than value then go to right of tree
		{
			recursiveSeacrh(trav.left,value);
		} 
			
		return recursiveSeacrh(trav.right,value);//root is smaller than value then go to right of tree
		
	}

}
