package Classwork10;

public class Student{
	private String m_name;
	private int m_reg_num;
	private double[] m_marks;
	
	private double m_total;
	private double m_average;
	private double m_grade;
	
	public Student(String name,int reg_num,double[] marks){
		this.m_name=name;
		this.m_reg_num=reg_num;
		this.m_marks=marks;
		
		this.m_total=calcTotal();
		this.m_average=calcAverage();
	}
	
	public String getName() {
		return this.m_name;
	}
	
	public int getRegNum() {
		return this.m_reg_num;
	}
	
	public double[] getMarks() {
		return this.m_marks;
	}
	
	public double getTotal() {
		return this.m_total;
	}
	
	public double getAverage() {
		return this.m_average;
	}
	
	private double calcTotal() {
		double total=0;
		
		for(int i=0;i<this.m_marks.length;i++) {
			total+=this.m_marks[i];
		}
		
		return total;
	}
	
	private double calcAverage() {
		return (this.m_total/this.m_marks.length);
	}
}
