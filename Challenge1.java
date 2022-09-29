import java.util.Scanner;

public class Challenge1{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if(N>0)
        {
          if(N%2!=0)
          {
              System.out.println("Weird");
          }
          else if(N%2==0 && N>=2 && N<=5)
          {
              System.out.println("Not Weird");
          }
          else if(N%2==0 && N>=6 && N<=20)
          {
              System.out.println("Weird");
          }
          else
          {
              System.out.println("Not Weird");
          }
        }
        else
        {
            System.out.println("Not a natural number");
        }
        
    }
}
