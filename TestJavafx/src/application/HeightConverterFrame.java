package application;

import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;

public class HeightConverterFrame extends JFrame implements ActionListener,ChangeListener{
	private JTextField heightCmField;
	private JTextField heightFtField;
	private JTextField heightInField;
	
	private JLabel ftLabel;
	private JLabel inLabel;
	private JLabel cmLabel;
	
	private JButton convertButton;
	
	private JSlider heightFtSlider;
	private JSlider heightInSlider;
	
	final static double CM_PER_IN=2.54;
	final static int IN_PER_FT=12;
	
	HeightConverterFrame(){
		int feetMin = 0; // Feet slider min value
		int feetMax = 10; // Feet slider max value
		int feetInit = 5; // Feet slider initial value
		int inchesMin = 0; // Inches slider min value
		int inchesMax = 11; // Inches slider max value
		int inchesInit = 8; // Inches slider initial value
		GridBagConstraints layoutConst = null; // GUI component layout
		// Set frame's title
		setTitle("Height converter");
		
		ftLabel = new JLabel("Enter feet:");
		inLabel = new JLabel("Enter inches:");
		cmLabel = new JLabel("Centimeters:");
		heightCmField = new JTextField(10);
		heightCmField.setEditable(false);
		convertButton = new JButton("Convert");
		convertButton.addActionListener(this);
		
		heightFtSlider = new JSlider(feetMin, feetMax, feetInit);
		heightFtSlider.addChangeListener(this); // Use HeightConverter's stateChanged()
		heightFtSlider.setMajorTickSpacing(10);
		heightFtSlider.setMinorTickSpacing(1);
		heightFtSlider.setPaintTicks(true);
		heightFtSlider.setPaintLabels(true);
		heightFtField = new JTextField(10);
		heightFtField.setEditable(false);
		heightFtField.setText("5");
		
		heightInSlider = new JSlider(inchesMin, inchesMax, inchesInit);
		heightInSlider.addChangeListener(this); // Use HeightConverter's stateChanged()
		heightInSlider.setMajorTickSpacing(10);
		heightInSlider.setMinorTickSpacing(1);
		heightInSlider.setPaintTicks(true);
		heightInSlider.setPaintLabels(true);
		heightInField = new JTextField(10);
		heightInField.setEditable(false);
		heightInField.setText("8");
		// Create frame and add components using GridBagLayout
		setLayout(new GridBagLayout());
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(10, 10, 1, 1);
		layoutConst.anchor = GridBagConstraints.LINE_START;
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;
		layoutConst.gridwidth = 1;
		add(ftLabel, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(10, 10, 1, 1);
		layoutConst.anchor = GridBagConstraints.LINE_START;
		layoutConst.gridx = 2;
		layoutConst.gridy = 0;
		layoutConst.gridwidth = 1;
		add(inLabel, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(10, 1, 1, 10);
		layoutConst.fill = GridBagConstraints.HORIZONTAL;
		layoutConst.gridx = 1;
		layoutConst.gridy = 0;
		layoutConst.gridwidth = 1;
		add(heightFtField, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(10, 10, 1, 10);
		layoutConst.fill = GridBagConstraints.HORIZONTAL;
		layoutConst.gridx = 3;
		layoutConst.gridy = 0;
		layoutConst.gridwidth = 1;
		add(heightInField, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(1, 10, 10, 10);
		layoutConst.fill = GridBagConstraints.HORIZONTAL;
		layoutConst.gridx = 0;
		layoutConst.gridy = 1;
		layoutConst.gridwidth = 2;
		add(heightFtSlider, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(1, 10, 10, 10);
		layoutConst.fill = GridBagConstraints.HORIZONTAL;
		layoutConst.gridx = 2;
		layoutConst.gridy = 1;
		layoutConst.gridwidth = 2;
		add(heightInSlider, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(10, 10, 10, 5);
		layoutConst.anchor = GridBagConstraints.LINE_END;
		layoutConst.gridx = 0;
		layoutConst.gridy = 2;
		layoutConst.gridwidth = 1;
		add(convertButton, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(10, 10, 10, 1);
		layoutConst.anchor = GridBagConstraints.LINE_END;
		layoutConst.gridx = 1;
		layoutConst.gridy = 2;
		layoutConst.gridwidth = 1;
		add(cmLabel, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(10, 1, 10, 10);
		layoutConst.fill = GridBagConstraints.HORIZONTAL;
		layoutConst.gridx = 2;
		layoutConst.gridy = 2;
		layoutConst.gridwidth = 2;
		add(heightCmField, layoutConst);
	}
	
	public static double HeightFtInToCm(int ft, int in) {
		int totIn; // Total inches input by user
		double cmHeight; // Corresponding height in cm
		totIn = (ft * IN_PER_FT) + in; // Total inches
		cmHeight = totIn * CM_PER_IN; // Convert to cm
		return cmHeight;
	}
	
	@Override
	public void stateChanged(ChangeEvent event) {
		int sliderVal; // Slider value (int)
		String strSliderVal; // Slider value (string)
		// Get source of event (2 sliders in GUI)
		JSlider sourceEvent = (JSlider) event.getSource();
		if (sourceEvent == heightFtSlider) {
			sliderVal = heightFtSlider.getValue(); // Get slider value
			strSliderVal = Integer.toString(sliderVal);
			heightFtField.setText(strSliderVal); // Update display
		}else if (sourceEvent == heightInSlider) {
			sliderVal = heightInSlider.getValue();
			strSliderVal = Integer.toString(sliderVal);
			heightInField.setText(strSliderVal);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		int ftVal; // User defined height in feet
		int inVal; // User defined height in inches
		double cmVal; 
		ftVal = heightFtSlider.getValue(); 
		inVal = heightInSlider.getValue(); // Get in slider value
		cmVal = HeightFtInToCm(ftVal, inVal); 
		heightCmField.setText(Double.toString(cmVal)); 
	}

}
