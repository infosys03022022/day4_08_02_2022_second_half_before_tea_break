package infosys.demo.classobjectdemo5;

import java.util.Scanner;

public class StudentMain{
       public static void main (String s[]) {
         Student student1=new Student();
         Student student2=new Student();
         Scanner scanner=new Scanner(System.in);
         System.out.println("Enter the roll number");
         int roll=scanner.nextInt();
         student1.setRoll(roll);
         System.out.println("Enter the name");
         String name=scanner.next();
         student1.setName(name);
         System.out.println("Enter the marks");
         int marks=scanner.nextInt();
         student1.setMarks(marks);
         System.out.println("The details of the first student");
         System.out.println(student1.getRoll());  // Withing System.out.println we can call a 
         // method which is returning a value. Within System.out.println we cannot call a 
         // method which return type is void
         //System.out.println(student1.setRoll(roll));
         System.out.println(student1.getName());
         System.out.println(student1.getMarks());
         System.out.println("Enter the roll number");
         student2.setRoll(scanner.nextInt());
         System.out.println("Enter the name");
         student2.setName(scanner.next());
         /* System.out.println("Enter the marks");
         student2.setMarks(scanner.nextInt()); */
        // System.out.println(student2.setRoll(roll));
          System.out.println(student2.getRoll());
          System.out.println(student2.getName());
        /*  System.out.println(student2.getMarks()); */
         
         
         
         
       }
    }