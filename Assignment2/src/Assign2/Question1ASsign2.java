package Assign2;

class InsertionSort
{
	int j;
	int comparisons;
	public int insertionSort(int arr[])
	{		
		for(int i= 1; i<arr.length;i++)
		{	
			j = i-1;
			int temp = arr[i];  			
			while(j >=0 && arr[j] > temp)				
			{
				comparisons++;
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		return comparisons;
	}
}

public class Question1ASsign2 {

	public static void main(String[] args) {
		
		int arr[] = {80,50,90,100,500,70};
		InsertionSort i1 = new InsertionSort();
		
		int comparisons = i1.insertionSort(arr);
		System.out.println(comparisons);
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print( arr[i] + " ");
		}
	}

}
