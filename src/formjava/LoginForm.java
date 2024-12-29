/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formjava;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

//layout: Flowlayout
//Label, Button, TextField

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        frame.setSize(600, 400);
        JLabel lbl1 = new JLabel("UserName");
        JLabel lbl2 = new JLabel("Password");
        
        lbl1.setBounds(50, 50, 80, 30);
        lbl2.setBounds(50, 130, 80, 30);
        
        frame.add(lbl1);
        frame.add(lbl2);
        
        JTextField txt1 = new JTextField("");
        JTextField txt2 = new JTextField("");
        
        txt1.setBounds(180, 50, 120, 25);
        txt2.setBounds(180, 130, 120, 25);
        
        frame.add(txt1);
        frame.add(txt2);
        
        JButton btn = new JButton("Login");
        btn.setBounds(150, 180, 80, 30);
        frame.add(btn);
        
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String username = txt1.getText();
               String password = txt2.getText();
                System.out.println(username + " " + password);
            }
            
        });
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
