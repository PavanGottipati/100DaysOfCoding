//Java program to Delete the vowel occurrences in aString and display them.
import java.util.Scanner;
public class DelVowel {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Line ");
        String s=sc.nextLine();
        System.out.println("After deleting the vowels ");
        System.out.println(s.replaceAll("[aeiouAEIOU]",""));
    }
}

