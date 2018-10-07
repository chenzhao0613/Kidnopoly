package Kidnopoly;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
import java.applet.*;
import javax.swing.*;
import java.awt.*;



public class NewFrameApplet extends Applet {
    public static int rows=6;
    public static int cols=8;
    public static Color col1=Color.CYAN;
    public static Color col2=Color.GREEN;
    public static Color col3=Color.BLUE;
    public static Color col4=Color.RED;  
    public static Color col5=Color.GRAY;
    
    public void init()
    {
        setLayout(new GridLayout(rows,cols));
        Color temp;
        for(int i=0; i<=6;i++)
        {
            if(i>=1&&i<=5)
            {
                temp=col5;
            }
            else
            {
                temp=col1;
            }
            for(int j=0;j<=8;j++)
            {
                if(j>=1&&j<=7)
                {
                    temp=col5;
                }
                JPanel panel=new JPanel();
                panel.setBackground(temp);
            }
        }
    
    
    
    }

    
    
    
    
    
}
