//Write a java program to check the given number is present in the array or not
//Java program to perform Linear Search Algorithm
import java.util.Scanner;
class Linear
{
    boolean linears(int a[],int key)
    {
      int i=1;
      int k=key;
      int n=a.length;
      while(i<n && a[i]!=k)
      {
        i++;
      }
      if(i<n)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
}
class LinearSearch
{
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter array size ");
      int n=sc.nextInt();
      int a[]=new int[n+1];
      System.out.println("Enter elements into array ");
      for(int i=1;i<=n;i++)
      {
        a[i]=sc.nextInt();
      }
      System.out.println("Enter key element to search ");
      int key=sc.nextInt();
      Linear sobj=new Linear();
      System.out.println(sobj.linears(a,key));
    }
}
