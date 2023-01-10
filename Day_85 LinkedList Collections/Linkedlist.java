import java.util.*;  
class Linkedlist{  
 public static void main(String args[]){  
  Scanner sc=new Scanner(System.in);
  try{
  LinkedList<Integer> list1=new LinkedList<Integer>(); 
  LinkedList<Integer> list2=new LinkedList<Integer>(); 
  int choice;
do{
  System.out.println("1.Add 2.AddFirst 3.AddPosition 4.AddLast 5.RemoveFirst 6.RemoveLast 7.Sort 8.Display 9.CopyList1ToList2 10.Exit");
  System.out.println("Enter your choice");
  choice=sc.nextInt();
  switch(choice)
  {
    case 1:
       System.out.println("Enter value");
       int val=sc.nextInt();
       list1.add(val);
       break;
    case 2:
       System.out.println("Enter value to be inserted at First");
       int value=sc.nextInt();
       list1.addFirst(value);
       break;
    case 3:
       System.out.println("Enter position to be inserted");
       int pos=sc.nextInt();
       System.out.println("Enter value");
       int data=sc.nextInt();
       list1.add(pos,data);
       break;
    case 4:
       System.out.println("Enter value to be inserted at Last");
       int values=sc.nextInt();
       list1.addLast(values);
       break;
    case 5:
       list1.removeFirst();
       System.out.println("Elements removed at First");
       break;
    case 6:
       list1.removeLast();
       System.out.println("Element removed at Last");
       break;
    case 7:
       Collections.sort(list1);
       break;
    case 8:
       System.out.println("The elements in the list are "+list1);
       break;
    case 9:
       System.out.println("Copying elements from list1 to list2");
       list2.addAll(list1);
       System.out.println("The list1 is "+list1);
       System.out.println("The list2 is "+list2);
       break;
    case 10:
       System.out.println("Exit..............");
       System.exit(0);
    default:
       System.out.println("Invalid choice"); 
  }  
  }while(choice!=11);
}
catch(Exception e)
{
    System.out.println(e);
}
 }  
}  
