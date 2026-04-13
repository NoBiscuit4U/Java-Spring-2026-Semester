package Classwork21;
import java.util.*;

public class Main21 {

		public static void main(String[] args){
			Scanner scnr=new Scanner(System.in);
			
			Employee emp1=new Employee("Dan",15,1001,10000);
			Employee emp2=new Employee("John",27,1005,10000);
			Employee emp3=new Employee("Joe",27,1009,10000);
			Employee emp4=new Employee("Bob",99,1010,10000);
			
			
			ArrayList<Employee> emp_arr=new ArrayList<Employee>(){{
				add(emp1);
				add(emp2);
				add(emp3);
				add(emp4);
			}};
			
			Collections.sort(emp_arr);
			
			for(Employee e:emp_arr) {
				System.out.println("Name: "+e.getName()+" Age: "+e.getAge()+" ID: "+e.getID());
			}
		}

}
