//Java program to print the right triangular pettern with *
import java.util.Scanner;
class RightTriangularPattern   
{   
 public static void main(String args[])   
 {   
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of rows ");
  int row=sc.nextInt();     
  //row denotes the number of rows you want to print     
  //outer loop for rows  
  for(int i=0; i<row; i++)   
  {   
    //inner loop for columns  
    for(int j=0; j<=i; j++)   
    {   
       //prints stars   
       System.out.print("* ");   
    }   
    //throws the cursor in a new line after printing each line  
   System.out.println();   
  }   
 }   
}  
