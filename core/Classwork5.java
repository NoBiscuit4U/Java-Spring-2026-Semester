package core;
import java.util.Scanner;

public class Classwork5 {

	public static void main(String[] args){
		Scanner scnr=new Scanner(System.in);
		
		System.out.print("Enter Time: ");
		double time=scnr.nextDouble();
		double toll=0;
		
		if(time<6.00){
			toll=1.55;
		}else if(time<9.59) {
			toll=4.65;
		}else if(time<17.59) {
			toll=2.35;
		}else{
			toll=1.55;
		}
		
		System.out.print("Toll is: "+toll);
	}
}
