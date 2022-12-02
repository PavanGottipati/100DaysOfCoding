//Java program to print the even and odd elements in an array
import java.util.Scanner;
class EvenOddNumbersInArray {
    public static void main(String [] args)
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
     System.out.println();
     System.out.println("The Even elements are ");
     for(int i=0;i<n;i++)
     {
        if(arr[i]%2==0)
        {
            System.out.print(arr[i]+"  ");
        }
     }
     System.out.println();
     System.out.println("The Odd elements are ");
     for(int i=0;i<n;i++)
     {
        if(arr[i]%2!=0)
        {
            System.out.print(arr[i]+"  ");
        }
     }
    }
}
