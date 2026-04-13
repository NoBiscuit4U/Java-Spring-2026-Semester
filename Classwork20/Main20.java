package Classwork20;
import java.util.*;

public class Main20 {

		public static void main(String[] args){
			Scanner scnr=new Scanner(System.in);
				while(true) {
					System.out.println("Enter Name, Major, Year, Age: ");
					String[] input=scnr.nextLine().split(",");
					
					try {
						if(Math.abs(Integer.parseInt(input[3]))<18) {
							throw new Exception("You are not eligible to be a part of this excursion");
						}else if(input[3].contains("-")) {
							throw new Exception("Invalid Age");
						}
					}catch(Exception e){
						System.out.println(e.getMessage());
					}
				}
		}

}
