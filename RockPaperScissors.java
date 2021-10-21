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

public RockPaperScissors(){

//JPanel gamePanel= new JPanel();
gamePanel.setLayout(null);
JFrame gameFrame = new JFrame ("Rock,Paper,Scissors");
gameFrame.setSize(500,250);
gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

gameFrame.setVisible(true);

l1= new JLabel();
l1.setText("Enter your choice");
gamePanel.add(l1);


}
@Override
public void actionPerformed (ActionEvent e){
  System.out.println("Game");
}

}