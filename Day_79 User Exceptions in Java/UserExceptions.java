//user-defined exception in java
import java.util.*;

//custom exception to validate login credentials
class InvalidCredentialsException extends Exception {
    //member variable to store our custom message
    String msg;
    InvalidCredentialsException(String msg) {
        this.msg=msg;
    }
    public String toStrings()
    {
        return msg;
    }
}
class UserExceptions 
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter user name");
	    String id = sc.next();
        System.out.println("Enter Password");
	    String password = sc.next();
	    try {
	        if(!id.equals("Pavan") && password.equals("1234"))
            {
	            throw new InvalidCredentialsException("no such user with username - "+id);
	        }
            else if(!password.equals("1234") && id.equals("Pavan"))
            {
                throw new InvalidCredentialsException("Incorrect Password - "+password); 
            }
            else if(!id.equals("Pavan") && !password.equals("1234"))
            {
                throw new InvalidCredentialsException("no such user with username - "+id+" and password "+password);
            }
            else{
                System.out.println("Valid username");
                return;
            }
	    }
	    catch(InvalidCredentialsException ex) {
	        System.out.print(ex+": ");
          System.out.println(ex.toStrings());
	    }
	}
}
