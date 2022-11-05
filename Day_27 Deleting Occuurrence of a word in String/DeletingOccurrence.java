//Java program to delete the occurrence of a word in the given String and display the rest of the String.
import java.util.Scanner;
class DeletingOccurrence {
    public static void main(String [] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string ");
    String s=sc.nextLine();
    String strArr[]=s.split(" ");
    for(int i=0;i<strArr.length;i++)
    {
        if(strArr[i].equals("the"))
        {
           strArr[i]="";  
        }
    }
    for(String i:strArr)
    {
        System.out.print(i+" ");
    }
   } 
}
