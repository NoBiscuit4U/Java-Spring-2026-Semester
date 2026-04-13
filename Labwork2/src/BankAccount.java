import java.util.Scanner;

public class BankAccount {
	private int m_acc_num;
	private String m_acc_name;
	private double m_balance;
	
	public BankAccount(int acc_num,String acc_name,double balance){
		this.m_acc_num=acc_num;
		this.m_acc_name=acc_name;
		this.m_balance=balance;
		
	}
	
	public void displayDetails() {
		System.out.println("Account Number: "+m_acc_num);
		System.out.println("Account Holder: "+m_acc_name);
		System.out.println("Current Balance: "+m_balance);
	}
	
	public void deposit(double amount){
		this.m_balance=this.m_balance+amount;
		
		System.out.println("Deposited: "+amount);
	}
	
	public void withdraw(double amount) {
		if((this.m_balance-amount)<0) {
			System.out.println("Insufficent Funds!");
			System.out.println("Final Balance: "+this.m_balance);
		}else {
			this.m_balance-=amount;
			
			System.out.println("Withdrawn: "+amount);
			System.out.println("Final Balance: "+this.m_balance);
		}
	}

}

