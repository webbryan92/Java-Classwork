/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rywebb
 */
public class Reversal {
    public static void main(String[] args){
        String word = "economy";
        System.out.println(stringReversal(word));
    }
    public static String stringReversal(String s){
        if(s.length() == 1)
            return s;
        return stringReversal(s.substring(s.length()-1, s.length())) + stringReversal(s.substring(0,s.length()-1));
    }
    
}
