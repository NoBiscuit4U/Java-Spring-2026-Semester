package Classwork13;
import java.util.Scanner;
import Classwork12.Calc;

public class Main_Classwork13 {

	public static void main(String[] args){
		Scanner scnr=new Scanner(System.in);
		
		System.out.println("Mult 2: "+Calc13.mult(10.0,1.0));
		System.out.println("Mult Arr: "+Calc13.mult(new double[]{10.0,1.0,10.0,1.0}));
	}

}