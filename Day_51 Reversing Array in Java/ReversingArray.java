//Java program to reverse an array
import java.util.Scanner;
class ReversingArray 
{
	    /* Function to reverse arr[] from
        start to end*/
        static void rvereseArray(int arr[],
                        int start, int end)
        {
            int temp;
            
            while (start < end)
            {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }	
        
        /* Utility that prints out an
        array on a line */
        static void printArray(int arr[],
                                int size)
        {
            for (int i = 0; i < size; i++)
                System.out.print(arr[i] + " ");
            
            System.out.println();
        }
    
        public static void main(String args[]) 
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter array size");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("Enter elements into array");
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println("Actual array is ");
            printArray(arr, n);
            rvereseArray(arr, 0, n-1);
            System.out.println("Reversed array is ");
            printArray(arr, n);
            
        }
}
    
    
