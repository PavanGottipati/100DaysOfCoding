//Java program to implement Hybrid Inheritance
//Take input from user of Student details and marks and sports grade and Display the results.
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
  double m1,m2,m3;
  Test(int sno,String sname,double m1,double m2,double m3)
  {
    super(sno,sname);
    this.m1=m1;
    this.m2=m2;
    this.m3=m3;
  }
}
interface Sports
{
    char grade='A';
    void showGrade();
}
class Result extends Test implements Sports
{
    double total;
    Result(int sno,String sname,double m1,double m2,double m3)
    {
        super(sno,sname,m1,m2,m3);
    }
    void show()
    {
        total=m1+m2+m3;
        System.out.println();
        System.out.println("The Academic Details of Student are");
        System.out.println("-----------------------------------");
        System.out.println("sno "+sno);
        System.out.println("sname "+sname);
        System.out.println("Total Marks "+total);
        System.out.println("-----------------------------------");
    }
    public void showGrade()
    {
        System.out.println();
        System.out.println();
        System.out.println("The Sports Grade of a Student are");
        System.out.println("---------------------------------");
        System.out.println("sno "+sno);
        System.out.println("sname "+sname);
        System.out.println("Grade "+grade);
        System.out.println("---------------------------------");
    }
}
class HybridInheritance
{
 public static void main(String [] args)
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the details of a Student");
    System.out.println("Enter Student Roll Number");
    int sno=sc.nextInt();
    System.out.println("Enter student name");
    String sname=sc.next();
    System.out.println("Enter Student marks of Three Subjects ");
    System.out.println("Enter marks in Maths");
    double m1=sc.nextDouble();
    System.out.println("Enter marks in Computer Science");
    double m2=sc.nextDouble();
    System.out.println("Enter marks in Statistics");
    double m3=sc.nextDouble();
    Result r=new Result(sno,sname,m1,m2,m3);
    r.show();
    r.showGrade();
 }    
}
