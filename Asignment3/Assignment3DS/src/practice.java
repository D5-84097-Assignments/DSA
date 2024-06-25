
public class practice {

	public static void printArray( int[]arr1, int i, int last)
	{	
		if(i>=last)
			return;
		System.out.print(" >>> "+arr1[i]);
		printArray(arr1,i+1,last);
	}
	
	public static void main(String[] args) {
		
		int []arr1 = {1,2,3,4,5,6};		
		practice.printArray(arr1,0,arr1.length);
		
	}
}
