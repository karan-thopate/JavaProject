import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Image extends JFrame
{
  ImageIcon ic = new   ImageIcon("/home/karan/Downloads/index.jpeg");
  JDesktopPane dp = new JDesktopPane();
  JLabel lbl = new JLabel(ic);
  JPanel transparentPanel = new JPanel();
   
  public Image()
   {
     
      lbl.setBounds(0,0,100,100); 
    
       
      transparentPanel.setOpaque(false);
      transparentPanel.setBounds(0,0,100,100);
       
      JButton jb = new JButton("Button");
      transparentPanel.add(jb); 
        
      dp.add(lbl,new Integer(50));
      dp.add(transparentPanel,new Integer(350));
     
      setLayeredPane(dp);
       
   }
   public static void main(String a[])
   {
       Image fr = new Image();
       fr.setSize(200,200); 
       fr.setVisible(true); 
   }
     
}
