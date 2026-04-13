package Classwork12;
import java.util.Scanner;
import Classwork12.Calc;

public class Main_Classwork12 {

	public static void main(String[] args){
		Scanner scnr=new Scanner(System.in);

		String[] oper=Calc.input_to_operations("[(3+3)*(5-2)]+(3*7)");
		
		/*System.out.println("Input x, y, and operator");
		String[] vals=scnr.nextLine().split(",");
		
		System.out.print("Output: ");
		System.out.println(Calc.two_var_calculator(Double.parseDouble(vals[0]),Double.parseDouble(vals[1]),vals[2]));*/
	}

}