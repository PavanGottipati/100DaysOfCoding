/* Write a Java program that randomly picks an English alphabet (A-Z) and keeps asking the user to guess the alphabet until he/she has got it right. 
Also report the number of trials. */
import java.util.Random;
import java.util.Scanner;
public class AlphaGame {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        char ch="ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()[rand.nextInt("ACDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray().length)];
        int flag=0;
        int count=0;
        while(flag!=1)
        {
           System.out.println("Enter a letter in Capital Letter from A-Z");
           char input=sc.next().charAt(0);
           if(ch==input)
           {
             System.out.println("You have guessed the character "+(count+1)+"th time");
             flag=1;
            }
            else
            {
            count++;
            flag=0;
            }
        }  
    }
}

