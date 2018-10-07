/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kidnopoly;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
/**
 *
 * @author Administrator
 */
  public class Paint extends JPanel
{
    private ImageIcon backgroundImg = new ImageIcon("image/mono1.png");
    private static final Dimension backgroundSz = new Dimension(20,20);
    
  
    public Paint()
    {
    setPreferredSize(backgroundSz);
    setBackground(Color.RED);
    }

    @Override
    public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(backgroundImg.getImage(), 0, 0, null);
}
}  
