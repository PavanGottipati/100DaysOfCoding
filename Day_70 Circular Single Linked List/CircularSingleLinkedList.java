//Java program to implement Circular Single Linked List
import java.util.Scanner;
class Circle
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
    Node head=null;
    Node tail=null;
    void creation()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter data to be inserted");
      int data=sc.nextInt();
      Node newnode=new Node(data);
      head=tail=newnode;
    }
    void insertFirst()
    {
        Scanner sc=new Scanner(System.in);
        if(head==null)
        {
            System.out.println("Can't insert node at First... List is empty");
        }
        else
        {
             System.out.println("Enter data to be inserted");
             int data=sc.nextInt();
             Node newnode=new Node(data);
             newnode.next=head;
             head=newnode;
             tail.next=newnode;
             System.out.println("Node inserted Successfully");
        }
    }
    void insertLast()
    {
      Scanner sc=new Scanner(System.in);
      if(head==null)
      {
        System.out.println("Can't insert node... List is empty");
      }
      else
      {
        System.out.println("Enter data to be inserted");
        int data=sc.nextInt();
        Node newnode=new Node(data);
        newnode.next=head;
        tail.next=newnode;
        tail=newnode;
        System.out.println("Node inserted sucessfully");
      }
    }
    void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("Can't be deleted... List is empty");
            return;
        }
        head=head.next;
        tail.next=head;
        System.out.println("First Node deleted sucessfully");
    }
    void deleteLast()
    {
        if(head==null)
        {
            System.out.println("Can't be deleted... List is empty");
            return;
        }
        Node temp=head;
        while(temp.next!=tail)
        {
            temp=temp.next;
        }
        temp.next=head;
        tail=temp;
        System.out.println("Last node deleted Successfully");
    }
    void display()
    {
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            Node temp=head;
            System.out.println("The elements are ");
            while(temp!=tail)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.print(temp.data);
            System.out.println();
        }
    }
}
class CircularSingleLinkedList {
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    Circle c=new Circle();
    int choice;
    do
    {
        System.out.println();
        System.out.println("1.ceation\n2.insert First\n3.insert Last\n4.delete First\n5.delete Last\n6.Display\n7.Exit");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
              c.creation();
              break;
            case 2:
              c.insertFirst();
              break;
            case 3:
              c.insertLast();
              break;
            case 4:
              c.deleteFirst();
              break;
            case 5:
              c.deleteLast();
              break;
            case 6:
              c.display();
              break;
            case 7:
              System.exit(0);
            default:
              System.out.println("Invalid choice");      
        }
    }while(choice!=7);
  }    
}
