import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
public class pdftoxml extends JFrame 
{
	JFrame f;
	JLabel l1;
	JTextField t1;
	JButton b1;
	
	pdftoxml()
	{
		//ImageIcon ic = new ImageIcon("images (8).jpg");
  		//JLabel image=new JLabel(ic,JLabel.CENTER);
  		//image.setBounds(0,0,1024,768); 
  		
		f=new JFrame("demo");
		f.setSize(400,400);
		f.setLayout(null);
		l1=new JLabel("search");
		t1=new JTextField(40);
		b1=new JButton("import to XML");
		l1.setBounds(20,20,80,30);
		t1.setBounds(100,20,80,30);
		b1.setBounds(20,100,200,40);
		
		f.add(t1);
		f.add(l1);
		f.add(b1);
		//f.add(image);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new pdftoxml();
	}
}	
	
