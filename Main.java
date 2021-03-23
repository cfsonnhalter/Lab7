/*Program created by @cfsonnhalter (Chris Sonnhalter) 
Date: 3/23/2021 */

// imports java swing 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Main{
  public static void main(String args[]) {
    SwingUtilities.invokeLater(new Runnable(){
      public void run() {
        new Counter(); // creates a new Counter object and runs it 
      }
    });
  }
}