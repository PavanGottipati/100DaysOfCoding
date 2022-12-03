//Java program to calculate the grade of N students
import java.util.*;
class StudentGrade
{
     public static void main(String[] args) 
     { 
         Scanner sc = new Scanner(System.in); 
         System.out.println("Enter number of students: ");
         int n = sc.nextInt();
         int rollNo[] = new int[n];
         String name[]=new String[n];
         int s1[] = new int[n];
         int s2[] = new int[n];
         int s3[] = new int[n];
         double total[] = new double[n];
         double avg[] = new double[n];
         String grade[]=new String[n];
         for (int i = 0; i < n; i++) {
             System.out.println("Enter student " + (i+1) + " details:");
             System.out.print("Roll No: ");
             rollNo[i] = sc.nextInt();
             System.out.print("Roll Name: ");
             name[i] = sc.next();
             System.out.print("Subject 1 Marks: ");
             s1[i] = sc.nextInt();
             System.out.print("Subject 2 Marks: ");
             s2[i] = sc.nextInt();
             System.out.print("Subject 3 Marks: ");
             s3[i] = sc.nextInt();
             total[i]= (s1[i] + s2[i] + s3[i]);
             avg[i] = total[i]/ 3.0;
             if(avg[i]>=80)
             {
                grade[i]="A";
             }
             else if(avg[i]>=60)
             {
                grade[i]="B";
             }
             else if(avg[i]>=40)
             {
                grade[i]="C";
             }
             else{
                grade[i]="Fail";
             }
         }
         System.out.println("*****************************************************************");
         System.out.printf("%-15s%-15s%-15s%-15s%-15s","Roll No","Name","Total","Average","Grade");
         System.out.println();
         System.out.println("*****************************************************************");
         for (int i = 0; i < n; i++) {
         System.out.printf("%-15d%-15s%-15f%-15f%-15s",rollNo[i],name[i],total[i],avg[i],grade[i]);
         System.out.println();
        }
    }
}
