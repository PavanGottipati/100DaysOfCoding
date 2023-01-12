// Java program to implement Stack data structure using Collections framework
import java.util.*;
class StackCollection {
    public static void main(String [] args)
    {
       Scanner sc=new Scanner(System.in);
       Stack<Integer> stack=new Stack<Integer>();
       int choice;
       do{
        System.out.println("1.Push 2.Pop 3.Peek 4.Display 5.Exit");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        switch(choice){
            case 1:
              System.out.println("Enter element ");
              int element=sc.nextInt();
              stack.push(element);
              System.out.println("Element pushed into stack successfully");
              break;
            case 2:
              if(stack.isEmpty())
              {
              System.out.println("Stack Underflow");
              }
              else{
                stack.pop();
                System.out.println("Element popped from the stack successfully");
              }
              break;
            case 3:
              if(stack.isEmpty())
              {
                System.out.println("Stack is Empty");
              }
              else{
              System.out.println("The top most element is "+stack.peek());
              }
              break;
            case 4:
              if(stack.isEmpty())
              {
              System.out.println("Stack is Empty");
              }
               else{
               System.out.println("The elements are "+stack);
               }
              break;
            case 5:
              System.out.println("Exit............");
              System.exit(0);
              break;
            default:
              System.out.println("Invalid Choice");   
        }
       }while(choice!=5);
    }
}
