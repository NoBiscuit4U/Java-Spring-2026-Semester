package Classwork12;

public class Calc{
	
	/*public static double calculate_input(String input) {
		
	}*/
	
	public static String[] input_to_operations(String input) {
		String[] operations;
		int num_paran=0;
		
		for(int i=0;i<input.length();i++) {
			num_paran=input.charAt(i)=='('||input.charAt(i)=='['?num_paran+=1:num_paran;
		}
		
		operations=new String[num_paran];
		int oper_index=0;
		
		for(int i=0;i<input.length();i++) {
			char target_char;
			if(input.charAt(i)=='(' || input.charAt(i)=='[') {
				target_char=input.charAt(i)=='('?')':']';
				for(int j=i;j<input.length();j++) {
					if(input.charAt(j)==target_char) {
						operations[oper_index]=input.substring((i+1),j);
					}
				}
			}
		}
		
		return operations;
	}
	
	public static double two_var_calculator(double x, double y, String operator) {
		double returnValue=0;
		
		switch(operator) {
		case "+":
			returnValue=x+y;
		break;
		case "-":
			returnValue=x-y;
		break;
		case "*":
			returnValue=x*y;
		break;
		case "/":
			returnValue=x/y;
		break;
		}
		
		return returnValue;
	}
}
