import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class hotel extends JFrame implements ActionListener
{
	JFrame f;
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2;
	hotel()
	{
		f=new JFrame("Demo");
		f.setSize(1000,1000);
		f.setLayout(null);
		l1=new JLabel("Usename-->");
		l2=new JLabel("password-->");
		t1=new JTextField(20);
		t2=new JPasswordField(20);
		b1=new JButton("Login");
		b2=new JButton("Reset"); 
		l1.setBounds(20,20,80,30);
		l2.setBounds(20,60,80,30);
		t1.setBounds(100,20,80,20);
		t2.setBounds(100,60,80,20);
		b1.setBounds(30,120,80,20);
		b2.setBounds(150,120,80,20);
		f.add(l1); f.add(t1);
		f.add(l2); f.add(t2);
		f.add(b1); f.add(b2);
		b1.addActionListener(this); 
		b2.addActionListener(this);
		f.setVisible(true);
	}
public void actionPerformed(ActionEvent obj)
 {
	if(obj.getSource()==b1)
	{
		String u=t1.getText();
		String p=t2.getText();
		if(u.equals("karan") && p.equals("karan21"))
		JOptionPane.showMessageDialog(null,"login sucessfully");
		else
		JOptionPane.showMessageDialog(null,"login uncessfully");
	}
	else if(obj.getSource()==b2)
	{
		t1.setText("");	
		t2.setText("");
	}
	else
	{
	}
 }
 public static void main(String args[])
  {
 	new hotel();
  }
}			
