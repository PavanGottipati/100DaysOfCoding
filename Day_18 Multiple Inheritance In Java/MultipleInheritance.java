//Java program to implement multiple inheritance
//To find the bill of a product and display the details of customer including total bill which has to be paid by the customer.
import java.util.Scanner;
class Customer
{
    String cname;
    int phno;
    Customer(int phno,String cname)
    {
        this.phno=phno;
        this.cname=cname;
    }
}
interface Item
{
    public static final String iname="Harddisk";
    double price=3500;
    void bill();
}
class Sales extends Customer implements Item
{
  int qty;
  Sales(int phno,String cname,int qtyy)
  {
    super(phno,cname);
    qty=qtyy;
  }
    public void bill()
    {
       double totalBill=(price*qty);
       System.out.println("The Billing Details are");
       System.out.println(cname+" "+phno+" "+iname+" "+totalBill);
    }
}
public class MultipleInheritance {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer details");
        System.out.println("Enter customer name");
        String cname=sc.next();
        System.out.println("Enter customer phone number");
        int phno=sc.nextInt();
        System.out.println("Enter number of products");
        int n=sc.nextInt();
        Sales obj=new Sales(phno,cname,n);
        obj.bill();
    }
}
