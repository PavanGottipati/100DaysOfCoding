//Java program to implement Stack using Single Linked List
import java.util.Scanner;
class Stacks
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
    void push()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data to be inserted");
        int data=sc.nextInt();
        Node newnode=new Node(data);
        if(top==null)
        {
            top=newnode;
        }
        else
        {
            newnode.next=top;
            top=newnode;
        }
        System.out.println("Element pushed into Stack Successfully");
    }
    void pop()
    {
        if(top==null)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            System.out.println("The deleted element is "+top.data);
            top=top.next;
            System.out.println("Top element deleted Successfully");
        }
    }
    void display()
    {
        if(top==null)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
        System.out.println("The elements in the Stack are ");
        Node temp=top;
        while(temp!=null)
        {
            System.out.println(temp.data+"  ");
            temp=temp.next;
        }
        }
    }
    void peek()
    {
        if(top==null)
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            System.out.println("The top most element in stack is "+top.data);
        }
    }
}
class StackSingleLinkedList {
    public static void main(String [] args)
    {
       Scanner sc=new Scanner(System.in);
       Stacks s=new Stacks();
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
