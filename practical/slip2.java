import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import java.util.Random;
//import java.util.Arrays;
class slip2 extends JFrame 
{
	JMenuBar menubar;
	JMenu opr,sort;
	JMenuItem load,save,exit,asc,desc;
	
	//JLable l;
	JTextField t1;
	
	int num[]=new int[10];
	
	slip2()
	{
		setLayout(null);
	
		menubar=new JMenuBar();
		menubar.setLayout(500,30);
		menubar.setLocation(0,0);
		add(menubar);
		
		opr=new JMenu("Operation");
		sort=new JMenu("Sort");

		menubar.add(sort);
        menubar.add(opr);

		load=new JMenuItem("Load");
		save=new JMenuItem("Save");
		exit=new JMenuItem("Exit");
		
		opr.add(load);
		opr.add(save);
		opr.addSeparator();
		opr.add(exit);
		
		asc=new JMenuItem("Ascending");
		desc=new JMenuItem("Descending");
		
		sort.add(asc);
		sort.add(desc);
	}
	public static void main(String args[])
	{
		slip2 ob=new slip2();
	}	
}	
