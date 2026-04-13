package Classwork10;
import java.util.Scanner;

public class Main_Classwork10 {

	public static void main(String[] args){
		Scanner scnr=new Scanner(System.in);
		
		System.out.println("Enter Number of Desired Students: ");
		int num_students=scnr.nextInt();
		
		System.out.println("Enter Number of Marks per Student: ");
		int num_marks=scnr.nextInt();
		
		Student[] students=new Student[num_students];
		
		String[] vals;
		
		for(int i=0;i<num_students;i++){
			System.out.println("Enter Name, Registration Number, 1Mark,...,nMark: ");
			vals=scnr.next().split(",");
			
			double[] marks=new double[num_marks];
			
			for(int j=0;j<num_marks;j++) {
				marks[j]=Double.parseDouble(vals[2+j]);
			}
			
			students[i]=new Student(vals[0],Integer.parseInt(vals[1]),marks);
		}
		
		
		for(int i=0;i<students.length;i++){
			System.out.println(students[i].getName());
			System.out.println("	Registration Number: "+students[i].getRegNum());
			System.out.println("	Average Marks: "+students[i].getAverage());
			System.out.println("	Total Marks: "+students[i].getTotal());
			System.out.println();
		}
	}
}
