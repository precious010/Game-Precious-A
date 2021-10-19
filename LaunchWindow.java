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



public class LaunchWindow implements ActionListener{
  private static JLabel l1;
  private static JLabel l2;
  private static JButton myButton;
  

public LaunchWindow(){
  
  JPanel panel = new JPanel();
  JFrame frame = new JFrame("Welcome");
  frame.setSize(350,250);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
   frame.add(panel);
  
   panel.setLayout(null);

   myButton = new JButton("Next");
   myButton.setBackground(Color.CYAN);
   myButton.setBounds(100,160,200,40);
   panel.add(myButton);
   myButton.addActionListener(this);
  
  
   l1= new JLabel();
   User user1 = new User("player");
   l1.setText("Hi "+ user1.getUsername());
   l1.setBounds(10,50,80,25);
   panel.add(l1);

   l2= new JLabel();
   l2.setText("Welcome to Family Feud!\nIn this version of Family Feud, there are two levels and a death round.\nIn level 1 you will have three questions where you will be required to answer as specifically as possible.\n In level 2, you will have 4 questions and you will answer them just like in level 1\n **Note: The last question in level 2 is a bonus question and will decide if you make it to the death round");
   l2.setBounds(10,60,90,100);
   panel.add(l2);
    myButton.setFocusable(false);
    
    
  
  frame.setVisible(true);
  
  

}


@Override
public void actionPerformed(ActionEvent e){
 JLabel l1= new JLabel();
 User user1= new User("player");
 l1.setText("Hi "+ user1.getUsername());

}
}