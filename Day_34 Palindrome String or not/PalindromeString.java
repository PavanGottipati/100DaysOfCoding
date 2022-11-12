//Java program to find the given String is palindrome string or not.
import java.util.Scanner;
class PalindromeString
{
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a string in small letters");
      String s=sc.next();
      String nstr="";
      char ch;
      for(int i=0;i<s.length();i++)
      {
        ch=s.charAt(i);
        nstr=ch+nstr;
      }
      if(s.equals(nstr))
      {
        System.out.println("The String is Palindrome");
      }
      else{
        System.out.println("The string is not a palindrome");
      }
    }
}
