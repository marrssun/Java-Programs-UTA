// Marisol Miramontes 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import javax.swing.JFrame; 
import java.awt.Color;


public class Menu extends JFrame
{
	private JDesktopPane theDesktop;

	public Menu()
	{
		super("Main Menu");
		theDesktop = new JDesktopPane();

		JMenuBar bar = new JMenuBar();
		JMenu addMenu = new JMenu("Add");
		JMenu ioMenu = new JMenu("Input/Output");
		JMenu exitMenu = new JMenu("Exit");

		JMenuItem readCustItem = new JMenuItem("Read Customers");
		JMenuItem readCoursesItem = new JMenuItem("Read Courses");
		JMenuItem commitDatabaseItem = new JMenuItem("Commit to Database");
		JMenuItem createInvoiceItem = new JMenuItem("Create Invoices");
		JMenuItem writeDatabaseTablesItem = new JMenuItem("Write Database Tables");
		JMenuItem exitItem = new JMenuItem("Exit Program");
		JMenuItem newCustItem = new JMenuItem("Add New Customer");
		JMenuItem newCourseItem = new JMenuItem("Add New Course");


		addMenu.add(newCustItem);
		addMenu.add(newCourseItem);
		ioMenu.add(readCustItem);
		ioMenu.add(readCoursesItem);
		ioMenu.add(commitDatabaseItem);
		exitMenu.add(createInvoiceItem);
		exitMenu.add(writeDatabaseTablesItem);
		exitMenu.add(exitItem);

        // reads customers
        readCustItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                
            }
        });

        // reads courses
        readCoursesItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {

            }
        });

        // commits to database 
        commitDatabaseItem.addActionListener(new ActionListener()
        {   
            @Override
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });

        // creates invoice 
        createInvoiceItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                
            }
        });

        // writes database tables 
        writeDatabaseTablesItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                System.exit(0);
            }
        });

	    //open new customer 
		newCustItem.addActionListener(new ActionListener()
	    {
	      @Override
	      public void actionPerformed(ActionEvent e)
	      {
	        JInternalFrame customerFrame = new JInternalFrame(
	                "Add New Customer",
	                false,
	                true,
	                false,
	                true);

	        CustomerPanel customerPanel = new CustomerPanel();
	        customerFrame.add(customerPanel);
	        customerFrame.pack();
	        theDesktop.add(customerFrame);
	        customerFrame.setVisible(true);
	      }
	    });

	    //open new course 
		newCourseItem.addActionListener(new ActionListener()
	    {
	      @Override
	      public void actionPerformed(ActionEvent e)
	      {
	        JInternalFrame courseFrame = new JInternalFrame(
	        	"Add New Course",
	            false,
	            true,
	            false,
	            true);

	        CoursePanel coursePanel = new CoursePanel();
	        courseFrame.add(coursePanel);
	        courseFrame.pack();
	        theDesktop.add(courseFrame);
	        courseFrame.setVisible(true);
	      }
	    });

        //exit program
        exitItem.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                System.exit(0);
            }
        });

        bar.add(addMenu);
		bar.add(ioMenu);
		bar.add(exitMenu);

		setJMenuBar(bar);
		add(theDesktop);
	}

	public static void main(String args[])
	{
		Menu tm = new Menu();
		tm.setSize(400,400);
		tm.setLocationRelativeTo(null);
		tm.setVisible(true);
		tm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

public class CustomerPanel extends JPanel
{
	//Labels for textbox
	private JLabel nameLabel;
	private JLabel acctLabel;
	private JLabel streetLabel;
	private JLabel cityLabel; 
	private JLabel stateLabel;
	private JLabel zipLabel;
	private JLabel customerLabel;
	private JLabel submitLabel;


	//Field for textbox
	private JTextField nameField;
    private JTextField acctField;
    private JTextField streetField;
    private JTextField cityField;
    private JTextField stateField;
    private JTextField zipField;

    private JPanel customerPanel;

    //buttons for customer type 
    private JRadioButton studentButton;
    private JRadioButton facultyButton;
    private JRadioButton governmentButton;

    private ButtonGroup radioGroup;
  
    //sumbit button 
  	private JButton submitButton;

  	public CustomerPanel()
    {
       
        setLayout(new GridLayout(8, 2));

        //text box
        nameLabel = new JLabel("Enter name");
        acctLabel = new JLabel("Enter Account Number");
        streetLabel = new JLabel("Enter Street");
        cityLabel = new JLabel("Enter City");
        stateLabel = new JLabel("Enter State");
        zipLabel = new JLabel("Enter Zip");
        customerLabel = new JLabel("Select Customer Type");
        submitLabel = new JLabel("Add New Customer");

        //textfield
        nameField = new JTextField(20);
        acctField = new JTextField(20);
        streetField = new JTextField(20);
        cityField = new JTextField(20);
        stateField = new JTextField(20);
        zipField = new JTextField(20);


        
        //submit button 
        submitButton = new JButton("SUBMIT");

        //customer buttons
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


        add(nameLabel);
        add(nameField);
        add(acctLabel);
        add(acctField);
        add(streetLabel);
        add(streetField);
        add(cityLabel);
        add(cityField);
        add(stateLabel);
        add(stateField);
        add(zipLabel);
        add(zipField);
        add(customerLabel);
        add(customerPanel);
		add(submitLabel);
		add(submitButton);

	}

	class Handler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == submitButton)
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

public class CoursePanel extends JPanel
{
	private JComboBox<String> courseComboBox;
    //Labels for textbox
	private JLabel nameLabel;
	private JLabel courseLabel;
	private JLabel instructorLabel;
	private JLabel courseTypeLabel; 
	private JLabel startDLabel;
	private JLabel endDLabel;
	private JLabel submitLabel;


	//Field for textbox
	private JTextField nameField;
    private JTextField instructorField;
    private JTextField courseTypeField;
    private JTextField courseField;
    private JTextField startDField;
    private JTextField endDField;
    
    private JComboBox<String> majorBox;
    private String[] courseOptions = {"Select One", "INSY", "OPMA", "FINA"};
   
  
    //sumbit button 
  	private JButton submitButton;

  	public CoursePanel()
    {
 
        setLayout(new GridLayout(7, 2));

        //text box
        nameLabel = new JLabel("Enter Customer Name");
        courseLabel = new JLabel("Select Course");
        instructorLabel = new JLabel("Enter Instructor");
        courseTypeLabel = new JLabel("Enter Course Type");
        startDLabel = new JLabel("Start Date");
        endDLabel = new JLabel("End Date");
        submitLabel = new JLabel("Add New Course");

        //textfield
        nameField = new JTextField(20);
        instructorField = new JTextField(20);
        courseTypeField = new JTextField(20);
        startDField = new JTextField(20);
        endDField = new JTextField(20);
        
        //submit button 
        submitButton = new JButton("SUBMIT");


        majorBox = new JComboBox<>(courseOptions);

        add(nameLabel);
        add(nameField);
        add(courseLabel);
        add(majorBox);
        add(instructorLabel);
        add(instructorField);
        add(courseTypeLabel);
        add(courseTypeField);
        add(startDLabel);
        add(startDField);
        add(endDLabel);
        add(endDField);
		add(submitLabel);
		add(submitButton);

	}

	class Handler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource() == submitButton)
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
}
