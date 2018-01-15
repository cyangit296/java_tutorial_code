import Sort.*;

public class testone {
	public static void main(String [] args)
	{
		int arr [] = {0,1,5,8,3,9,7,6,2,4,10};
		Array tmp = new Array(arr);
	//	tmp.QuickSort(0,arr.length-1);
	//	tmp.BubbleSort();
	//	tmp.InsertSort();
	//	tmp.SelectionSort();
		tmp.InterchangeSort();	
		
		System.out.println("Day sau sap xep");
		arr = tmp.arrDiscending();
		for (int i=0;i<arr.length;i++)
			System.out.print(arr[i]+ " ");
		System.exit(0);
	}
}


