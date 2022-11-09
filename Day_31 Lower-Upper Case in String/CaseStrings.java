//Java program to convert a String from lower case to Upper case and Vice-Versa.
import java.util.Scanner;
public class CaseStrings {
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a String to convert into Upper Case");
      String s=sc.nextLine();
      System.out.println(s.toUpperCase());
      System.out.println("Enter a String to convert into Lower Case");
      String s1=sc.nextLine();
      System.out.println(s1.toLowerCase());
    }
}

