//Java program to print the Down Ward Triangle Pattern in the form of *
import java.util.Scanner;
class DownWardTriangle
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
 
    System.out.println("Enter the number of rows: "); //takes input from user
 
    int rows = sc.nextInt();
 
    for (int i= rows-1; i>=0 ; i--) //loop1 for rows
    {
     for (int j=0; j<=i; j++)  //loop2 for columns
     {
      System.out.print("*" + " ");  //printing * in same line
     }
     System.out.println();
    }
    sc.close();
    }
}
