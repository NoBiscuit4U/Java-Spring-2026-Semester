package core;
import java.util.Scanner;

public class Classwork3 {
	public static void main(String[] args){
		Scanner scnr=new Scanner(System.in);
		
		System.out.println("Enter a kind of relative: ");
		String relative=scnr.next();
		System.out.println("Enter a kind of food: ");
		String food=scnr.next();
		System.out.println("Enter an adjective: ");
		String adjective=scnr.next();
		System.out.println("Enter a time period: ");
		String time=scnr.next();
		
		System.out.println("My "+relative+" says eating "+food+" will make me more "+adjective+", so now I eat it every "+time+".");
		
		scnr.close();
	}
}
