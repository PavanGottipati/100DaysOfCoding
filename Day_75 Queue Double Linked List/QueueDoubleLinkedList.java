//Queue using Double Linked List
import java.util.Scanner;
class QueueD
{
  static class Node
  {
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
  } 
  Node front=null;
  Node rear=null;
  void enqueue()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter data to be inserted");
    int data=sc.nextInt();
    Node newnode=new Node(data);
    if(rear==null)
    {
        front=rear=newnode;
    }
    else
    {
      newnode.prev=rear;
      rear.next=newnode;
      rear=newnode;
    }
    System.out.println("Node inserted successfully");
  }
  void dequeue()
  {
    if(rear==null)
    {
        System.out.println("Queue Underflow");
    }
    else
    {
        if(front==rear)
        {
          System.out.println("The removed element is "+front.data);
          front=rear=null;
          return;
        }      
        System.out.println("The removed element is "+front.data);
        front=front.next;
    }
  }
  void display()
  {
    if(rear==null)
    {
        System.out.println("Queue is Empty");
    }
    else
    {
        Node temp=front;
        System.out.print("The elements in the Queue are ");
        while(temp!=null)
        {
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println();
    }
  }
}
class QueueDoubleLinkedList {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        QueueD q=new QueueD();
        int choice;
        do
        {
          System.out.println("1.Enqueue\n2.Dequeue\n3.display\n4.Exit");
          System.out.println("Enter your choice");
          choice=sc.nextInt();
          switch(choice)
          {
            case 1:
               q.enqueue();
               break;
            case 2:
               q.dequeue();
               break;
            case 3:
               q.display();
               break;
            case 4:
            System.out.println("Exit from the Execution Flow");
               System.exit(0);
            default:
               System.out.println("Invalid choice");
        }
       }while(choice!=4);

    }
}
