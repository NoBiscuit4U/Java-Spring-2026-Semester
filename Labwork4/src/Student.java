
public class Student {
	protected String m_name;
	protected int m_student_id;
	protected String m_department;
	
	public Student(String name,int student_id,String department) {
		this.m_name=name;
		this.m_student_id=student_id;
		this.m_department=department;
	}
	
	public void displayDetails() {
		System.out.println("Student: "+this.m_name);
		System.out.println("	ID: "+this.m_student_id);
		System.out.println("	Department: "+this.m_department);
	}
}
