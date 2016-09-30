/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmastree;

/**
 *
 * @author aviva
 */
public class ChristmasTree 
{
    int height = 0;
    String symbol = "\\u2734";
    
    ChristmasTree(int x, String symbol) 
    {
        height = x;
        this.symbol = symbol;
    }
    
    public void paint() 
    {
        
        paintCrown();
        
        //paintRoot();
        
    }
    
    private void paintCrown() 
    {
        String row = "";
        //
        this.symbol = symbol;
        
        for (int rowNo = 1; rowNo <= height; rowNo++)
        {
            row = createRow(rowNo, symbol);
            System.out.println(row);
           
        }
    }
    
//    private void paintRoot()
//    {
//    
    
//        String row = "";
//        this.symbol = symbol;
//        int blankSpace 
//        
//        for(int columnNO = 1; columnNo <= height; columnNo++)
//        {
//            
//        }
            
        
//         String trunk = "";
//            int blankSpace = rows - 1;
//            // height of trunk is height of tree/2
//            int heightTrunk = rows / 2;
//            
//            String tree = "";
//            
//            // create row blank spaces
//             for(int column = 0; column < blankSpace; column++) 
//            {
//                tree = tree + " ";
//            }
//
//             // add * to blank spaces for the tree-trunk
//             tree = tree + "*";
//          
//            for(int rowNo = 0; rowNo < heightTrunk; rowNo++)
//            {   
//                 // print row
//                 System.out.println(tree);
//            }
    //}
    //}
//}
    //private String createTrunk(int blankSpace,  ) 
    private String createRow(int rowNo, String symbol)
    {
        String row = "";
        //symbol = "";
        //this.symbol = symbol;
        //Character.toString(draw);
        
        int blankSpace = height - rowNo;
        
        for( int i = 0; i < blankSpace; i++) 
        {
            row += " ";
        }
        
        int sign = 2 * rowNo - 1;
        //this.symbol = symbol;
       
        
        for (int i = 1; i <= sign; i++)
        {
            row += symbol;
        }
        
        return row;
        
    }
}
