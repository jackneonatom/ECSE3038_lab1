package GUI;

import javax.swing.*;
public class ButtonExample{
ButtonExample()
{
	JFrame f=new JFrame("Button Example");
	JButton b=new JButton(new ImageIcon("D:\\icon.png"));
	b.setBounds(100,100,100,40);
	f.add(b);
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
public static <Strings> void main(Strings[] args){
  new ButtonExample();}
}


