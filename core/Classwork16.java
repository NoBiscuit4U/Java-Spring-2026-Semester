package core;
import java.util.Scanner;
import java.util.Scanner;
import java.io.*;

public class Classwork16 {
	public static void main(String[] args){
		File file=new File("test.txt");
		
		try {
			if(file.createNewFile() || file.exists()) {
				FileInputStream fis= new FileInputStream("test.txt");
				FileOutputStream fos= new FileOutputStream("test.txt");
				
				Scanner scnr_fis=new Scanner(fis);
				PrintWriter pwr_fos=new PrintWriter(fos);
				
				pwr_fos.println("TEXT INJECT");
				pwr_fos.close();
				
				System.out.println(scnr_fis.nextLine());
				scnr_fis.close();
			}
				
		}catch(Exception e) {
			System.out.println("Error: "+e);
		}
	}
}
