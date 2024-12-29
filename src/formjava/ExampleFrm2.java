/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formjava;

import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class ExampleFrm2 extends JFrame{
    private JButton btn;
    
    public ExampleFrm2(String s){
        this.setTitle(s);
        
        this.setSize(600, 400);
        btn = new JButton("Click me");
        btn.setBounds(100, 50, 120, 30);
        this.add(btn);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
         new ExampleFrm2("Example2");
        
                
    }
}
