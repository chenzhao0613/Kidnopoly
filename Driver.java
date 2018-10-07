/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kidnopoly;
//import java.util.Scanner; 
import javax.swing.*; //Program uses class JOptionPane for message dialog
import java.util.ArrayList;
/**
 *
 * @author Tianqi
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Board board = new Board();                              //initial the board
        Land land_1 = new Land(0, "Lucky_1", 0, 0, null, 0);
        board.position[0][0] = land_1;
        Land land_2 = new Land(4, "Short", 0, 1, null, 0);
        board.position[0][1] = land_2;
        Land land_3 = new Land(4, "Short", 0, 2, null, 0);
        board.position[0][2] = land_3;
        Land land_4 = new Land(0, "Challenge", 0, 3, null, 0);
        board.position[0][3] = land_4;
        Land land_5 = new Land(1, "Char", 0, 4, null, 0);
        board.position[0][4] = land_5;
        Land land_6 = new Land(1, "Char", 0, 5, null, 0);
        board.position[0][5] = land_6;
        Land land_7 = new Land(1, "Char", 0, 6, null, 0);
        board.position[0][6] = land_7;
        Land land_8 = new Land(0, "Start", 0, 7, null, 0);
        board.position[0][7] = land_8;
        Land land_9 = new Land(0, "Challenge", 1, 0, null, 0);
        board.position[1][0] = land_9;
        Land land_10 = new Land(0, "Challenge", 1, 7, null, 0);
        board.position[1][7] = land_10;
        Land land_11 = new Land(4, "Integer", 2, 0, null, 0);
        board.position[2][0] = land_11;  
        Land land_12 = new Land(16, "Long Long", 2, 7, null, 0);
        board.position[2][7] = land_12;
        Land land_13 = new Land(4, "Integer", 3, 0, null, 0);
        board.position[3][0] = land_13;       
        Land land_14 = new Land(16, "Long Long", 3, 7, null, 0);
        board.position[3][7] = land_14;      
        Land land_15 = new Land(0, "Challenge", 4, 0, null, 0);
        board.position[4][0] = land_15;
        Land land_16 = new Land(0, "Challenge", 4, 7, null, 0);
        board.position[4][7] = land_16;
        Land land_17 = new Land(0, "Lucky_2", 5, 0, null, 0);
        board.position[5][0] = land_17;    
        Land land_18 = new Land(8, "Double", 5, 1, null, 0);
        board.position[5][1] = land_18;  
        Land land_19 = new Land(8, "Double", 5, 2, null, 0);
        board.position[5][2] = land_19; 
        Land land_20 = new Land(0, "Challenge", 5, 3, null, 0);
        board.position[5][3] = land_20;       
        Land land_21 = new Land(8, "Long", 5, 4, null, 0);
        board.position[5][4] = land_21;
        Land land_22 = new Land(8, "Long", 5, 5, null, 0);
        board.position[5][5] = land_22;
        Land land_23 = new Land(8, "Long", 5, 6, null, 0);
        board.position[5][6] = land_23;
        Land land_24 = new Land(0, "Lucky_3", 5, 7, null, 0);
        board.position[5][7] = land_24;         
        
        //int die = (int)(Math.random()*10) % 4 + 1;
        
        Player player_1 = new Player(1, 1, 256, null);  //initial the players
        Player player_2 = new Player(2, 1, 256, null);
        Player player_3 = new Player(3, 2, 256, null);
        Player player_4 = new Player(4, 2, 256, null);
        
        Score score_1 = new Score(0);       //initial the score board
        Score score_2 = new Score(0);
        Score score_3 = new Score(0);
        Score score_4 = new Score(0);
        
        //initialize challenges and hints
        
        JOptionPane.showMessageDialog(null, "There are four challengers here!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Enter your names here!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
        String defaultResponse = "Your name?";
        String name_1;
        name_1 = JOptionPane.showInputDialog(null,"The First Challenger's Name here!! ", defaultResponse);
        String name_2;
        name_2 = JOptionPane.showInputDialog(null,"The Second Challenger's Name here!! ", defaultResponse);
        String name_3; 
        name_3 = JOptionPane.showInputDialog(null,"The Next Challenger's Name here!! ", defaultResponse);
        String name_4; 
        name_4 = JOptionPane.showInputDialog(null,"The Last Challenger's Name here!! ", defaultResponse);
        
        player_1.setName(name_1);        //set challengers name to players
        player_2.setName(name_2);
        player_3.setName(name_3);
        player_4.setName(name_4);

        JOptionPane.showMessageDialog(null, "OK!! The game starts!! NOW!!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
        
        int team_1_score = score_1.getScore() + score_2.getScore();
        int team_2_score = score_3.getScore() + score_4.getScore();
        
        
         String selections[] = {"1", "2", "3"};
         String choice;
        // choice = (String) JOptionPane.showInputDialog(null, "Select the difficulty:","Kidsnopoly", JOptionPane.QUESTION_MESSAGE, null, selections, selections[0]);
     
        
       while(team_1_score > 0 && team_1_score < 1024 && team_2_score > 0 && team_2_score < 1024)
        {
            int currentRow = player_1.getRow();
            int currentCol = player_1.getCol();
            
       
          if(board.position[currentRow][currentCol].value > 0)
            {
                if(player_1.money > board.position[currentRow][currentCol].value)
                {
                    String response = JOptionPane.showInputDialog(null,"you can buy, buy?(yes or no) ", "Kidsnopoly");
                    if (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y"))
                    {
                        
                       choice = (String) JOptionPane.showInputDialog(null, "Select the difficulty:","Kidsnopoly", JOptionPane.QUESTION_MESSAGE, null, selections, selections[0]);
                       
                      JOptionPane.showMessageDialog(null, "Here is the question!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                    
                    response = JOptionPane.showInputDialog(null,"", "Kidsnopoly");
                    String answer = "shit";
                    if (response.equalsIgnoreCase(answer))
                    {
                        JOptionPane.showMessageDialog(null, "You are right! \nThe points are added in your %d account!","Kidsnopoly", JOptionPane.INFORMATION_MESSAGE);
                        int theNumber = Integer.parseInt(choice);
                        player_1.setMoney(player_1.money + theNumber * 12);
                        System.out.printf("the money is %d",player_1.money);
                    }
                    
                }
           }
            
            
            }  
            
            
            
            
        }
       
        
        
        
        
    }
    
}
