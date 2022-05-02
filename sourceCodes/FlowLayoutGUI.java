package sourceCodes;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutGUI {
  public static void main(String[] args) {

    JFrame fr = new JFrame("With Layout Manager");
    fr.setSize(350,150);
    fr.setVisible(true);
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    FlowLayout fl = new FlowLayout();
    fr.setLayout (new FlowLayout());

    JLabel lb1 = new JLabel ("Pikachu ");
    JLabel lb2 = new JLabel ("Nani!?");
    fr.add(lb1);
    fr.add(lb2);
    fl.getAlignment();
  }
}