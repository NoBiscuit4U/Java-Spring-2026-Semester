package Classwork17;

public class Student extends Department{
	private String m_student_name;
	private int m_student_age;
	private int m_reg_num;
	private double m_student_height;
	private double m_student_weight;

	public Student(String student_name, int student_age, int reg_num, double student_height,double student_weight) {
		this.m_student_name=student_name;
		this.m_student_age=student_age;
		this.m_reg_num=reg_num;
		this.m_student_height=student_height;
		this.m_student_weight=student_weight;
	}
	
	public void institute(String inst_name,int estab_year,int faculty_count,int staff_count,int student_count,int num_depts){
		this.m_inst_name=inst_name;
		this.m_estab_year=estab_year;
		this.m_faculty_count=faculty_count;
		this.m_staff_count=staff_count;
		this.m_student_count=student_count;
		this.m_num_depts=num_depts;
	}
	
	public void department(String dept_name,int fresh_count,int soph_count,int junior_count,int senior_count){
		this.m_dept_name=dept_name;
		this.m_fresh_count=fresh_count;
		this.m_soph_count=soph_count;
		this.m_junior_count=junior_count;
		this.m_senior_count=senior_count;
	}
	
	public void display(){
		System.out.println("Institute Name: "+this.m_inst_name);
		System.out.println("	Student Name: "+this.m_student_name);
		System.out.println("		Age: "+this.m_student_age);
		System.out.println("		Registration Number: "+this.m_reg_num);
		System.out.println("		Height: "+this.m_student_height);
		System.out.println("		Weight: "+this.m_student_weight);
		System.out.println("	Department: "+this.m_dept_name);
		System.out.println("		Number of Freshman: "+this.m_fresh_count);
		System.out.println("		Number of Sophmores: "+this.m_soph_count);
		System.out.println("		Number of Juniors: "+this.m_junior_count);
		System.out.println("		Number of Seniors: "+this.m_senior_count);
	}
	
}
