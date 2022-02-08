package infosys.demo.classobjectdemo4;

import java.util.Scanner;

public class Student {
 private int roll;
 private String name;
 private int marks;
 //private Scanner scanner=new Scanner(System.in);
 // to import press ctrl+Shift+o or ctrl+O
 public void setStudentData()
 {
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("Enter roll");
	 roll=scanner.nextInt();
	 System.out.println("Enter name");
	 name=scanner.next();
	 marks=scanner.nextInt();
 }
 public void displayData()
 {
	 System.out.println(roll);
	 System.out.println(name);
	 System.out.println(marks);
 }
 
}


