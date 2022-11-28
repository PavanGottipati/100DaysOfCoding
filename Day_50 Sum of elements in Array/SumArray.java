//Java program to find the sum of elements in an array
import java.util.Scanner;
class Sum
{
    int a[];
    Sum(int n)
    {
        a=new int [n];
    }
    void readArray(int n)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements into array");
        for(int i=0;i<n;i++)
        {
           this.a[i]=sc.nextInt();
        }
    }
     void sumArray(int n)
     {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        System.out.println("The sum of elements in array is "+sum);
     }
    
}
class Sumarray {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size ");
        int n=sc.nextInt();
        Sum s=new Sum(n);
        s.readArray(n);
        s.sumArray(n);
    }
    
}
