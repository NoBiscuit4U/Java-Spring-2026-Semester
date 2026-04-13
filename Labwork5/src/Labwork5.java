import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Labwork5{

	public static void main(String args[]) {
		Scanner scnr=new Scanner(System.in);
		
		Student stu1=new Student(101,"John",88);
		Student stu2=new Student(102,"Joe",95);	
		Student stu3=new Student(101,"Joe",68);
		
		Teacher tch1=new Teacher(101,"Donald","Computer Science");
		
		ArrayList<Student> student_arr=new ArrayList<Student>() {{
			add(stu1);
			add(stu2);
			add(stu3);
		}};
		
		Collections.sort(student_arr);
		
		tch1.displayDetails();
		stu1.displayDetails();
		stu2.displayDetails();
		stu3.displayDetails();
		
		for(Student stu:student_arr) {
			System.out.println(stu.getName()+" "+stu.getMarks()+" "+stu.getGrade());
		}
	}

}