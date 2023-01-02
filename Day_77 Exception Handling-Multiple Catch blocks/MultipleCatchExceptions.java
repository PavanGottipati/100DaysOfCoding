//Java program to implement Exception Handling by using Multiple Catch Blocks
import java.util.Scanner;
class MultipleCatchExceptions
{  
    public static void main(String[] args)
     {  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for division");
        int b=sc.nextInt();
        System.out.println("Here the array size is 5 , So enter a index from 0 to 4 to insert the result after division operation");
        int index=sc.nextInt(); 
        //try block containing code that will generate exception
        try
        {    
            int arr[]=new int[5];    
            arr[index]=10/b; 
            System.out.println("Operations Done Successfully.. Without any Exceptions");   
        } 
        //multiple catch blocks
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println(e);  
        } 
        catch(Exception e)  
        {  
            System.out.println(e.getMessage ());  
        }       
        System.out.println("Rest Of The Code.............");    
    }  
}  
