//Java program to implement Hierarchial Inheritance
//Java Program to do operations on Savings account and to calculate the rate of interest on ammount in Fixed account of one customer.
import java.util.Scanner;
class Account
{
    int acno;
    String acname;
    Account(int acno,String acname)
    {
        this.acno=acno;
        this.acname=acname;
    }
}
class Savings extends Account
{
    double bal;
    Savings(int acno,String acname,double amount)
    {
        super(acno,acname);
        bal=amount;
    } 
    void withdraw()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the amount to be withdrawn");
        double a=sc.nextDouble();
        bal-=a;
        System.out.println();
        System.out.println("After withdrawn, the account details are ");
        System.out.println("-------------------------------------------");
        System.out.println(acno+" "+acname+" "+bal);
        System.out.println("-------------------------------------------");
        System.out.println();
        System.out.println();
    }
}
class Fixed extends Account
{
   double p;
   int r,t;
   Fixed(int acno,String acname,double p,int r,int t)
   {
    super(acno,acname);
    this.p=p;
    this.r=r;
    this.t=t;
   }
   void interest()
   {
    double i=(p*t*r)/100;
    System.out.println("The interest on "+p+" is "+i);
    System.out.println("The account details after adding interset about "+r+
    " rate of interest for "+t+" years of time is");
    System.out.println("-----------------------------------");
    System.out.println(acno+" "+acname+" "+(p+i));
    System.out.println("-----------------------------------");
   }
}
class HierarchialInheritance 
{
  public static void main(String [] args)
  {  
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Account number");
  int acno=sc.nextInt();
  System.out.println("Enter Name of Account holder");
  String acname=sc.next();
  System.out.println("Enter the Balance in Savings Account");
  double bal=sc.nextDouble();
  System.out.println("Enter the balance in Fixed Account");
  double fbal=sc.nextDouble();
  Savings s=new Savings(acno,acname,bal);
  s.withdraw();
  Fixed f=new Fixed(acno,acname,fbal,6,2);
  f.interest();   
  } 
}
