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
public class Board {
    public Land[][] position = new Land[6][8];
    
    
    public Board()
    {
       // position = new Land[6][8];
        for(int i = 0; i < 6; i ++)
        {
            for(int j = 0; j < 8; j ++)
            {
                position[i][j] = null;
            }
        }
    }
    
    public void setBoard(int row, int col, Land land)
    {
        this.position[row][col]=land;
    }
    
  
}
