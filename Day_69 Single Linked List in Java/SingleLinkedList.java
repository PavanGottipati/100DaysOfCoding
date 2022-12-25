//Java program to implement Single Linked List
import java.util.Scanner;
class LinkedList
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
  void creation()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter data to be inserted");
    int data=sc.nextInt();
    Node newnode=new Node(data);
    if(head==null)
    {
        head=newnode;
    }
  }
  void insertFirst()
  {
    Scanner sc=new Scanner(System.in);
    if(head==null)
    {
        System.out.println("The list is empty");
    }
    else
    {
        System.out.println("Enter data to be inserted");
        int data=sc.nextInt();
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
        System.out.println("Node inserted successfully");
    }
  }
  void insertPosition()
  {
    Scanner sc=new Scanner(System.in);
    if(head==null)
    {
        System.out.println("This list is empty");
    }
    else
    {
        System.out.println("Enter position to be inserted");
        int pos=sc.nextInt();
        Node temp=head;
        for(int i=0;i<pos;i++)
        {
            temp=temp.next;
            if(temp==null)
            {
                System.out.println("Can't insert a node");
                return;
            }
        }
        System.out.println("Enter data to be inserted");
        int data=sc.nextInt();
        Node newnode=new Node(data);
        newnode.next=temp.next;
        temp.next=newnode;
        System.out.println("Node inserted successfully");
    }
  }
  void insertLast()
  {
    Scanner sc=new Scanner(System.in);
    if(head==null)
    {
        System.out.println("Can't insert node");
    }
    else
    {
        Node temp=head;
        System.out.println("Enter data to be inserted");
        int data=sc.nextInt();
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        Node newnode=new Node(data);
        temp.next=newnode;
        System.out.println("Node inserted successfully");
    }
  }
  void deleteFirst()
  {
    if(head==null)
    {
        System.out.println("Node is Empty... Can't delete");
    }
    else
    {
        Node temp=head;
        head=head.next;
    }
  }
  void deletePosition()
  {
    Scanner sc=new Scanner(System.in);
    if(head==null)
    {
        System.out.println("Can't delete a node");
    }
    else
    {
    Node temp=head;
    Node prev=null;
    System.out.println("Enter position to be deleted");
    int pos=sc.nextInt();
    for(int i=0;i<pos;i++)
    {
        prev=temp;
        temp=temp.next;
        if(temp==null)
        {
            System.out.println("Can't delete");
            return;
        }
    }
    prev.next=temp.next;
    System.out.println("Node deleted successfully");
   }
  }
  void deleteLast()
  {
    if(head==null)
    {
        System.out.println("Can't delete");
    }
    else
    {
        Node temp=head;
        Node prev=null;
        while(temp.next!=null)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
    }
  }
  void display()
  {
    Node temp=head;
    if(head==null)
    {
        System.out.println("List is empty");
    }
    else
    {
        System.out.print("The elements in the list are  ");
       while(temp!=null)
       {
        System.out.print(temp.data+"  ");
        temp=temp.next;
       } 
    }
  }
  void search()
  {
    Scanner sc=new Scanner(System.in);
    if(head==null)
    {
        System.out.println("List is Empty");
    }
    else
    {
        System.out.println("Enter search element to be check");
        int key=sc.nextInt();
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.data==key)
            {
                System.out.println("Element found at "+(i+1)+" Node");
                return;
            }
            else
            {
                temp=temp.next;
            }
        }
        if(temp==null)
        {
            System.out.println("Element not found");
        }
    }
  }
}
class SingleLinkedList
{
    public static void main(String [] args)
    {
        LinkedList l=new LinkedList();
        Scanner sc=new Scanner(System.in);
        int choice;
        do
        {
            System.out.println();
            System.out.println("1.Create\n2.Insert First\n3.insert Position\n4.Insert Last\n5.Delete First\n6.Delete Position\n7.Delete Last\n8.Display\n9.Search\n10.Exit");
            System.out.println("Enter choice");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                  l.creation();
                  break;
                case 2:
                  l.insertFirst();
                  break;
                case 3:
                  l.insertPosition();
                  break;
                case 4:
                  l.insertLast();
                  break;
                case 5:
                  l.deleteFirst();
                  break;
                case 6:
                  l.deletePosition();
                  break;
                case 7:
                  l.deleteLast();
                  break;
                case 8:
                  l.display();
                  break;
                case 9:
                  l.search();
                  break;
                case 10:
                  System.exit(0);
                default:
                  System.out.println("Invalid choice");
            }
        }while(choice!=10);
    }
}
