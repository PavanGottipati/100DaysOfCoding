// Java program for implementation of Heap Sort using min heap
import java.util.Scanner;
import java.util.Arrays;
class MinHeapSort
{
	public void sort(int arr[],int n)
	{

		// Build heap (rearrange array)
		for (int i = n / 2 - 1; i >= 0; i--)
			heapify(arr, n, i);

		// One by one extract an element from heap
		for (int i=n-1; i>=0; i--)
		{
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// call max heapify on the reduced heap
			heapify(arr, i, 0);
		}
	}

	// To heapify a subtree rooted with node i which is
	// an index in arr[]. n is size of heap
	void heapify(int arr[], int n, int i)
	{
		int smallest = i; // Initialize smallest as root
		int l = 2*i + 1; // left = 2*i + 1
		int r = 2*i + 2; // right = 2*i + 2

		// If left child is smaller than root
		if (l < n && arr[l] < arr[smallest])
			smallest = l;

		// If right child is smaller than smallest so far
		if (r < n && arr[r] < arr[smallest])
			smallest = r;

		// If smallest is not root
		if (smallest != i)
		{
			int swap = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = swap;

			// Recursively heapify the affected sub-tree
			heapify(arr, n, smallest);
		}
	}
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements into array ");
        {
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
        }
		MinHeapSort ob = new MinHeapSort();
    System.out.println("Before sorting.....");
    System.out.println(Arrays.toString(arr));
		ob.sort(arr,n);
		System.out.println("Sorted array using Min Heap is ");
    System.out.println(Arrays.toString(arr));
	}
}

