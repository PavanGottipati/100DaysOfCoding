//Java Program to print Left Triangular Pattern *
import java.util.Scanner;
class LeftTriangularPattern  
{    
 public static void main(String args[])   
 {   
   Scanner sc=new Scanner(System.in);  
   System.out.println("Enter row size "); 
   int row=sc.nextInt();       
   //Outer loop work for rows  
   for(int i=0;i<row;i++)   
   {  
    //inner loop work for space      
    for(int j=2*(row-i);j>=0;j--)         
    {  
     //prints space between two stars      
     System.out.print(" ");   
    }   
     //inner loop for columns  
     for (int k=0;k<=i;k++ )   
     {   
      //prints star      
      System.out.print("* ");   
     }   
     // for new line 
     System.out.println();   
    }   
 }   
}  
