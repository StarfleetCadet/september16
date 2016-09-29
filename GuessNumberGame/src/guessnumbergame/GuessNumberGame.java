/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessnumbergame;
import javax.swing.JOptionPane;

/**
 *
 * @author aviva
 */
public class GuessNumberGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String input = "";
        int number = 0;
        int rndNumber = 0;
        int trys = 0;
        boolean guess = false;
        
        //random number between 1 and 100
        // +1 to exclude zero
        rndNumber = (int)(Math.random()* 100 + 1);
        
        while (!guess)
        {
            input = JOptionPane.showInputDialog(++trys + ". Try ");
            number = Integer.parseInt(input);
            
            if (number == rndNumber)
            {
                guess = true;
                JOptionPane.showMessageDialog(null, "Really good you got it! ");
                if (trys > 6)
                    JOptionPane.showMessageDialog(null, "Hmm, was not very fast! ");
            }
            
            else 
            {
                JOptionPane.showMessageDialog(null, guess);
            }
        }
        
       
    }
    
}
