/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter7bouncingbarpanel;

import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class Chapter7BouncingBarPanel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GraphicsEnvironment e=GraphicsEnvironment.getLocalGraphicsEnvironment();
//        String []FontNames=e.getAvailableFontFamilyNames();
//        for (int i=0;i<FontNames.length;i++)
//        {
//            System.out.println(FontNames[i]);
//        }
        
        JFrame frame = new JFrame("A Bouncing Ball"); 
        frame.setTitle("Breaks V 1.0");
        frame.setSize(400,430);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new BallGame());
        //frame.pack();
        frame.setVisible(true);
        
    }
    
}
