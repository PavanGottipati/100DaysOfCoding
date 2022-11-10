//Write a java program to sort the names of students in alphabetical order
import java.util.Scanner;
import java.util.Arrays;
public class SortNames {
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter array size ");
      int n=sc.nextInt();
      String s[]=new String[n];
      System.out.println("Enter the names in small letters");
      for(int i=0;i<n;i++)
      {
        s[i]=sc.next();
      }
      Arrays.sort(s);
      System.out.println(Arrays.toString(s));
    }
}
