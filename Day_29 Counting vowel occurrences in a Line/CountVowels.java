//Java program to find the number of occurrences of vowels in a Line
import java.util.Scanner;
public class CountVowels {
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a line ");
      String str=sc.nextLine();
      int count=0;
      char ch;
      for(int i=0;i<str.length();i++)
      {
        ch=str.charAt(i);
        if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u') || (ch=='A') || (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U'))
        {
            count++;
        }
      }
      System.out.println();
      System.out.println("The number of vowels present in the line are "+count);
    }
}

