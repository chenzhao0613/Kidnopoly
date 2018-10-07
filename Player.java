/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kidnopoly;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Player {
    public int player;
    public int team;
    public int money;
    public String name;
    public int col, row;
    
    public Player(int player, int team, int money, String name)
    {
        this.player = player;
        this.team = team;
        this.money = money;
        this.name = name;
        col = 0;
        row = 7;
    }
    
    public void setMoney(int money)
    {
        this.money = money;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setPlace(int row, int col)
    {
        this.col = col;
        this.row = row;
    }
    
    public void lucky_3()    //get back to the Start land and take extra money
    {
        col = 7;
        row = 5;
    }
    
    public void Move(int row, int col, int n)
    {
        for(int i=0; i<n;i++)
        {
        if(this.row==5&&this.col>0)
            this.col--;
        else if(this.row==5&&this.col==0)
            this.row--;
        else if(this.row>0&&this.row<5&&this.col==0)
            this.row--;
        else if(this.row==0&&this.col==0)
            this.col++;
        else if(this.row==0&&this.col>0&&this.col<7)
            this.col++;
        else if(this.row==0 && this.col==7)
            this.row++;
        else if(this.row>0&&this.row<5&&this.col==7)
            this.col++;
        else if(this.row==5&&this.col==7)
            this.col--;
        }
       // JOptionPane.showMessageDialog(null, "","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE); 
    }
    
    
}
