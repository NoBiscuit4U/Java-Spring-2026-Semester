package application;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class PaymentFrame extends JFrame implements ActionListener{
	private JTextField paymentField;
	private JLabel paymentLabel;
	
	private JTextField deadlineField;
	private JLabel deadlineLabel;
	
	private JButton submit;
	
	public PaymentFrame() {
		GridBagLayout grid=new GridBagLayout();
		GridBagConstraints gridcons=null;
		
		this.setTitle("Payment");
		this.setLayout(grid);
		
		paymentField=new JTextField(15);
		paymentField.setEditable(true);
		
		paymentLabel=new JLabel("Enter the fee to be paid:");
		
		deadlineField=new JTextField(15);
		deadlineField.setEditable(true);
		
		deadlineLabel=new JLabel("Paying before deadline? Enter Yes or No:");
		
		submit=new JButton();
		submit.setText("Submit");
		submit.setSize(new Dimension(10,10));
		submit.addActionListener(this);
		
		gridcons=new GridBagConstraints();
		gridcons.gridx=0;
		gridcons.gridy=0;
		gridcons.insets=new Insets(10,10,10,0);
		
		this.add(paymentLabel, gridcons);
		
		gridcons=new GridBagConstraints();
		gridcons.gridx=1;
		gridcons.gridy=0;
		gridcons.insets=new Insets(10,0,10,10);
		
		this.add(paymentField, gridcons);
		
		gridcons=new GridBagConstraints();
		gridcons.gridx=0;
		gridcons.gridy=1;
		gridcons.insets=new Insets(10,10,10,0);
		
		this.add(deadlineLabel, gridcons);
		
		gridcons=new GridBagConstraints();
		gridcons.gridx=1;
		gridcons.gridy=1;
		gridcons.insets=new Insets(10,0,10,10);
		
		this.add(deadlineField, gridcons);
		
		gridcons=new GridBagConstraints();
		gridcons.gridx=1;
		gridcons.gridy=2;
		gridcons.insets=new Insets(10,10,10,10);
		
		this.add(submit, gridcons);
	
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(this.paymentField.getText()!="" && this.deadlineField.getText()!="") {
			boolean afterdeadline=this.deadlineField.getText().equals("Yes")?true:false;
			
			if(!afterdeadline) {
				JOptionPane.showMessageDialog(this,"Please pay additional $10");
			}else {
				JOptionPane.showMessageDialog(this,"Payment Complete");
			}
		}
	}

}
