//Java program to read elements into array and display them.
import java.util.Scanner;
public class ReadArray
{
public static void main(String [] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter array size");
   int n=sc.nextInt();
   int a[]=new int[n];
   System.out.println("Enter elements into array");
   for(int i=0;i<n;i++)
   {
    a[i]=sc.nextInt();
   } 
   System.out.println("The elements in the array are");
   for(int i=0;i<n;i++)
   {
    System.out.println(a[i]);
   }
}
}
