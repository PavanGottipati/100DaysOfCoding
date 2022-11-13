//Java program to find the first non-repeated letter in a String
import java.util.Scanner;
class NcrString {
 public static void main(String[] args) 
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a String :");
 String str1 = sc.next();
 System.out.println("The given string is: " + str1);
 for (int i = 0; i < str1.length(); i++)
 {
   boolean unique = true;
   for (int j = str1.length()-1; j >=0; j--) 
   {
     if (i != j && str1.charAt(i) == str1.charAt(j))
     {
       unique = false;
       break;
     }
   }
   if (unique) {
    System.out.println("The first non repeated character in String is: " + str1.charAt(i));
    break;
   }
  }
 }
}
