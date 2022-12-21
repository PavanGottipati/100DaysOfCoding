// Java program to sort an array
// using bucket sort
import java.util.*;
import java.util.Collections;

class BucketSort 
{
  // Function to sort arr[] of size n
	// using bucket sort
	static void bucketSort(float arr[], int n)
	{
		if (n <= 0)
			return;

		// 1) Create n empty buckets
		@SuppressWarnings("unchecked")
		Vector<Float>[] buckets = new Vector[n];

		for (int i = 0; i < n; i++) 
        {
			buckets[i] = new Vector<Float>();
		}

		// 2) Put array elements in different buckets
		for (int i = 0; i < n; i++) 
        {
			float idx = arr[i] * n;
			buckets[(int)idx].add(arr[i]);
		}

		// 3) Sort individual buckets
		for (int i = 0; i < n; i++) 
        {
			Collections.sort(buckets[i]);
		}

		// 4) Concatenate all buckets into arr[]
		int index = 0;
		for (int i = 0; i < n; i++) 
        {
			for (int j = 0; j < buckets[i].size(); j++) 
            {
				arr[index++] = buckets[i].get(j);
			}
		}
	}
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=sc.nextInt();
        float arr[]=new float[n];
        System.out.println("Enter elements into array");
        for(int i=0;i<n;i++)
        {
          float a=sc.nextFloat();
		  arr[i] = (float)a;
        }
        System.out.println("Before Sorting, the array is ");
		for (float el : arr) 
        {
			System.out.print(el + "    ");
		}
		bucketSort(arr, n);
        System.out.println();
		System.out.println("Sorted array is ");
		for (float el : arr) 
        {
			System.out.print(el + "    ");
		}
	}
}
