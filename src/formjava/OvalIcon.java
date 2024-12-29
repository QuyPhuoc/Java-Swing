/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formjava;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author DELL
 */
public class OvalIcon implements Icon{
    private int width, height;
    public OvalIcon(int w, int h){
        this.width = w;
        this.height = h;
    }
    
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.drawOval(x, y, width - 1, height - 1);
    }

    @Override
    public int getIconWidth() {
        return width;
    }

    @Override
    public int getIconHeight() {
        return height;
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Oval");
        frame.setSize(600, 300);
        
        JLabel lbl1 = new JLabel();
        JLabel lbl2 = new JLabel();
        JLabel lbl3 = new JLabel("Round!", new OvalIcon(60, 60), SwingConstants.CENTER);
        lbl1.setBounds(50, 50, 80, 30);
        lbl2.setBounds(50, 50, 120, 30);
        lbl3.setHorizontalTextPosition(SwingConstants.CENTER);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
    }
}
