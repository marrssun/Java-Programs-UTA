import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.io.File;
public class MenuTest extends JFrame
{
	private JDesktopPane theDesktop;

	public MenuTest()
	{
		super("Menus");
		theDesktop = new JDesktopPane();

		JMenuBar bar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu exitMenu = new JMenu("Exit");

		JMenuItem aboutItem = new JMenuItem("About");
		JMenuItem exitItem = new JMenuItem("Exit");
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem saveItem = new JMenuItem("Save");

		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		exitMenu.add(aboutItem);
		exitMenu.add(exitItem);

		openItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				readFile();
			}
		});

		exitItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				System.exit(0);
			}
		});

		
		aboutItem.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				JInternalFrame frame = new JInternalFrame("About data",
				true, true, true, true);

				OpenPanel op = new OpenPanel();
				frame.add(op);
				frame.pack();
				theDesktop.add(frame);
				frame.setVisible(true);
			}
		});
			


		bar.add(fileMenu);
		bar.add(exitMenu);

		setJMenuBar(bar);
		add(theDesktop);


	}

	public static void main(String args[])
	{
		MenuTest mt = new MenuTest();
		mt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mt.setLocationRelativeTo(null);
		mt.setSize(400,400);
		mt.setVisible(true);
	}



	public void readFile()
	{


		JFileChooser filechooser = new JFileChooser();
		filechooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int result = filechooser.showOpenDialog(this);

		if (result == JFileChooser.CANCEL_OPTION)
			System.exit(0);
		File fileName = filechooser.getSelectedFile();

		try
		{
			Scanner input = new Scanner();
			while(input.hasNext())
			{
				System.out.println(input.nextLine());
		
			}
		}

		catch(IOException ioe)
			{
				ioe.printStackTrace();
			}
	

	}


class OpenPanel extends JPanel
{
	private JLabel nameLabel;
	private JTextField nameField;
	private JLabel submitLabel;
	private JButton submitButton;

	public OpenPanel()
	{
		setLayout(new GridLayout(2,2));
		nameLabel = new JLabel("Enter name");
		nameField = new JTextField(20);
		submitLabel = new JLabel("Click to Print");
		submitButton = new JButton("SUBMIT");

		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				System.out.println(nameField.getText());
				nameField.setText("");
				nameField.requestFocus();
			}
		});


		add(nameLabel);
		add(nameField);
		add(submitLabel);
		add(submitButton);
	}



}

}