package Classwork17;

import java.util.Scanner;

public class Main17 {

		public static void main(String[] args){
			Scanner scnr=new Scanner(System.in);
			
			Student new_student=new Student("John",22,0011,6,180);
			new_student.institute("JBU",1919,100,150,500,15);
			new_student.department("CS",100,150,150,100);
			
			new_student.display();
		}

}
