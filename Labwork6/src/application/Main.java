package application;
	
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main{
	
	public static void main(String[] args) {
		PaymentFrame frame=new PaymentFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.pack();
		
		frame.setVisible(true);
	}
}
