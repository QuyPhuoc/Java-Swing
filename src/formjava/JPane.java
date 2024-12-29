/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formjava;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class JPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Panel");
        frame.setSize(600, 600);
        
        JPanel pn1 = new JPanel();
        pn1.setBounds(50, 50, 150, 300);
        JPanel pn2 = new JPanel();
        pn2.setBounds(220, 50, 150, 300);
        
        JLabel lbl1 = new JLabel("Panel 1");
        lbl1.setBounds(50, 50, 80, 30);
        JLabel lbl2 = new JLabel("Panel 2");
        lbl2.setBounds(50, 50, 80, 30);
        
        pn1.add(lbl1);
        pn1.setBackground(Color.PINK);
        pn2.add(lbl2);
        pn2.setBackground(Color.ORANGE);
        
        frame.add(pn1);
        frame.add(pn2);
         
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
    }
}
