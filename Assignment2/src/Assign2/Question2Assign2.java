package Assign2;

class InsertionSortDesc
{
	int j;
	int temp;
	
	public void insertionSortDesc(int[] arr)
	{
	for(int i = 1; i< arr.length; i++)
	 {
		j = i-1;
	    temp = arr[i];
	    
	    while(j >= 0 && arr[j] < temp)
	    {
	    	arr[j+1] = arr[j];
	    	j--;
	    }
		arr[j+1] = temp;
     }
	
	for(int i=0; i<arr.length; i++)
	{
		System.out.print(arr[i] + " ");
	}
	
	}	
}

public class Question2Assign2 {

	public static void main(String[] args)
	{
		int[]arr = {1000, 50, 40, 30, 70, 5000};
		InsertionSortDesc is1 =  new InsertionSortDesc();
		is1.insertionSortDesc(arr);
	
	}
	
}
