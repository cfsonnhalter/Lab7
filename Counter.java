import java.awt*;
import java.awt.event.*;
import javax.swing.*;

public class Counter implements ActionListener {
  JLabel leftLabel;
  JLabel rightLabel;
  int leftCount;
  int rightCount;
  
  Counter() {
    JFrame frame = new JFrame("Let's Count!");
    frame.setLayout(new FlowLayout());
    frame.setSize(200, 110);

    JButton left = new JButton("Left");
    JButton right = new JButton("Right");

    right.addActionListener(this);
    left.addActionListener(this);

    int leftCount = 0;
    int rightCount = 0;

    frame.add(left);
    frame.add(right);

    leftLabel = new JLabel("Count: " + int leftCount);
    rightLabel = new JLabel("Count: " + int rightCount);

    frame.add(leftLabel);
    frame.add(rightLabel);

    JButton reset = new JButton("Reset");
    
    reset.addActionListener(this);

    frame.add(reset);

    frame.setVisible(true);

  }

  public void actionPerformed(ActionEvent ae) {
    if(ae.getActionCommand().equals("Left")){
      int leftCount + 1;
      label.setText("Count: " + int leftCount);
      }
      else if(ae.getActionCommand().equals("Right")){
        int rightCount + 1;
        label.setText("Count: " + int rightCount);
      }
      else{
        int leftCount = 0;
        label.setText("Count: " + int leftCount);
        int rightCount = 0;
        label.setText("Count: " + int rightCount);
      }


    }
  }
}