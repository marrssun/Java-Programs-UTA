import javax.swing.*; //always starts wth j 
import java.awt.*; //abstract window toolkit , * u bringing in the classes you need 
import java.awt.event.*;
import java.util.*;

public class CourseGUI extends JFrame
{
	private JLabel nameLabel;
	private JLabel courseLabel;
	private JLabel instructorLabel;
	private JLabel courseTypeLabel;
	private JLabel startLabel;
	private JLabel endLabel;
	private JLabel submitLabel;


	private JButton submitButton;

	private JTextField nameField;
	private JTextField courseField;
	private JTextField instructorField;
	private JTextField courseTypeField;
	private JTextField startField;
	private JTextField endField;

	private JComboBox<String> courseTypeBox;
	private String[] courseTypeOptions = {"select one", "INSY", "OPMA","FINA"};

	

	public CourseGUI()
	{
		super("Course Panel");
		this.setLayout(new GridLayout(7,2));

		nameLabel = new JLabel("Enter Customer Name");
		courseLabel = new JLabel("Select Course");
		instructorLabel = new JLabel("Enter Instructor");
		courseTypeLabel = new JLabel("Enter CourseType");
		startLabel = new JLabel("Start Date");
		endLabel = new JLabel("End Date");
		submitLabel = new JLabel("Add New Course");

		nameField = new JTextField(20);
		instructorField = new JTextField(20);
		courseTypeField = new JTextField(20);
		startField = new JTextField(20);
		endField = new JTextField(20);

		submitButton = new JButton("Submit");

		courseTypeBox = new JComboBox<>(courseTypeOptions);
	

		this.add(nameLabel);
		this.add(nameField);

		this.add(courseLabel);
		this.add(courseTypeBox);

		this.add(instructorLabel);
		this.add(instructorField);

		this.add(courseTypeLabel);
		this.add(courseTypeField);

		this.add(startLabel);
		this.add(startField);

		this.add(endLabel);
		this.add(endField);

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