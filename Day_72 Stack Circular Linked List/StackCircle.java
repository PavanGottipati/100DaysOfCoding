//Java program to implement Stack data structure using Circular Linked List
import java.util.Scanner;
class StackC
{
  static class Node
  {
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
  } 
  Node top=null;
  Node tail=null;
  void push()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter data to be inserted");
    int data=sc.nextInt();
    Node newnode=new Node(data);
    if(top==null)
    {
      top=tail=newnode;
    }
    else
    {
        newnode.next=top;
        tail.next=newnode;
        top=newnode;
    }
    System.out.println("Node pushed into Stack successfully");
  }  
  void pop()
  {
    if(top==null)
    {
        System.out.println("Stack Underflow");
    }
    else
    {
        if(top==tail)
        {
            System.out.println("Top Node deleted successfully");
            top=tail=null;
            return;
        }
        top=top.next;
        tail.next=top;
        System.out.println("Top Node deleted successfully");
    }
  } 
  void display()
  {
    if(top==null)
    {
        System.out.println("Stack is empty");
    }
    else
    {
    Node temp=top;
    System.out.println("The elements in the Stack are");
    while(temp!=tail)
    {
      System.out.println(temp.data);
      temp=temp.next;
    }
    System.out.println(temp.data);
    System.out.println();
    }
  }
  void peek()
  {
    if(top==null)
    {
        System.out.println("Stack is empty");
    }
    else
    {
        System.out.println("The top most element in the stack is "+top.data);
    }
  }
}
class StackCircle
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        StackC s=new StackC();
        int choice;
       do
       {
        System.out.println("1.Push\n2.Pop\n3.display\n4.peek\n5.Exit");
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
               s.peek();
               break;
            case 5:
               System.out.println("Exit from the Execution Flow");
               System.exit(0);
            default:
               System.out.println("Invalid choice");
        }
       }while(choice!=5);
    }
}
