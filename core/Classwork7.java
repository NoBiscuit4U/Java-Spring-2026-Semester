package core;
import java.util.Scanner;

public class Classwork7 {

	public static void main(String[] args){
		Scanner scnr=new Scanner(System.in);
		
		System.out.print("Enter Numbers For Averaging Seperated by ,: ");
		String[] nums = scnr.next().split(",");
		double total=0;
		
		
		for(int i=0;i<nums.length;i++) {
			total=total+Double.parseDouble(nums[i]);
		}
		
		System.out.println("Average: "+(total/nums.length));
		scnr.close();
	}
}
