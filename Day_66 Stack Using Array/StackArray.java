// Java program for implementing Stack using Array
import java.util.Scanner;
class Stacks
{
    int top=-1;
    int arr[];
    int size;
    Stacks(int size)
    {
      this.size=size;
      arr=new int[size];
    }
    void push()
    {
      Scanner sc=new Scanner(System.in);
      if(top==size-1)
      {
        System.out.println("Stack Overflow");
      }
      else
      {
        System.out.println("Enter data ");
        int data=sc.nextInt();
        top++;
        arr[top]=data;
      }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
        System.out.println("The deleted element is "+arr[top]);
        top--;
        }
    }
    void display()
    {
      if(top==-1)
      {
        System.out.println("Stack is Empty");
      }
      else
      {
        int temp=top;
        System.out.print("The elements in the Stack are  =  ");
        while(temp!=-1)
        {
            System.out.print(arr[temp]+"  ");
            temp--;
        }
        System.out.println();
      }
    }
}
class StackArray
{
    public static void main(String [] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Stack size");
       int n=sc.nextInt();
       Stacks s=new Stacks(n);
       int choice;
       do
       {
        System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        switch(choice)
        {
          case 1:
             s.push();
             break;
          case 2:
             s.pop();
             break;
          case 3:
             s.display();
             break;
          case 4:
             System.exit(0);
          default:
             System.out.println("Invalid Choice");
        }
      }while(choice!=4);
    }
}
