import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter implements ActionListener {
  JLabel leftLabel; //declares labels for use 
  JLabel rightLabel;
  int leftCount; //declares ints to hold count
  int rightCount; 
  
  Counter() {
    // adds the JFrame and decalsres size and text 
    JFrame frame = new JFrame("Let's Count!"); 
    frame.setLayout(new FlowLayout());
    frame.setSize(200, 110);

  //adds text to buttons
    JButton left = new JButton("Left");
    JButton right = new JButton("Right");
  
  //creates the action listner for the above buttons
    right.addActionListener(this);
    left.addActionListener(this);
  
  //sets original count to 0
    int leftCount = 0;
    int rightCount = 0;

  //adds the text to the frame
    frame.add(left);
    frame.add(right);

//adds text counter under the buttons
    leftLabel = new JLabel("Count: " + int leftCount);
    rightLabel = new JLabel("Count: " + int rightCount);

//adds buttons to the frame
    frame.add(leftLabel);
    frame.add(rightLabel);

// declares and defines reset button to return to 0 when pressed
    JButton reset = new JButton("Reset");
    
    reset.addActionListener(this);

    frame.add(reset);

    frame.setVisible(true);

  }
  
  // method that adds to the counter when each button is pressed
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