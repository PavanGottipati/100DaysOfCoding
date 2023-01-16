//Java program to create one simple form using Swings
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.*;
class Formj
{
    public static void main(String [] args)
    {
        JFrame j=new JFrame("Login Form");
        j.setVisible(true);
        j.setSize(800,400);
        j.setLayout(new FlowLayout());
        JLabel l1=new JLabel("Username :");
        j.add(l1);
        JTextField t1=new JTextField(20);
        j.add(t1);
        JLabel l2=new JLabel("Password :");
        j.add(l2);
        JTextField t2=new JTextField(20);
        j.add(t2);
        JButton b=new JButton("submit");
        j.add(b);
        j.getContentPane().setBackground(Color.PINK);
    }
}
