package core;
import java.util.Scanner;

public class Classwork2 {
	public static void main(String[] args){
		Scanner scnr=new Scanner(System.in);
		
		double x=scnr.nextInt();
		double y=scnr.nextInt();
		
		x=x+(y/100);
		y=y+(Math.floor(x)/100);
		
		System.out.println("First Value: "+Math.round((x-Math.floor(x))*100));
		System.out.println("Second Value: "+Math.round((y-Math.floor(y))*100));
		
		scnr.close();
	}
}
