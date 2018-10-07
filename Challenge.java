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
public class Challenge {
    
     private String quiz;
     private String answer;
     private int score;
     private int level;
     
     public Challenge(String quiz, String answer, int score, int level)
     {
         this.quiz = quiz;
         this.answer = answer;
         this.score = score;
         this.level = level;  
     }
     
     public void setQuiz(String quiz)
     {
         this.quiz = quiz;
     }
     
     public void setAnswer(String answer)
     {
         this.answer = answer;
     }
     public String getAnswer()
     {
         return answer;
     }
    
     public int getScore()
     {
         return score;
     }
     
     public int getlevel()
     {
         return level;
     }
}
