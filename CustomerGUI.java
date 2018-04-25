import javax.swing.*;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
import java.awt.*;  
import java.awt.event.*;
import java.util.*;

// the JFrame is the entire 

public class CustomerGUI extends JFrame
{
	private JLabel nameLabel;
	private JLabel acctLabel;
	private JLabel streetLabel;
	private JLabel cityLabel;
	private JLabel stateLabel;
	private JLabel zipLabel;
	private JLabel customerLabel;
	private JLabel submitLabel;

	private JButton submitButton;

	private JTextField nameField;
	private JTextField acctField;
	private JTextField streetField;
	private JTextField cityField;
	private JTextField stateField;
	private JTextField zipField;

	private JPanel customerPanel;


	private JRadioButton studentButton;
	private JRadioButton facultyButton;
	private JRadioButton governmentButton;

	private ButtonGroup radioGroup;

	public CustomerGUI()
	{
		super("Customer Panel");
		this.setLayout(new GridLayout(8,2));

		nameLabel = new JLabel("Enter Name");
		acctLabel = new JLabel("Enter Account Number");
		streetLabel = new JLabel("Enter Street");
		cityLabel = new JLabel("Enter City");
		stateLabel = new JLabel("Enter State");
		zipLabel = new JLabel("Enter Zip");
		customerLabel = new JLabel("Select Customer Type");
		submitLabel = new JLabel("Add New Customer");

		nameField = new JTextField(20);
		acctField = new JTextField(20);
		streetField = new JTextField(20);
		cityField = new JTextField(20);
		stateField = new JTextField(20);
		zipField = new JTextField(20);

		submitButton = new JButton("Submit");

		studentButton = new JRadioButton("Student");
		facultyButton = new JRadioButton("Faculty");
		governmentButton = new JRadioButton("Government");

		radioGroup = new ButtonGroup();
		radioGroup.add(studentButton);
		radioGroup.add(facultyButton);
		radioGroup.add(governmentButton);

		customerPanel = new JPanel();
		customerPanel.setLayout(new GridLayout(1,3));

		customerPanel.add(studentButton);
		customerPanel.add(facultyButton);
		customerPanel.add(governmentButton);

	

		this.add(nameLabel);
		this.add(nameField);

		this.add(acctLabel);
		this.add(acctField);

		this.add(streetLabel);
		this.add(streetField);

		this.add(cityLabel);
		this.add(cityField);

		this.add(stateLabel);
		this.add(stateField);

		this.add(zipLabel);
		this.add(zipField);

		this.add(customerLabel);
		this.add(customerPanel);

		this.add(submitLabel);
        this.add(submitButton);

	}
	class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource()== submitButton)
			{
				System.out.println("Button");
			}
			else
			{
				System.exit(0);
			}
		}
	}

}