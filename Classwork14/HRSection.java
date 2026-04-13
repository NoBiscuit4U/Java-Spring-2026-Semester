package Classwork14;

public class HRSection {
	private String m_name;
	private int m_id;
	private double m_gross_salary;
	private double m_net_salary;

	public HRSection(String name,int id,double gross_salary) {
		this.m_name=name;
		this.m_id=id;
		this.m_gross_salary=gross_salary;
	}
	
	private void salcalculation(double fed_tax,double state_tax,double local_tax) {
		this.m_net_salary=(this.m_gross_salary-fed_tax-state_tax-local_tax);
	}
	
	public void displaySal(double fed_tax,double state_tax,double local_tax) {
		this.salcalculation(fed_tax, state_tax, local_tax);
		System.out.println("Employee: "+this.m_name+" ID: "+this.m_id+" Net Salary: "+this.m_net_salary);
	}
}
