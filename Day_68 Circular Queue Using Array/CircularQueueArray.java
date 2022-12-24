//Java program to implement Circular Queue using Arrays
import java.util.Scanner;
class CircleQ
{
    int arr[];
    int front=-1;
    int rear=-1;
    CircleQ(int size)
    {
        arr=new int[size];
    }
    void enqueue()
    {
        Scanner sc=new Scanner(System.in);
        if(((front==0)&&(rear==arr.length-1))||(front==rear+1))
        {
            System.out.println("Queue Overflow");
            return;
        }
        System.out.println("Enter data to be inserted");
        int data=sc.nextInt();
        if(front==-1)
        {
            front=rear=0;
        }
        else
        {
            if(rear==arr.length-1)
            {
                rear=0;
            }
            else
            {
                rear++;
            }
        }
        arr[rear]=data;
        System.out.println("Data inserted Successfully");
    }
    void dequeue()
    {
        if(front==-1)
        {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("The deleted element is "+arr[front]);
        if(front==rear)  // If queue has only one element
        {
           front=rear=-1;
        }
        else
        {
            if(front==arr.length-1)
            {
                front=0;
            }
            else
            {
                front++;
            }
        }
    }
    void display()
    {
       int temp=front;
       if(front==-1)
       {
        System.out.println("Queue is Empty");
        return;
       }
       System.out.print("The elements in the Queue are ");
       if(temp<=rear)
       {
         while(temp<=rear)
         {
           System.out.print(arr[temp]+" ");
           temp++;
         }
       }
       else
       {
        while(temp<=arr.length-1)
        {
            System.out.print(arr[temp]+" ");
            temp++;
        }
        temp=0;
        while(temp<=rear)
        {
            System.out.print(arr[temp]+" ");
            temp++;
        }
       }
       System.out.println();
    }
}
class CircularQueueArray
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array size");
    int n=sc.nextInt();
    CircleQ qo=new CircleQ(n);
    int choice;
    do
    {
        System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
        System.out.println("Enter your choice ");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
               qo.enqueue();
               break;
            case 2:
               qo.dequeue();
               break;
            case 3:
               qo.display();
               break;
            case 4:
               System.exit(0);
               break;
            default:
               System.out.println("Invalid choice");
        }
    }while(choice!=4);
  }   
}
