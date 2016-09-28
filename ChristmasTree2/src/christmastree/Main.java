/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmastree;

import javax.swing.JOptionPane;

/**
 *
 * @author aviva
 */
public class Main 
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       String input = "";
       String symbol = "" ;
       //char draw = '\0';
       int height = 0;
       
       input = JOptionPane.showInputDialog("Please type the height of your Tree: ");
       height = Integer.parseInt(input);
       symbol = JOptionPane.showInputDialog("Please type any sign for drawing your personal tree: ");
       
       //char draw = sign.charAt(0);
       
       ChristmasTree myTree = new ChristmasTree(height, symbol);
       
       myTree.paint();
       System.out.println("Merry X-mas");
       
    }
    
}
