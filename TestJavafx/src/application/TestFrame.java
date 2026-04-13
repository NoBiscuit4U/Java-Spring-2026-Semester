package application;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.NumberFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;

public class TestFrame extends JFrame implements ActionListener{
	private JTextArea outputArea;
	private JButton calcButton;
	private JFormattedTextField initSavingsField;
	private JFormattedTextField interestRateField;
	private JFormattedTextField yearsField;
	
	public TestFrame() {
		GridBagConstraints layoutConst=null;
		JScrollPane scrollPane=null;
		JLabel initSavingsLabel=null;
		JLabel interestRateLabel=null;
		JLabel yearsLabel=null;
		JLabel outputLabel=null;
		
		NumberFormat currencyFormat=null;
		NumberFormat percentFormat=null;
		NumberFormat integerFormat=null;
		
		setTitle("Savings Calculator");
		
		initSavingsLabel=new JLabel("Inital Savings:");
		interestRateLabel=new JLabel("Interest rate:");
		yearsLabel=new JLabel("Years:");
		outputLabel=new JLabel("Yearly savings:");
		
		outputArea=new JTextArea(10,15);
		scrollPane=new JScrollPane(outputArea);
		outputArea.setEditable(false);
		
		calcButton=new JButton("Calculate");
		calcButton.addActionListener(this);
		
		currencyFormat=NumberFormat.getCurrencyInstance();
		initSavingsField=new JFormattedTextField(currencyFormat);
		initSavingsField.setEditable(true);
		initSavingsField.setColumns(10);
		initSavingsField.setValue(0);
		
		percentFormat=NumberFormat.getPercentInstance();
		percentFormat.setMinimumFractionDigits(1);
		interestRateField=new JFormattedTextField(percentFormat);
		interestRateField.setEditable(true);
		interestRateField.setColumns(10);
		interestRateField.setValue(0.0);
		
		integerFormat=NumberFormat.getIntegerInstance();
		yearsField=new JFormattedTextField(integerFormat);
		yearsField.setEditable(true);
		yearsField.setValue(0);
		
		setLayout(new GridBagLayout());
		
		layoutConst=new GridBagConstraints();
		layoutConst.insets=new Insets(10,10,5,1);
		layoutConst.anchor=GridBagConstraints.LINE_END;
		layoutConst.gridx=0;
		layoutConst.gridy=0;
		add(initSavingsLabel,layoutConst);
		
		layoutConst=new GridBagConstraints();
		layoutConst.insets=new Insets(10,1,5,10);
		layoutConst.fill=GridBagConstraints.HORIZONTAL;
		layoutConst.gridx=1;
		layoutConst.gridy=0;
		add(initSavingsField,layoutConst);
		
		layoutConst=new GridBagConstraints();
		layoutConst.insets=new Insets(5,10,5,1);
		layoutConst.anchor=GridBagConstraints.LINE_END;
		layoutConst.gridx=0;
		layoutConst.gridy=1;
		add(interestRateLabel,layoutConst);
		
		layoutConst=new GridBagConstraints();
		layoutConst.insets=new Insets(5,1,5,10);
		layoutConst.fill=GridBagConstraints.HORIZONTAL;
		layoutConst.gridx=1;
		layoutConst.gridy=1;
		add(interestRateField,layoutConst);
		
		layoutConst=new GridBagConstraints();
		layoutConst.insets=new Insets(5,10,10,1);
		layoutConst.anchor=GridBagConstraints.LINE_END;
		layoutConst.gridx=0;
		layoutConst.gridy=2;
		add(yearsLabel,layoutConst);
		
		layoutConst=new GridBagConstraints();
		layoutConst.insets=new Insets(5,1,10,10);
		layoutConst.fill=GridBagConstraints.HORIZONTAL;
		layoutConst.gridx=1;
		layoutConst.gridy=2;
		add(yearsField,layoutConst);
		
		layoutConst=new GridBagConstraints();
		layoutConst.insets=new Insets(0,5,0,10);
		layoutConst.fill=GridBagConstraints.BOTH;
		layoutConst.gridx=2;
		layoutConst.gridy=1;
		add(calcButton,layoutConst);
		
		layoutConst=new GridBagConstraints();
		layoutConst.insets=new Insets(10,10,1,10);
		layoutConst.fill=GridBagConstraints.HORIZONTAL;
		layoutConst.gridx=0;
		layoutConst.gridy=3;
		add(outputLabel,layoutConst);
		
		layoutConst=new GridBagConstraints();
		layoutConst.insets=new Insets(1,10,10,10);
		layoutConst.fill=GridBagConstraints.HORIZONTAL;
		layoutConst.gridx=0;
		layoutConst.gridy=4;
		layoutConst.gridwidth=3;
		add(scrollPane,layoutConst);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		int i;
		double savingDollars;
		double interestRate;
		int numYears;
		
		savingDollars=((Number) initSavingsField.getValue()).intValue();
		interestRate=((Number) interestRateField.getValue()).doubleValue();
		numYears=((Number) yearsField.getValue()).intValue();
		
		outputArea.setText("");
		
		i=1;
		while(i<=numYears) {
			outputArea.append("Savings in year "+i+": $"+savingDollars + "\n");
			savingDollars=savingDollars+(savingDollars*interestRate);
			
			i=i+1;
		}
	}
}
