package core;
import java.util.Scanner;
import java.math.BigDecimal;

public class Classwork8 {

	public static void main(String[] args){
		Scanner scnr=new Scanner(System.in);
		
		System.out.print("Input Inital Amount: ");
		BigDecimal amount=new BigDecimal(scnr.nextDouble());
		System.out.print("Input Interest Rate: ");
		BigDecimal rate=new BigDecimal(scnr.nextDouble());
		
		for(int i=0;i<10;i++){
			amount=amount.multiply(rate);
			System.out.println("Year "+(i+1)+" Current Amount "+amount.setScale(2));
		}
		
		System.out.println("Final Amount: "+amount.setScale(2));
		
	}
}
