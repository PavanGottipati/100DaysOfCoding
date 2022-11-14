//Java program to check that the String contains only digits or not.
import java.util.Scanner;
class CheckIfStringContainsDigitsOnly {

    void digitsOnlyString(String string) 
    {
		try 
        {
			long l = Long.parseLong(string);
			System.out.println("This is Digit Only String ::"+string);
		}
        catch(Exception e)
        {
			System.out.println("This is Non Digit Only String ::"+string);
		}
	}
}
class CheckDigit
{
	public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        CheckIfStringContainsDigitsOnly check=new CheckIfStringContainsDigitsOnly();
        System.out.println("Enter a String with all numbers");
        String str=sc.next();
		    check.digitsOnlyString(str);
	}
}
