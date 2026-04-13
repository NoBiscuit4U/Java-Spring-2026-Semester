
public class Teacher extends Person{
	private int id;
	private String name;
	private String subject;
	private static String role="Teacher";
	
	public Teacher(int id,String name,String subject) {
		this.id=id;
		this.name=name;
		this.subject=subject;
	}
	
	public String getRoleDescription() {
		return "Teaches "+this.subject;
	}
	
	public void displayDetails(){
		System.out.println("Name: "+this.name);
		System.out.println("Role: "+this.role);
		System.out.println("Description: "+this.getRoleDescription());
		System.out.println("ID: "+this.id);
		System.out.println();
	}
}
