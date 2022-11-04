//Java program to count the number of occurrences of a letter a in given string line.
import java.util.Scanner;
class CountOccurrence
{
 public static void main(String [] args)
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String line");
    String s=sc.nextLine();
    String strArr[]=s.split(" ");
    int count=0;
    for(String i:strArr)
    {
      if(i.contains("e"))
      {
        count++;
      }
    }
    System.out.println("The no of occurances is "+count);
 }   
}
