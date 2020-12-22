import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class login extends JFrame implements ActionListener
{
		JFrame f;
		JLabel l1,l2;
		JTextField t1,t2;
		JButton b1,b2;
		
		login()
		{
			f=new JFrame("demo");
			f.setSize(400,400);
			f.setLayout(null);
			l1=new JLabel("username");
			l2=new JLabel("password");
			t1=new JTextField(40);
			t2=new JTextField(40);
			b1=new JButton("login");
			b2=new JButton("cancel");
			l1.setBounds(20,20,80,30);
			l2.setBounds(20,60,80,30);
			t1.setBounds(100,20,80,30);
			t2.setBounds(100,60,80,30);
			b1.setBounds(20,100,100,40);
			b2.setBounds(150,100,100,40);
			
			f.add(l1);
			f.add(t1);
			f.add(l2);
			f.add(t2);
			f.add(b1);
			f.add(b2);
			f.setVisible(true);
			b1.addActionListener(this);
		} 
	public void actionPerformed(ActionEvent ae)
	{
	
		
			String u=t1.getText();
			String p=t2.getText();
			System.out.println(p);
			System.out.println(u);
			
			if(u.equals("username") && p.equals("password"))
				JOptionPane.showMessageDialog(t1,"login fail");
			else
				JOptionPane.showMessageDialog(t1,"login sucessfully");
		
		
	}
	public static void main(String args[])
	{
		new login();
	}
}			
