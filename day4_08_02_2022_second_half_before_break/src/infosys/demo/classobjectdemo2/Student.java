package infosys.demo.classobjectdemo2;

public class Student {
 private int roll;
 private String name;
 private int marks;
 
 public void setStudentData(int r,String nm, int m)
 {
	 roll=r;
	 name=nm;
	 marks=m;
 }
 public void displayData()
 {
	 System.out.println(roll);
	 System.out.println(name);
	 System.out.println(marks);
 }
 
}


