//Java program to print the Reversed Pyramid Pattern *
import java.util.Scanner;
class ReversedPyramid
{
    public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
 
    int rows = sc.nextInt();        
    for (int i= 0; i<= rows-1 ; i++)    //loop1 for rows
    {
        for (int j=0; j<=i; j++)  //loop2 for spaces in row
        {
            System.out.print(" ");
        }
        for (int k=0; k<=rows-1-i; k++)   //loop3 for printing * in row
        {
            System.out.print("*" + " ");    
        }
        System.out.println();
    }
    sc.close();
   }
}
