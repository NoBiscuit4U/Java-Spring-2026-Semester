package core;
import java.util.Scanner;

public class Classwork6 {

	public static void main(String[] args){
		Scanner scnr=new Scanner(System.in);
		
		String str=scnr.next();
		System.out.print("Desired number of words: ");
		int des_num=scnr.nextInt();
		int str_len=str.length();
		int div_index=Math.round(str_len/des_num);
		boolean round_last=false;
		
		if(div_index*des_num!=str_len){
			round_last=true;
		}
			
		String output_str="";
		
		for(int i=0;i<(des_num);i++) {
			int start_index=0+(i*div_index);
			int end_index=0;
			
			if(i==des_num-1 && round_last) {
				end_index=div_index+(i*div_index)+1;
			}else {
				end_index=div_index+(i*div_index);
			}
			
			if(output_str=="") {
				output_str=output_str+str.substring(start_index,end_index);
			}else{
				output_str=output_str+","+str.substring(start_index,end_index);
			}
		}
		
		System.out.println("Output: "+output_str);
	}
}
