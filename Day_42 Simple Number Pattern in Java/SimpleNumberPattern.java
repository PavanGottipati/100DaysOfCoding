//Write a java program to print the simple number pattern
//The output must be 
/*
1
1 2
1 2 3
1 2 3 4 
1 2 3 4 5
*/
import java.util.Scanner;
class SimpleNumberPattern
{
    public static void printNums(int n) 
    { 
        int i, j,num; 
        System.out.println("The Pattern is ");
    
        for(i=0; i<n; i++) //loop1 outer loop for rows
        { 
            num=1; 
            for(j=0; j<=i; j++) //loop2 inner loop for rows
            { 
                // printing num with a space  
                System.out.print(num+ " "); 
    
                //incrementing value of num 
                num++; 
            } 
    
            // ending line after each row 
            System.out.println(); 
        } 
    } 
       public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n=sc.nextInt(); 
        printNums(n); 
    } 
}
