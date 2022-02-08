package infosys.demo.classobjectdemo3;

public class Student {
 private int roll;
 private String name;
 private int marks;
 // From local variable r the value is getting 
 // stored in the local variable roll and
 // same with rest of the two variables 
 // namely name and marks
 public void setStudentData(int r,String nm, int m)
 {
	int roll=r;
	String name=nm;
	int marks=m;
 }
 public void displayData()
 {
	 System.out.println(roll);
	 System.out.println(name);
	 System.out.println(marks);
 }
 
}