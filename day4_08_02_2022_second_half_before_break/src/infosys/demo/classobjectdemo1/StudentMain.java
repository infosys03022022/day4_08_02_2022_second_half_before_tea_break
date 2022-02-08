package infosys.demo.classobjectdemo1;

public class StudentMain {

	public static void main(String[] args) {
		Student student=new Student();
		Student student1=new Student();
		Student student2=new Student();
		student.setStudentData();
		student.displayData();
	    student1.setStudentData();
	    student1.displayData();
	    student2.setStudentData();
	    student2.displayData();
	}

}
