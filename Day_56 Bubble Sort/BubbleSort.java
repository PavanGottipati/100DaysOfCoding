//Java program to sort elements using bubble sort
import java.util.Scanner;
class BubbleSort
{  
  static void bubble(int[] arr,int n) 
  {  
    int temp = 0;  
    for(int i=0; i < n; i++)
    {  
     for(int j=1; j < (n-i); j++)
     {  
        if(arr[j-1] > arr[j])
        {  
           //swap elements  
           temp = arr[j-1];  
           arr[j-1] = arr[j];  
           arr[j] = temp;  
        } 
     } 
    }  
 }  
 static void printArray(int [] arr,int n)
 {
  for(int i=0;i<n;i++)
  {
    System.out.print(arr[i]+"  ");
  }
 }
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter array size ");
        int n=sc.nextInt();
        int arr[]=new int[n]; 
        System.out.println("Enter elements into array ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array Before Bubble Sort");  
        printArray(arr,n);
        System.out.println();  
        bubble(arr,n);//sorting array elements using bubble sort  
        System.out.println("Array After Bubble Sort");
        printArray(arr,n);   
    }  
}
