import javax.swing.JFrame; 
public class CustomerGUITest
{
	public static void main(String args[])
	{
		CustomerGUI sg1 = new CustomerGUI();
		sg1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sg1.setSize(750,200);
		sg1.setLocationRelativeTo(null);
		sg1.setVisible(true);
	}
}