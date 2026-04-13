package core;
import java.util.Scanner;

public class Classwork11 {
	
	public static int returnGrt(int[] arr) {
		int grt_int=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>grt_int) {
				grt_int=arr[i];
			}
		}	
		
		return grt_int;
	}

	public static void main(String[] args){
		Scanner scnr=new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		
		int[] arr=new int[scnr.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("\nEnter Value for Array:");
			arr[i]=scnr.nextInt();
		}
		
		
		System.out.print("Greatest Int: ");
		System.out.println(returnGrt(arr));
	}

}
