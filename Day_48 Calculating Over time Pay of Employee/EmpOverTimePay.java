//Java program to calculate overtime pay of N employees 
import java.util.Scanner;
public class EmpOverTimePay
{
  public static void main(String [] args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter number of employees ");
    int n=s.nextInt();
    int [] totalhrs=new int[n];
    int [] overtimepay=new int[n];
    for(int i=0;i<n;i++)
    {
        System.out.println("Working hours of user "+(i+1));
        totalhrs[i]=s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        if(totalhrs[i]>40)
        {
            int overtime=totalhrs[i]-40;
            overtimepay[i]=overtime*12;
        }
    }
     for(int i=0;i<n;i++)
     {
        if(overtimepay[i]>0)
        {
            System.out.println("Employee "+(i+1)+" get overtime pay of rupees "+overtimepay[i]);
        }
     }
  }  
}
