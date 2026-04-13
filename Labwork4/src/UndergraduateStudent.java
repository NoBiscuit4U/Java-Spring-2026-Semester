
public class UndergraduateStudent extends Student{
	protected int m_yearstudy;
	
	public UndergraduateStudent(String name,int student_id,String department,int yearstudy) {
		super(name,student_id,department);
		this.m_yearstudy=yearstudy;
	}
	
	public void displayDetails() {
		System.out.println("Student: "+this.m_name);
		System.out.println("	ID: "+this.m_student_id);
		System.out.println("	Department: "+this.m_department);
		System.out.println("	Year of Study: "+this.m_yearstudy);
	}
}
