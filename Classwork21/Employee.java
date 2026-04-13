package Classwork21;

public class Employee implements Comparable<Employee>{
	private String m_name;
	private int m_age;
	private int m_id;
	private double m_salary;
	
	public Employee(String name,int age,int id,double salary) {
		this.m_name=name;
		this.m_age=age;
		this.m_id=id;
		this.m_salary=salary;
	}
	
	public String getName() {
		return this.m_name;
	}
	
	public int getAge() {
		return this.m_age;
	}
	
	public int getID() {
		return this.m_id;
	}
	
	@Override
	public int compareTo(Employee emp) {
		boolean agecheck=this.getAge()==emp.getAge()?true:false;
		
		return agecheck?new Integer(this.m_id).compareTo(new Integer(emp.getID())):new Integer(this.m_age).compareTo(new Integer(emp.getAge()));
	}
}
