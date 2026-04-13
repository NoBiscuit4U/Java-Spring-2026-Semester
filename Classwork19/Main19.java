package Classwork19;

import java.util.Scanner;

public class Main19 {

		public static void main(String[] args){
			Scanner scnr=new Scanner(System.in);
			InfTest test=new InfTest();
			
			double x=scnr.nextDouble();
			double y=scnr.nextDouble();
			
			String pos_neg_x=test.checkSign(x)?"Postive":"Negative";
			String pos_neg_y=test.checkSign(y)?"Postive":"Negative";
			System.out.println("x is: "+pos_neg_x);
			System.out.println("y is: "+pos_neg_y);
			System.out.println("Add Digits: "+test.addDigits(x, y));
			System.out.println("Add: "+test.add(x, y));
			System.out.println("Subtract: "+test.sub(x, y));
			System.out.println("Multiply: "+test.mul(x, y));
			System.out.println("Divide: "+test.div(x, y));
		}

}
