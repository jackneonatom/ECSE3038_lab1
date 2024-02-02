package GUI;
import javax.swing.*;
import java.awt.*;
///

public class Main{
    public static void main(String[] args) {
        JFrame frame=new JFrame("GUI");
        frame.setPreferredSize(new Dimension(1200,200));
        JLabel label=new JLabel ("First GUI NIgger NIgger 123");
        frame.getContentPane().add(label);
        frame.getContentPane().setBackground(Color.GREEN); 
        frame.getContentPane().setLayout(new FlowLayout ());
        frame.pack();
        frame.setVisible(true);
    }
}