// Java program to perform transaction management in Bank
import java.util.Scanner;
class Customers
{
 int [] acno;
 String [] name;
 float [] bal;
 int n;
 Customers(int size) 
 {
  n=size;
  acno=new int[n];
  name=new String[n];
  bal=new float[n];
 }
 void customerdata()
 {
  Scanner s=new Scanner(System.in);
  for(int i=0;i<n;i++)
  {
   System.out.println("Enter the account number "+(i+1));
   this.acno[i]=s.nextInt();
   System.out.println("Enter the account holder name "+(i+1));
   this.name[i]=s.next();
   System.out.println("Enter the balance "+(i+1));
   this.bal[i]=s.nextFloat();
  }
}
void display()
{
  System.out.println();
  System.out.println("The Customers Details are");
  for(int i=0;i<n;i++)
  {
    System.out.println(acno[i]+" "+name[i]+" "+bal[i]);
  }
  System.out.println("******************************");
}
void check100()
{
 System.out.println();
 System.out.println("Account details below 100 amount ");
 System.out.println("******************************");
 for(int i=0;i<n;i++)
 {
  if(bal[i]<100)
  {
    System.out.println("Account No "+acno[i]+" name is "+name[i]);  
  }
 }
}
void withdraw()
{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter account number for withdrawl");
 int ac=s.nextInt();
 for(int i=0;i<n;i++)
 {
 if(ac==acno[i])
 {
 float amount;
 System.out.println("Enter amount for withdraw");
 amount=s.nextFloat();
 if(amount<=bal[i])
 {
  bal[i]=bal[i]-amount;
  System.out.println("Amount withdrawn successfully");
 }
 else
 {
  System.out.println("There is no sufficient balance for withdrawl");
 }
}
else
  {
    if(i==n-1)
    {
      System.out.println("Invalid account number");
    }
  }
}
}
void deposit()
{
 Scanner s=new Scanner(System.in);
 System.out.println("Enter account number for deposit");
 int ac=s.nextInt();
 for(int i=0;i<n;i++)
{
 if(ac==acno[i])
 {
 float amount;
 System.out.println("Enter amount for deposit");
 amount=s.nextFloat();
 bal[i]=bal[i]+amount;
 System.out.println("Amount deposited Successfully");
 break;
 }
 else
 {
   if(i==n-1)
   {
    System.out.println("Invalid account number");
   }
 }
}
}
}
class Banking
{
 public static void main(String [] args)
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the number of customers ");
  int n=s.nextInt();
  Customers co=new Customers(n);
  co.customerdata();
  co.display();
  co.check100();
  co.withdraw();
  co.deposit();
  System.out.println("After operations, The customers details are ");
  co.display();
 }
}
  
