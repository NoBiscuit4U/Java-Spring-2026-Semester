import java.util.Scanner;
import java.util.ArrayList;

public class Labwork4{

	public static void main(String args[]) {
		Scanner scnr=new Scanner(System.in);
		
		UndergraduateStudent newug=new UndergraduateStudent("John Smith",123,"Computer Science",2);
		GraduateStudent newg=new GraduateStudent("Sarah Lee",456,"Data Science","Machine Learning in HealthCare");
		
		newug.displayDetails();
		newg.displayDetails();
					
	}

}