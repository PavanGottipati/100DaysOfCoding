import java.util.Scanner;
public class UserPassCode {
    public static void main(String [] args)
    {
        int i;
        Scanner sc=new Scanner(System.in);
        do
        {
        i=0;
        System.out.println("Enter Username ");
        String uname=sc.next();
        System.out.println("Enter password ");
        String pass=sc.next();
        if(!uname.isEmpty())
        {
         if(uname.length()>=6 && uname.length()<=15 && !uname.contains(" ") && !uname.contains("(") && !uname.contains(")"))
         {
            String ch=uname.toUpperCase();
            if(uname.charAt(0)==ch.charAt(0))
            {
                i++;
            }
            else{
                System.out.println("*A username must be of length 6-15 characters\n*A username must start with an uppercase English alphabet A to Z");
            }           
         }
         else{
            System.out.println("Invalid username!The length must be 6 to 15 characters and no white spaces and no paranthesis");
         }
        }
        else
        {
          System.out.println("Please provide User Name");
        }
        if(!pass.isEmpty())
        {
           if(pass.length()>=8 && pass.length()<=256)
           {
            if(!pass.contains(" ") && !pass.contains("(") && !pass.contains(")"))
            {
              //System.out.println("Password saved successfully");   
              i++;  
            }
            else{
                System.out.println("Password must not contain any white spaces and paranthesis");
            }
           }
           else{
            System.out.println("Password length must be 8 to 256 characters");
           }
        }
        else{
            System.out.println("Please provide password");
        }
        if(uname.equals(pass))
        {
            System.out.println("Username and password cannot be same");
            uname=null;
            pass=null;
            i--;
        }
        else{
            System.out.println("Username and Password are verified");
        }
    }while(i!=2);
}
}

