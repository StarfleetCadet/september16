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
       String sign = "" ;
       int height = 0;
       
       input = JOptionPane.showInputDialog("Please type the height of your Tree: ");
       height = Integer.parseInt(input);
       sign = JOptionPane.showInputDialog("Please type any sign for drawing your personal tree: ");
       
       ChristmasTree myTree = new ChristmasTree(height);
       
       myTree.paint();
       System.out.println("Merry X-mas");
       
    }
    
}
