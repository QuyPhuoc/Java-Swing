/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formjava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Caculator");
        frame.setSize(600, 400);
        
        JLabel lbl1 = new JLabel("Nhập số a: ");
        JLabel lbl2 = new JLabel("Nhập số b: ");
        JLabel lbl3 = new JLabel("Kết quả: ");
        
        lbl1.setBounds(50, 50, 80, 30);
        lbl2.setBounds(50, 110, 80, 30);
        lbl3.setBounds(50, 170, 80, 30);
        
        frame.add(lbl1);
        frame.add(lbl2);
        frame.add(lbl3);
         
        JTextField txt1 = new JTextField("");
        JTextField txt2 = new JTextField("");
        JTextField txt3 = new JTextField("");
        
        txt1.setBounds(180, 50, 120, 30);
        txt2.setBounds(180, 110, 120, 30);
        txt3.setBounds(180, 170, 120, 30);
        
        frame.add(txt1);
        frame.add(txt2);
        frame.add(txt3);
        
        JButton btn1 = new JButton("CLEAR");
        JButton btn2 = new JButton("ADD");
        JButton btn3 = new JButton("SUB");
        JButton btn4 = new JButton("MUL");
        JButton btn5 = new JButton("DIV");
        
        btn1.setBounds(50, 250, 80, 30);
        btn2.setBounds(50, 290, 80, 30);
        btn3.setBounds(150, 290, 80, 30);
        btn4.setBounds(250, 290, 80, 30);
        btn5.setBounds(350, 290, 80, 30);
        
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
            }
            
        });
      
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(txt1.getText());
                int y = Integer.parseInt(txt2.getText());
                txt3.setText((x + y) + "");
            }
        });
        
        btn3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(txt1.getText());
                int y = Integer.parseInt(txt2.getText());
                txt3.setText((x - y) + "");
            }
        });
        btn4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(txt1.getText());
                int y = Integer.parseInt(txt2.getText());
                txt3.setText((x * y) + "");
            }
        });
        btn5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double x = Double.parseDouble(txt1.getText());
                double y = Double.parseDouble(txt2.getText());
                txt3.setText((x / y) + "");
            }
        });
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
