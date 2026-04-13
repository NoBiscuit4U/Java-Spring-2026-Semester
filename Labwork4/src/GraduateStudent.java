
public class GraduateStudent extends Student{
	protected String m_researchTopic;
	
	public GraduateStudent(String name,int student_id,String department,String researchTopic) {
		super(name,student_id,department);
		this.m_researchTopic=researchTopic;
	}
	
	public void displayDetails() {
		System.out.println("Student: "+this.m_name);
		System.out.println("	ID: "+this.m_student_id);
		System.out.println("	Department: "+this.m_department);
		System.out.println("	ResearchTopic: "+this.m_researchTopic);
	}
}
