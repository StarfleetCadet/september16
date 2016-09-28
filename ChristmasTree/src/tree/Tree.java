/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

import javax.swing.JOptionPane;

/**
 *
 * @author aviva
 */
public class Tree 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      
                String input = "";
        int rows = 0;
        
            input = JOptionPane.showInputDialog("Please put in the height of the Tree ");
            //Parsing
            rows = Integer.parseInt(input);

            // loop for rows
            for (int rowNo = 1; rowNo < rows + 1; rowNo++) 
            {
                String row;
                
                row = createRow(rows, rowNo);
                //print rows
                System.out.println(row);
                // reset String
                row = "";
            }
            
            
         
            // build tree-trunk
            String trunk = "";
            int blankSpace = rows - 1;
            // height of trunk is height of tree/2
            int heightTrunk = rows / 2;
            
            String tree = "";
            
            // create row blank spaces
             for(int column = 0; column < blankSpace; column++) 
            {
                tree = tree + " ";
            }

             // add * to blank spaces for the tree-trunk
             tree = tree + "*";
          
            for(int rowNo = 0; rowNo < heightTrunk; rowNo++)
            {   
                 // print row
                 System.out.println(tree);
            }
            
            
            
    }

        
        public static String createRow(int rows, int rowNo) {
            
                String tree = "";
            
                // number of blank space in the first row
                // number of rows minus current rowNo
                int blankSpace = rows - rowNo;
                               
                // print blank space in every column
                for(int column = 0; column < blankSpace; column++) 
                {
                    tree = tree + " ";
                }

                // number of stars
                 
                int stars = 2 * rowNo - 1;
                
                // print-out stars
                for (int i = 0; i < stars; i++) 
                {
                    tree = tree + "*";
                }
        
                return tree;
        }
        
}
    

