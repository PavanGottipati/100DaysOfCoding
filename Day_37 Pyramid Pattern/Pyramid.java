//Java program to print pyramid
import java.util.Scanner;
class PyramidPattern
{
    void pyramid(int n)
    {
        for(int i=0;i<n;i++)   //Outer loop for number of rows
        {
            for(int j=n-i;j>1;j--)  //inner loop for spaces
            {
                System.out.print("");
            }
            for(int j=0;j<=i;j++)   //inner loop for number of columns
            {
                System.out.print("* ");  //print star
            }
            System.out.println();
        }
    }
}
class Pyramid
{
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of rows");
      int n=sc.nextInt();
      PyramidPattern p=new PyramidPattern();
      p.pyramid(n);
    }
}
