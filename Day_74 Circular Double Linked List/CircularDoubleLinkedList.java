import java.util.Scanner;
class CircleD
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
  Node head=null;
  Node tail=null;
  void creation()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter data to be inserted");
    int data=sc.nextInt();
    Node newnode=new Node(data);
    head=tail=newnode;
    newnode.next=newnode;
    newnode.prev=newnode;
  }
  void insertFirst()
  {
    Scanner sc=new Scanner(System.in);
    if(head==null)
    {
        System.out.println("List is empty");
    }
    else
    {
        System.out.println("Enter data to be inserted");
        int data=sc.nextInt();
        Node newnode=new Node(data);
        newnode.next=head;
        head.prev=newnode;
        newnode.prev=tail;
        tail.next=newnode;
        head=newnode;
        System.out.println("Node inserted successfully");
    }
  }
  void insertLast()
  {
    Scanner sc=new Scanner(System.in);
    if(head==null)
    {
        System.out.println("Can't insert... List is empty");
    }
    else
    {
        System.out.println("Enter data to be inserted");
        int data=sc.nextInt();
        Node newnode=new Node(data);
        newnode.next=head;
        head.prev=newnode;
        newnode.prev=tail;
        tail.next=newnode;
        tail=newnode;
        System.out.println("Node inserted successfully");
    }
  }
  void deleteFirst()
  {
    if(head==null)
    {
        System.out.println("Can't be deleted... List is empty");
    }
    else
    {
        head=head.next;
        head.prev=tail;
        tail.next=head;
        System.out.println("Node deleted successfully");
    }
  }
  void deleteLast()
  {
    if(head==null)
    {
       System.out.println("Can't be deleted... List is empty");
    }
    else
    {
        tail=tail.prev;
        tail.next=head;
        head.prev=tail;
        System.out.println("Node deleted successfully");
    }
  }
  void display()
  {
    if(head==null)
    {
        System.out.println("List is empty");
    }
    else
    {
        System.out.println("The elements are ");
        Node temp=head;
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
class CircularDoubleLinkedList {
    public static void main(String [] args)
    {
    Scanner sc=new Scanner(System.in);
    CircleD c=new CircleD();
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
