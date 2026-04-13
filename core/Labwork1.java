package core;

import java.util.Scanner;

public class Labwork1 {

	public static void main(String[] args){
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter Values seperated by , : ");
		String[] values=scnr.nextLine().split(",");
		
		int gv=0;
		
		for(int i=0;i<values.length;i++) {
			if(Integer.parseInt(values[i])>gv) {
				gv=Integer.parseInt(values[i]);
			}
		}
		
		System.out.print("Greatest Value: ");
		System.out.println(gv);
	}
}
