package sourceCodes;

//import the class JOptionPane from the javax.swing package
import javax.swing.JOptionPane;
//can also be written as, import javax.swing.*;

public class GetInputFromKeyboard1 {

public static void main(String[] args) {
  String name = "";
  /*creates a JOptionPane input dialog which will display a
  dialog with a message, a textfield and an OK button*/
  //returns a String which we will save in the name variable
  name = JOptionPane.showInputDialog("Please enter your name");
  //creates the welcome message, which we will store in the msg variable
  String msg = "Hello " + name + "!";
  //displays a dialog wc contains a msg and an ok button
  JOptionPane.showMessageDialog(null,msg);
}
}
