import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.*;



public class RockPaperScissors implements ActionListener{
  private static JLabel l1;
  private static JLabel l2;
  private static JLabel l3;
  private static JButton myButton;
  

public RockPaperScissors(){
  
  JPanel panel = new JPanel();
  JFrame frame = new JFrame("Welcome");
  frame.setSize(500,450);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
   frame.add(panel);
  
   panel.setLayout(null);

   myButton = new JButton("Next");
   myButton.setBackground(Color.CYAN);
   myButton.setBounds(100,20,20,40);
   panel.add(myButton);
   myButton.addActionListener(this);
  
  
   l1= new JLabel();
   User user1 = new User();
   l1.setText("Hi "+ user1.getUsername());
   l1.setBounds(10,50,80,25);
   panel.add(l1);

   l2= new JLabel();
   l2.setText("Welcome to Rock, Paper, Scissors!");
   l2.setBounds(10,60,500,40);
   panel.add(l2);
    myButton.setFocusable(false);

   l3= new JLabel();
   l3.setText("You will be playing against a computer. Your options are Rock, Paper or Scissors.");  
   l3.setBounds(10,70,500,40);
   panel.add(l3);
  frame.setVisible(true);
  
  

}


@Override
public void actionPerformed(ActionEvent e){
 JLabel l1= new JLabel();
 //User user1= new User();
 //l1.setText("Hi "+ user1.getUsername());

}
}