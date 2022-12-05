//Java program to implement Insertion Sort
import java.util.Scanner;
class Insert{
    void insertionSort(int a[])
    {
        int n=a.length;
        for(int j=2;j<n;j++)
        {
            int key=a[j];
            int i=j-1;
            while(i>0 && a[i]>key)
            {
                a[i+1]=a[i];
                i=i-1;
            }
            a[i+1]=key;
        }
        System.out.println("Insertion sort successful");
        for(int i=1;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
public class InsertionSort {
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      Insert iobj=new Insert();
      System.out.println("Enter array size ");
      int n=sc.nextInt();
      int a[]=new int[n+1];
      System.out.println("Enter elements into array ");
      for(int i=1;i<=n;i++)
      {
        a[i]=sc.nextInt();
      }
      iobj.insertionSort(a);
    }
}

