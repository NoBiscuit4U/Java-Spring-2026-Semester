package core;
import java.util.Scanner;
import java.util.ArrayList;

public class Classwork15 {
	public static void main(String[] args){
		Scanner scnr=new Scanner(System.in);
		
		ArrayList<Double> prices=new ArrayList<Double>();
		ArrayList<String> options=new ArrayList<String>() {
			{
				add("Add Product Price");
				add("Remove Product");
				add("View Cart");
				add("Calculate Total");
				add("Exit");
			}
		};
		
		while(true) {
			System.out.println("Operations: ");
			for(int i=0;i<options.size();i++) {
				System.out.println("	"+i+": "+options.get(i));
			}
			
			System.out.println("Enter Number of Desired Operation: ");
			int select_oper=scnr.nextInt();
			
			if(select_oper==4) {
				break;
			}
			
			switch(select_oper){
				case 0:
					System.out.println("Enter New Prices: ");
					prices.add(scnr.nextDouble());
				break;
				case 1:
					System.out.println("Enter Index to Remove: ");
					prices.remove(scnr.nextInt());
				break;
				case 2:
					System.out.println("Prices: ");
					for(int i=0;i<prices.size();i++) {
						System.out.println("	"+i+": "+prices.get(i));
					}
				break;
				case 3:
					double total=0;
					
					for(int i=0;i<prices.size();i++) {
						total+=prices.get(i).doubleValue();
					}
					System.out.println("Total: "+total);
				break;
			}
		}
	}

}
