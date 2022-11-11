//Java program to take a name of person and abbreviate them by first letter except last name
import java.util.Scanner;
class Names
{
   public static void main(String [] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Full Name ");
    String str=sc.nextLine();
    String strArr []=str.split(" ");
    int n=strArr.length;
    String name="";
    for(int i=0;i<n;i++)
    {
        if(i<n-1)
        {
         char ch=strArr[i].charAt(0);
         if(i==0)
         {
         name=name+ch;
         }
         else{
            name=name+" "+ch;
         }
        }
    else{
            name=name+" "+strArr[i];
        }
    }
        System.out.println(name);
   } 
}
