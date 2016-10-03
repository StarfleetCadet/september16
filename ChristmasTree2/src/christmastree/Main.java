/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package christmastree;

import javax.swing.*;
import java.awt.*;

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

        String symbol;
        //char draw = '\0';
        int height;
        //ChristmasTree myTree;
        ChristmasTreeUsingStringBuilder myTree;

        height = getHeightFromUser();
        symbol = getSymbolFromUser();
       //char draw = sign.charAt(0);

        myTree = new ChristmasTreeUsingStringBuilder(height, symbol);
        myTree.paint();

        System.out.println("Merry X-mas");

    }

    public static String getSymbolFromUser() throws HeadlessException
    {
        String symbol;

        symbol = JOptionPane.showInputDialog("Please type any sign for drawing your personal tree: ");

        return symbol;
    }

    private static int getHeightFromUser() throws HeadlessException, NumberFormatException {
        String input;
        int height;

        input = JOptionPane.showInputDialog("Please type the height of your Tree: ");
        height = Integer.parseInt(input);

        return height;
    }
}
