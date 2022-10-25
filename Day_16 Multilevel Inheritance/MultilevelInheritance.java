//Java program to implement Multilevel Inheritance
//To take input of student details and three subjects marks and display the student details and total marks
import java.util.Scanner;
class Student
{
    int sno;
    String sname;
    Student(int sno,String sname)
    {
        this.sno=sno;
        this.sname=sname;
    }
}
class Test extends Student
{
  int m1,m2,m3;
  Test(int sno,String sname,int m1,int m2,int m3)
  {
    super(sno,sname);
    this.m1=m1;
    this.m2=m2;
    this.m3=m3;
  }
}
class Result extends Test
{
  double total;
  Result(int sno,String sname,int m1,int m2,int m3)
  {
    super(sno,sname,m1,m2,m3);
  }
  void show()
  {
    total=m1+m2+m3;
    System.out.println("The student details are ");
    System.out.println("Number "+sno);
    System.out.println("Name "+sname);
    System.out.println("Total Marks "+total);
  }
}
class MultilevelInheritance {
 public static void main(String [] args)
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Student details ");
    System.out.println("Student Number ");
    int sno=sc.nextInt();
    System.out.println("Student Name ");
    String sname=sc.next();
    System.out.println("Enter marks of three subjects");
    System.out.println("Science ");
    int m1=sc.nextInt();
    System.out.println("Maths ");
    int m2=sc.nextInt();
    System.out.println("English ");
    int m3=sc.nextInt();
    Result robj=new Result(sno,sname,m1,m2,m3);
    robj.show();
 }   
}
