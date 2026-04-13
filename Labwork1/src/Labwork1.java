import java.util.Scanner;

public class Labwork1{

	public static void main(String args[]) {
	
		Scanner scnr=new Scanner(System.in);
		
		System.out.println("Enter String to Reverse: ");
		
		String input=scnr.nextLine();
		
		System.out.println("Input Char to Check For: ");
		
		Character check_char=scnr.next().charAt(0);
		
		int num_occurences=0;
		
		String reversed="";
		
		
		for(int i=0;i<input.length();i++) {
		
			num_occurences=(input.charAt(i)==check_char)?num_occurences+1:num_occurences;
			
			reversed+=input.charAt((input.length()-1)-i);
		
		}
		
		System.out.print("Reversed Line is: ");
		
		System.out.println(reversed);
		
		System.out.print("Num of Occurences of "+check_char+": ");
		
		System.out.println(num_occurences);
	
	}

}