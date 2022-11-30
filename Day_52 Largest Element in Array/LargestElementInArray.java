//Java program to find the largest element in an array
import java.util.Scanner;
class LargestElementInArray {  
    public static void main(String[] args) 
    {  
        Scanner sc=new Scanner(System.in);
        //Initialize array  
        System.out.println("Enter array size ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements into array ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //Initialize max with first element of array.  
        int max = arr[0];  
        //Loop through the array  
        for (int i = 0; i < arr.length; i++) 
        {  
            //Compare elements of array with max  
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element present in given array: " + max);  
    }  
}  
