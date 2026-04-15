package application;

import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;

public class BirthdayChooserFrame extends JFrame implements ActionListener,ChangeListener{
	private JTextField dayField;
	private JTextField monthField;
	private JTextField yearField;
	private JTextField birthdayField;
	
	private JLabel dayLabel;
	private JLabel monthLabel;
	private JLabel yearLabel;
	private JLabel birthdayLabel;
	
	private JButton submitButton;
	
	private JSlider daySlider;
	private JSlider monthSlider;
	private JSlider yearSlider;
	
	BirthdayChooserFrame(){
		int daymin=1;
		int daymax=31;
		
		int monthmin=1;
		int monthmax=12;
		
		int yearmin=1950;
		int yearmax=2026;
		
		GridBagConstraints layoutConst = null;
		// Set frame's title
		setTitle("Birthday Chooser");
		
		dayField=new JTextField();
		monthField=new JTextField();
		yearField=new JTextField();
		
		dayLabel = new JLabel("Enter Day:");
		monthLabel = new JLabel("Enter Month:");
		yearLabel = new JLabel("Enter Year:");
		birthdayLabel = new JLabel("Birthday:");
		birthdayField = new JTextField(10);
		birthdayField.setEditable(false);
		submitButton = new JButton("Submit");
		submitButton.addActionListener(this);
		
		daySlider = new JSlider(daymin,daymax,daymin);
		daySlider.addChangeListener(this);
		daySlider.setMajorTickSpacing(10);
		daySlider.setMinorTickSpacing(1);
		daySlider.setPaintTicks(true);
		dayField = new JTextField(10);
		dayField.setEditable(false);
		dayField.setText("5");
		
		monthSlider = new JSlider(monthmin,monthmax,monthmin);
		monthSlider.addChangeListener(this);
		monthSlider.setMajorTickSpacing(10);
		monthSlider.setMinorTickSpacing(1);
		monthSlider.setPaintTicks(true);
		monthField = new JTextField(10);
		monthField.setEditable(false);
		monthField.setText("5");
		
		yearSlider = new JSlider(yearmin,yearmax,yearmax);
		yearSlider.addChangeListener(this);
		yearSlider.setMajorTickSpacing(10);
		yearSlider.setMinorTickSpacing(1);
		yearSlider.setPaintTicks(true);
		yearField = new JTextField(10);
		yearField.setEditable(false);
		yearField.setText("5");
		// Create frame and add components using GridBagLayout
		setLayout(new GridBagLayout());
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(10, 10, 1, 1);
		layoutConst.anchor = GridBagConstraints.LINE_START;
		layoutConst.gridx = 0;
		layoutConst.gridy = 0;
		layoutConst.gridwidth = 1;
		add(dayLabel, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(10, 10, 1, 1);
		layoutConst.anchor = GridBagConstraints.LINE_START;
		layoutConst.gridx = 2;
		layoutConst.gridy = 0;
		layoutConst.gridwidth = 1;
		add(monthLabel, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(10, 10, 1, 1);
		layoutConst.anchor = GridBagConstraints.LINE_START;
		layoutConst.gridx = 4;
		layoutConst.gridy = 0;
		layoutConst.gridwidth = 1;
		add(yearLabel, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(10, 1, 1, 10);
		layoutConst.fill = GridBagConstraints.HORIZONTAL;
		layoutConst.gridx = 1;
		layoutConst.gridy = 0;
		layoutConst.gridwidth = 1;
		add(dayField, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(10, 10, 1, 10);
		layoutConst.fill = GridBagConstraints.HORIZONTAL;
		layoutConst.gridx = 3;
		layoutConst.gridy = 0;
		layoutConst.gridwidth = 1;
		add(monthField, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(10, 10, 1, 10);
		layoutConst.fill = GridBagConstraints.HORIZONTAL;
		layoutConst.gridx = 5;
		layoutConst.gridy = 0;
		layoutConst.gridwidth = 1;
		add(yearField, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(1, 10, 10, 10);
		layoutConst.fill = GridBagConstraints.HORIZONTAL;
		layoutConst.gridx = 0;
		layoutConst.gridy = 1;
		layoutConst.gridwidth = 2;
		add(daySlider, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(1, 10, 10, 10);
		layoutConst.fill = GridBagConstraints.HORIZONTAL;
		layoutConst.gridx = 2;
		layoutConst.gridy = 1;
		layoutConst.gridwidth = 2;
		add(monthSlider, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(1, 10, 10, 10);
		layoutConst.fill = GridBagConstraints.HORIZONTAL;
		layoutConst.gridx = 4;
		layoutConst.gridy = 1;
		layoutConst.gridwidth = 2;
		add(yearSlider, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(10, 10, 10, 5);
		layoutConst.anchor = GridBagConstraints.LINE_END;
		layoutConst.gridx = 0;
		layoutConst.gridy = 2;
		layoutConst.gridwidth = 1;
		add(submitButton, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(10, 10, 10, 1);
		layoutConst.anchor = GridBagConstraints.LINE_END;
		layoutConst.gridx = 2;
		layoutConst.gridy = 2;
		layoutConst.gridwidth = 1;
		add(birthdayLabel, layoutConst);
		
		layoutConst = new GridBagConstraints();
		layoutConst.insets = new Insets(10, 1, 10, 10);
		layoutConst.fill = GridBagConstraints.HORIZONTAL;
		layoutConst.gridx = 3;
		layoutConst.gridy = 2;
		layoutConst.gridwidth = 2;
		add(birthdayField, layoutConst);
	}
	

	@Override
	public void stateChanged(ChangeEvent event) {
		int sliderVal; // Slider value 
		String strSliderVal; // Slider value (string)
		// Get source of event (2 sliders in GUI)
		JSlider sourceEvent = (JSlider) event.getSource();
		if (sourceEvent == daySlider) {
			sliderVal = daySlider.getValue(); // Get slider value
			strSliderVal = Integer.toString(sliderVal);
			dayField.setText(strSliderVal); // Update display
		}else if (sourceEvent == monthSlider) {
			sliderVal = monthSlider.getValue();
			strSliderVal = Integer.toString(sliderVal);
			monthField.setText(strSliderVal);
		}else if (sourceEvent == yearSlider) {
			sliderVal = yearSlider.getValue();
			strSliderVal = Integer.toString(sliderVal);
			yearField.setText(strSliderVal);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		birthdayField.setText(Integer.parseInt(dayField.getText())+"/"+Integer.parseInt(monthField.getText())+"/"+Integer.parseInt(yearField.getText())); 
	}

}
