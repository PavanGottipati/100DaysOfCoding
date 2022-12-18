// Java program for counting sort
import java.util.*;

class CountingSort {

	static void countSort(int[] arr)
	{
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		int range = max - min + 1;
		int count[] = new int[range];
		int output[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i] - min]++;
		}

		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			output[count[arr[i] - min] - 1] = arr[i];
			count[arr[i] - min]--;
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = output[i];
		}
	}

	static void printArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

	// Driver code
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements into array");
        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
        // Function call
		countSort(arr);
    System.out.println("After counting sort implementation, the array is");
		printArray(arr);
	}
}

