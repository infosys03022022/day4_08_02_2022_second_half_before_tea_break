package infosys.demo.classobjectdemo3;

public class StudentMain {

	public static void main(String[] args) {
		Student student=new Student();
		student.setStudentData(1,"Ram",50);
		student.displayData();
        Student student1=new Student();
        student1.setStudentData(2,"Nidhi",45);
        student1.displayData();
                
	}

}