import java.util.Scanner;
import java.util.ArrayList;

public class Labwork3{

	public static void main(String args[]) {
		Scanner scnr=new Scanner(System.in);
		
		ArrayList<String> options=new ArrayList<String>() {
			{
				add("View PlayList");
				add("Add Song");
				add("Remove Song");
				add("Search Song");
				add("Exit");
			}
		};
		
		ArrayList<String> playList =new ArrayList<String>() {
			{
				add("Song1");
				add("Song2");
				add("Song3");
				add("Song4");
				add("Song5");
			}
		};
		
		while(true) {
			System.out.println("Options:");
			
			for(int i=0;i<options.size();i++) {
				System.out.println("	Option"+i+": "+options.get(i));
			}
			
			System.out.println("Input Desired Option Num: ");
			int selec_opt=scnr.nextInt();
			
			if(selec_opt==4) {
				break;
			}
			
			switch(selec_opt) {
				case 0:
				System.out.println("Current Playlist: ");
				
				for(int i=0;i<playList.size();i++) {
					System.out.println("	"+playList.get(i));
				}
				
			break;
				case 1:
					System.out.println("Enter Song Name: ");
					playList.add(scnr.next());
			break;
				case 2:
					System.out.println("Enter Song Name To Remove: ");
					String rem_name=scnr.next();
					
					if(playList.contains(rem_name)) {
						playList.remove(rem_name);
					}else {
						System.out.println("Song Not Found");
					}
			break;	
				case 3:
					System.out.println("Enter Song Name To Find: ");
					int index=playList.indexOf(scnr.next());
					
					if(index==-1) {
						System.out.println("No Song Found");
					}else {
						System.out.println("Index: "+index);
					}
				
			break;
				default:
					System.out.println("Not Valid Option");
			break;
			}
					
		}
	}

}