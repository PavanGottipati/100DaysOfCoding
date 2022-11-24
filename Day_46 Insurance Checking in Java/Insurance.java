import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Insurance {
 public static void main(String [] args)
 {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter name of person ");
   String name=s.next();
   System.out.println("Enter the age of person ");
   int age=s.nextInt();
   System.out.println("Enter the value based on your health condition");
   System.out.println("1:Excellent\n2:Poor");
   int health=s.nextInt();
   System.out.println("Enter the region you are living");
   System.out.println("1:city\n2:village");
   int region=s.nextInt();
   System.out.println("Enter your gender");
   System.out.println("1:Male\n2:Female");
   int gender=s.nextInt();
   if(health==1 && age>=25 && age<=35 && region==1 && gender==1)
   {
    System.out.println("The premium is Rs. 4 per thousand and the policy cannot exceed Rs 2 Lakhs");
   }
   else if(health==1 && age>=25 && age<=35 && region==1 && gender==2)
   {
    System.out.println("The premium is Rs 3 per thousand and the policy cannot exceed Rs 1 Lakh");
   }
   else if(health==2 && age>=25 && age<=35 && region==2 && gender==1)
   {
    System.out.println("The premium is Rs 6 per thousand and the policy cannot exceed Rs 10000");
   }
   else
   {
    System.out.println("The person is not insured");
   }
 }
}
