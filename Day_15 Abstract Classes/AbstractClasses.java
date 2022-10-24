//Java Program to find the given number is Armstrong or not 
//By using Abstraction concept in Java
import java.util.Scanner;
abstract class Armstrong
{
    abstract void input();
    abstract void operation(int n);
}
class CheckArmstrong extends Armstrong
{
  public void input()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number ");
    int num=sc.nextInt();
    operation(num);
    return;
  }
  public void operation(int n)
  {
    int temp=n;
    int sum=0;
    while(temp>0)
    {
        int rem=temp%10;
        sum+=(rem*rem*rem);
        temp=temp/10;
    }
    if(sum==n)
    {
      System.out.println(n+" is Armstrong number");
    }
    else
    {
      System.out.println(n+" is not an Armstrong number");
    }
  }
}
class AbstractClasses {
    public static void main(String [] args)
    {
        CheckArmstrong obj=new CheckArmstrong();
        obj.input();
    }
}
