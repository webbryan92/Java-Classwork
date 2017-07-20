/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rywebb
 */
import java.util.*;

public class Lab2Part1 {
    public static boolean IsNumericString(String s)
    {
        try{
            Double.parseDouble(s);
            return(true);
        }
        catch(NumberFormatException ex){
            return(false);
        }
    }
    public static void main(String[] args)
    {
        if(Lab2Part1.IsNumericString("14.72"))
            System.out.println("It is a double");
        else
            System.out.println("It is not a double");
    }
    
}
//NumberFormatException