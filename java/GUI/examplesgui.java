Example 1: Image Button

import javax.swing.*;
public class Button Example{
ButtonExample()
{
	JFrame f=new JFrame("Button Example");
	JButton b=new JButton(new ImageIcon("D:\\icon.png"));
	b.setBounds(100,100,100,40);
	f.add(b);
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);
	f.setDefaultCloaseOperation(JFrame.EXIT_ON_CLOSE);
  }
public static void main(Strings[] args){
  new ButtonExample();}
}

Example 2:Label Action

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabelExample extends Frame implements ActionListener{
	JTextField tf;
	JLabel l;
	JButton b;
	LabelExample(){
		tf=new JTextField();
		tf.setBounds(50,50,150,30);
		l=new JLabel();
		l.setBounds(50,100,250,20);
		b=new JButton("Find IP");
		b.setBounds(50,150,95,30);
		b.addActionListener(this);
		add(b);
		add(tf);
		add(l);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
}


Example 3:

/*

	Finally block:
	- finally is the block that is always executed whether exception is handled or not
	

*/
/*
// Example: finally block

try{
	//risky code
}
catch(Exception e){
	//handling code
	
}
finally{
	//cleanup code	
}

//OR

try{
}
finally{
}

// 1. If exception occurs in try, it will go to catch afterwhich finally gets executed
// 2. If excepton does not occur after try block, the catch block does not get executed but
//	  the finally block stll gets executed	

*/


// Example:

class Finalmente{

	public static void main(String[] args){
		
		
		try{
			
			int a = 100, b = 0, c;
			c = a/b;
			System.out.println(c);
			// System.exit(0); // Stops executing the JVM
			
		}
		/*catch(Exception e){
			
			System.out.println("Catch");
			
		}
		finally{
			
			System.out.println("I am in finally block");
		
		}*/
		
	}
}	

/* We can use multiple catch blocks with one try block but we can only use a single finally block with one try block (not multiple).
   The statements present in the finally block execute even if the try block contains control statements like 'return', 'jump', 'continue' or 'break'.
   When no catch block is written, there will be an abormal termination if there is an exception and the code following the finally block will not be executed.
   Try --> Catch [valid]
   Try --> Catch --> Finally [valid]
   Try --> Finally [valid]
   Try --> Finally --> Catch [invalid]
   
   try{
	   stat1;
	   stat2;
	   stat3;
   }
   catch(Exception e){
	   stat4;
   }
   finally{
	   stat5;
   }
   stat6;
   
   case 1: if there is no excepion, then 1,2,3,4,5,6 and normal termination
   case 2: If there is an exception at stat2 and the corresponding catch block found 1,4,5,6 and normal termination
   case 3: If an exception at stat2 and the corresponding catch block (not matched) and abnormal termination
   
   
   control flow in the nested try,catch,finally blocks

   try{
	   stat1;
	   stat2;
	   stat3;
	   
	   try{
		   stat4;
		   stat5;
	       stat6;
	   }
	   catch(Exception e){
		   stat7;
	   }
	   finally{
		   stat8;
	   }

	   stat9;
   }
   catch(Exception e){
	   stat10;
   }
   finally{
	   stat11;
   }
   stat12;
*/

Example 4: Label Action

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabelExample extends Frame implements ActionListener{
	JTextField tf;
	JLabel l;
	JButton b;
	LabelExample(){
		tf=new JTextField();
		tf.setBounds(50,50,150,30);
		l=new JLabel();
		l.setBounds(50,100,250,20);
		b=new JButton("Find IP");
		b.setBounds(50,150,95,30);
		b.addActionListener(this);
		add(b);
		add(tf);
		add(l);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
}