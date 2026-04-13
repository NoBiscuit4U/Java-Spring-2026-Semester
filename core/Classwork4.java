package core;
import java.util.Scanner;

public class Classwork4 {
	public static enum states{
		DIV4,DIV100,DIV400,ISLY,NOTLY,END
	}
	
	public static void main(String[] args){
		Scanner scnr=new Scanner(System.in);
		
		System.out.print("Enter Year: ");
		int year=scnr.nextInt();
		
		states current_state=states.DIV4;
		
		while(current_state!=states.END) {
			switch(current_state) {
				case states.DIV4:
					if(year%4==0) {
						current_state=states.DIV100;
					}else {
						current_state=states.NOTLY;
					}
				break;
				case states.DIV100:
					if(year%100==0) {
						current_state=states.DIV400;
					}else {
						current_state=states.ISLY;
					}
				break;
				case states.DIV400:
					if(year%400==0) {
						current_state=states.ISLY;
					}else {
						current_state=states.NOTLY;
					}
				break;
				case states.ISLY:
					System.out.println("Is a Leap Year, 366 Days");
					current_state=states.END;
				break;
				case states.NOTLY:
					System.out.println("Not a Leap Year, 365 Days");
					current_state=states.END;
				break;
				case states.END:
				
			}
		}
	}
}
