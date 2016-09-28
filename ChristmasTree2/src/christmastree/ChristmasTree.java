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
    char draw = '\0';
    
    ChristmasTree(int x, char draw) 
    {
        height = x;
        this.draw = draw;
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
        char draw = '\0';
        
        for (int rowNo = 1; rowNo <= height; rowNo++)
        {
            row = createRow(rowNo);
            System.out.println(row);
           
        }
    }
    
//    private void paintRoot()
//    {
//        
//    }
    
    private String createRow(int rowNo, char draw)
    {
        String row = "";
        
        int blankSpace = height - rowNo;
        
        for( int i = 0; i < blankSpace; i++) 
        {
            row += " ";
        }
        
        int sign = 2 * rowNo - 1;
        
        for (int i = 1; i <= sign; i++)
        {
            row += draw;
        }
        
        return row;
    }
}