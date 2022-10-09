import java.util.Scanner;
class Student {  
    //instance variables of the class  
    int id;  
    String name;  
      
    Student(){  
    System.out.println("this a default constructor");  
    }  
      
    Student(int i, String n){  
    id = i;  
    name = n;  
    }  
}
 class ConstructorOverloading
 {     
    public static void main(String[] args) {  
    //object creation  
    Scanner sc=new Scanner(System.in);
    Student s = new Student();  
    System.out.println("\nDefault Constructor values: \n");  
    System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name);  
      
    System.out.println("\nParameterized Constructor values: \n"); 
    System.out.println("Enter student number ");
    int sno=sc.nextInt();
    System.out.println("Enter student name ");
    String sname=sc.next(); 
    Student student = new Student(sno,sname);  
    System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);  
    }  
}  
