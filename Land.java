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
import javax.swing.JComponent;
/**
 *
 * @author Administrator
 */
public class Land {
    public int value;
    public String landName;
    public int row,col;
    public Player player;
    public int team;
            
           
     public Land(int value, String landName, int row, int col,Player player, int team)
     {
        this.value = value;
        this.landName = landName;
        this.row = row;
        this.col = col;
        this.player = null;
        this.team = 0;
     }
     
     public void setPlayer(Player player)
     {
         this.player=player;
         this.team=player.team;
     }
     
     public void lucky_1()
     {
         this.player = null;
     }
    
     public void lucky_2(Player player)
     {
         this.player = player;
     }
    
     public int getValue()
     {
         return value;
     }
     
    
}

     
     
      
    
    
    /**
     * @param args the command line arguments
     */
    

