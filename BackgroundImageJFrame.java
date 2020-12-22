import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class BackgroundImageJFrame extends JFrame 
{
	JButton b1;
	JLabel l1;
	
	public BackgroundImageJFrame()
	{
		//setTitle("background color for JFrame");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("/home/karan/Downloads/index.jpeg")));
		setLayout(new FlowLayout());
		l1=new JLabel("heare is button");
		b1=new JButton("i am button");
		add(l1);
		add(b1);
		setSize(399,399);
		setSize(400,400);
	}
public static void main(String args[])
{
	new BackgroundImageJFrame();
}		
}
