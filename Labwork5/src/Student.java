
public class Student extends Person implements Comparable<Student>{
	private int id;
	private String name;
	private int marks;
	private static String role="Student";
	
	public Student(int id,String name,int marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public String getRoleDescription() {
		return "Student Currently Enrolled";
	}
	
	public int getMarks() {
		return this.marks;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getGrade() {
		String returnValue="";
		if(this.marks>=90) {
			returnValue="A";
		}else if(this.marks>=80) {
			returnValue="B";
		}else if(this.marks>=70) {
			returnValue="C";
		}else if(this.marks>=60) {
			returnValue="D";
		}else {
			returnValue="F";
		}
		
		return returnValue;
	}
	
	@Override
	public int compareTo(Student stu) {
		return this.marks!=stu.getMarks()?new Integer(stu.getMarks()).compareTo(this.getMarks()):stu.getName().compareTo(this.name);
	}

	public void displayDetails(){
		System.out.println("Name: "+this.name);
		System.out.println("Role: "+this.role);
		System.out.println("Description: "+this.getRoleDescription());
		System.out.println("ID: "+this.id);
		System.out.println("Marks: "+this.marks);
		System.out.println("Letter Grade: "+this.getGrade());
		System.out.println();
	}
}
