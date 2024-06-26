package Q3;
//3. Delete node which is having 2 childs in BST. (Replace node data by inorder successor)

public class BST {
	

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
	public BST()
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
	
	public void inorderDisplay()
	{
		System.out.print("Inorder :");
		inorderDisplay(root);
		System.out.println(" ");
		
	}

	private void inorderDisplay(Node trav)//LVR 
	{
		if(trav==null)
		{
			return;
		}
		else
		{
		inorderDisplay(trav.left);
		System.out.print(trav.data+" ");
		inorderDisplay(trav.right);
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
	
	public Node[] binarySearchWithParent(int key)
	{
		Node trav=root;
		Node parent=null;
		while(trav!=null)
		{
			if(key==trav.data)
				break;
			parent=trav;
			
			if(key<trav.data)
			{
				trav=trav.left;
			}
			else
			{
				trav=trav.right;
			}
		}
		if(trav==null)
			parent=null;
		return new Node[] {trav,parent};
	}
	
	public void deleteNode(int key)
	{
		//1. search node with its parents
		Node arr[] = binarySearchWithParent(key);
		Node temp = arr[0], parent = arr[1];
		//2. if node is not found
		if(temp == null)
			return;
		//3. if node has 2 childs
		if(temp.left != null && temp.right != null){
			//1. find predecessor of temp.data
			Node pred = temp.left;
			parent = temp;
			while(pred.right != null){
				parent = pred;
				pred = pred.right;
			}
			//2. replace temp's data by predecessor's data
			temp.data = pred.data;
			//3. delete predecessor
			temp = pred;
		}
	}
}
