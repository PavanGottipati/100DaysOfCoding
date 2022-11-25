import java.util.Scanner;
class Coordinate
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
      System.out.println("Enter number of coordinate points ");
      int n=s.nextInt();
        int [] x=new int[n];
        int [] y=new int[n];
        double sum=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter coordinate of X"+(i+1));
            x[i]=s.nextInt();
            System.out.println("Enter the coordinate of Y"+(i+1));
            y[i]=s.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            int term1=x[i+1]-x[i];
            int term2=y[i+1]-y[i];
            sum=sum+Math.sqrt(Math.pow(term1,2)+Math.pow(term2,2));
        }
        System.out.println("Sum is "+sum);
    }
}
