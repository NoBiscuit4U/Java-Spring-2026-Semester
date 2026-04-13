package application;
	
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Main{
	
	public static void main(String[] args) {
		JFrame topFrame=new JFrame("Salary");
		
		TestFrame n_frame=new TestFrame();
		
		n_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		n_frame.pack();
		n_frame.setVisible(true);
		
	}
}
