package core;
import java.util.Scanner;

public class Classwork1 {
	public void classwork() {
		Scanner scnr=new Scanner(System.in);
		
		System.out.println("Enter Desired Operator: ");
		
		String operator=scnr.next();
		
		System.out.println("Enter Two Numbers: ");
		
		int x=scnr.nextInt();
		int y=scnr.nextInt();
		
		switch(operator) {
			case "+":
				System.out.println("Output: "+(x+y));
			break;
			case "-":
				System.out.println("Output: "+(x-y));
			break;
			case "*":
				System.out.println("Output: "+(x*y));
			break;
			case "/":
				System.out.println("Output: "+(x/y));
			break;
		}
		
		scnr.close();
	}
}
