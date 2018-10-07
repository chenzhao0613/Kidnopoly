/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kidnopoly;

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
    
    public int getRow()
    {
        return row;
    }
    
    public int getCol()
    {
        return col;
    }
    
    
    
    
    public void setPlace(int col, int row)
    {
        this.col = col;
        this.row = row;
    }
    
    public void lucky_3()    //get back to the Start land and take extra money
    {
        col = 0;
        row = 7;
    }
    
    
    
    
}
