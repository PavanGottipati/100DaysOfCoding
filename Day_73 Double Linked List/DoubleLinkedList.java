//Java program to implement Double Linked List
import java.util.Scanner;
class DoubleLL {
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
    void creation()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter data to be inserted");
        int data=sc.nextInt();
        Node newnode=new Node(data);
        head=newnode;
    }
    void insertFirst()
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
            head=newnode;
            System.out.println("Node inserted successfully");
        }
    }
    void insertPosition()
    {
        Scanner sc=new Scanner(System.in);
        if(head==null)
        {
            System.out.println("Can't be inserted... List is empty");
        }
        else
        {
            System.out.println("Enter position to be inserted");
            int pos=sc.nextInt();
            Node temp=head;
            Node pre=null;;
            for(int i=1;i<pos;i++)
            {
                pre=temp;
                temp=temp.next;
                if(temp==null)
                {
                    System.out.println("Can't insert data... As the list is small as Compared to position");
                    return;
                }
            }
            System.out.println("Enter data to be inserted");
            int data=sc.nextInt();
            Node newnode=new Node(data);
            newnode.next=temp;
            temp.prev=newnode;
            pre.next=newnode;
            newnode.prev=pre;
            System.out.println("Node inserted successfully");
        }
    }
    void insertLast()
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
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
           temp.next=newnode;
           newnode.prev=temp;
           System.out.println("Node inserted Successfully"); 
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
            head.prev=null;
            System.out.println("Node deleted successfully");
        }
    }
    void deletePosition()
    {
        Scanner sc=new Scanner(System.in);
        if(head==null)
        {
            System.out.println("Can't be deleted... List is empty");
        }
        else
        {
           System.out.println("Enter position to be deleted");
           int pos=sc.nextInt();
           Node temp=head;
           Node pre=null;
           for(int i=0;i<pos;i++)
           {
            pre=temp;
            temp=temp.next;
            if(temp==null)
            {
                System.out.println("Can't be deleted... As the list is small as compared to position");
            }
           }
           temp.next.prev=pre;
           pre.next=temp.next;
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
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.prev.next=null;
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
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"  ");
                temp=temp.next;
            }
        }
    }
} 
class DoubleLinkedList
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        DoubleLL d=new DoubleLL();
        int choice;
        do
        {
            System.out.println();
            System.out.println("1.Create\n2.Insert First\n3.insert Position\n4.Insert Last\n5.Delete First\n6.Delete Position\n7.Delete Last\n8.Display\n9.Exit");
            System.out.println("Enter choice");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                  d.creation();
                  break;
                case 2:
                  d.insertFirst();
                  break;
                case 3:
                  d.insertPosition();
                  break;
                case 4:
                  d.insertLast();
                  break;
                case 5:
                  d.deleteFirst();
                  break;
                case 6:
                  d.deletePosition();
                  break;
                case 7:
                  d.deleteLast();
                  break;
                case 8:
                  d.display();
                  break;
                case 9:
                  System.out.println("Exit from the Execution Flow");
                  System.exit(0);
                default:
                  System.out.println("Invalid choice");
            }
        }while(choice!=10);
    }
}
