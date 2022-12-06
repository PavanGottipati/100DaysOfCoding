// Java program for implementation of Selection Sort
import java.util.Scanner;
class SelectionSortOperation
{
	void sort(int arr[])
	{
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n-1; i++)
		{
			// Find the minimum element in unsorted array
			int smallest = i;
			for (int j = i+1; j < n; j++)
            {
				if (arr[j] < arr[smallest])
                {
					smallest = j;
                }
            }
			// Swap the found minimum element with the first element
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
	}

	// Prints the array
	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
        {
			System.out.print(arr[i]+" ");
        }
        System.out.println();
	}
}
class SelectionSort
{
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
		SelectionSortOperation ob = new SelectionSortOperation();
		System.out.println("Enetr array size ");
        int n=sc.nextInt();
        if(n>0)
        {
        int arr[]=new int[n];
        System.out.println("Enter elements into array ");
        for(int i=0;i<n;i++)
        {
         arr[i]=sc.nextInt();
        }
        System.out.println("Before Sorting, the elements are");
        ob.printArray(arr);
		ob.sort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
        }
        else
        {
            System.out.println("The array size should be greater than Zero");
        }
	}
}

