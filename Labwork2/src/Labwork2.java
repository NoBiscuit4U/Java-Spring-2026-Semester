import java.util.Scanner;

public class Labwork2{

	public static void main(String args[]) {
		Scanner scnr=new Scanner(System.in);
		
		System.out.println("Enter a/c number:");
		int acc_num=scnr.nextInt();
		
		System.out.println("Enter the name:");
		String acc_name=scnr.next();
		
		System.out.println("Enter the initial amount:");
		double balance=scnr.nextDouble();
		
		BankAccount obj1=new BankAccount(acc_num,acc_name,balance);
		
		obj1.displayDetails();
		
		System.out.println("Enter the amount to be deposited:");
		double dep_amount=scnr.nextDouble();
		obj1.deposit(dep_amount);
		
		System.out.println("Enter the amount to be debited:");
		double with_amount=scnr.nextDouble();
		obj1.withdraw(with_amount);
	}

}