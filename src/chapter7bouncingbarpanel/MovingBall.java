/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter7bouncingbarpanel;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class MovingBall extends JPanel{
    protected Ball kora=new Ball (400,400);
    
    public MovingBall()
    {
       Thread gameThread = new Thread() {
         public void run() {
             move();
         }
    };
       gameThread.start();
    }
       
    public void paint(Graphics g)
    {
        super.paint(g);
        kora.paint(g);
    }
    
    public void move()
    {
        while (true)
        {
            kora.move();
            repaint();
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e)
            {
                System.exit(0);
            }
        }
    }
}
