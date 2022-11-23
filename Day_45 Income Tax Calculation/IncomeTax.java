import java.util.Scanner;
class Incom {
    int taxing(int income1)
       {
        int totalTax;
        if(income1>=1 && income1<=100000)
        {
            totalTax=0;
        }
        else if(income1>=100001 && income1<=500000)
        {
            totalTax=(int)(0.1*(income1-100000)+(100000*0));
        }
        else if(income1>=500001 && income1<=1000000)
        {
            totalTax=(int)(0.2*(income1-500000)+(500000*0.1));
        }
        else if(income1>=1000001 && income1<=4000000)
        {
            totalTax=(int)(0.3*(income1-1000000)+(10000000*0.2));
        }
        else
        {
            totalTax=(int)(0.37*(income1-4000000)+(4000000*0.3));
        }
        return totalTax;
       }
    }
    class IncomeTax
    {
    public static void main(String [] args)
    {
       Scanner sc=new Scanner(System.in);
       Incom n=new Incom();
       System.out.println("Enter the yearly income ");
       int income=sc.nextInt();
       int totalTax=n.taxing(income);
       sc.close();
       System.out.println("The total tax for the income is "+totalTax);
    }
}
