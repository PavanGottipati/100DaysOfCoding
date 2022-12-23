//Java program to implement Queue using Array
import java.util.Scanner;
class Queues
{
    int rear=-1,front=-1;
    int arr[];
    int size;
    Queues(int size)
    {
      this.size=size;
      arr=new int[size];
    }
    void enqueue()
    {
      Scanner sc=new Scanner(System.in);
      if(rear==size-1)
      {
        System.out.println("Queue Overflow");
      }
      else
      {
        System.out.println("Enter data ");
        int data=sc.nextInt();
        rear++;
        arr[rear]=data;
        if(front==-1)
        {
            front=0;
        }
      }
    }
    void dequeue()
    {
        if(front==-1)
        {
            System.out.println("Queue Underflow");
        }
        else
        {
          System.out.println("The deleted element is "+arr[front]);
          front++;
          if(front>rear)
          {
            front=rear=-1;
          }
        }
    }
    void display()
    {
      if(front==-1)
      {
        System.out.println("Queue is Empty");
      }
      else
      {
        int temp=front;
        System.out.print("The elements in the Queue are  =  ");
        while(temp<=rear)
        {
            System.out.print(arr[temp]+"  ");
            temp++;
        }
        System.out.println();
      }
    }
}
class QueueArray
{
    public static void main(String [] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Queue size");
       int n=sc.nextInt();
       Queues q=new Queues(n);
       int choice;
       do
       {
        System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
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
             System.exit(0);
          default:
             System.out.println("Invalid Choice");
        }
      }while(choice!=4);
    }
}
