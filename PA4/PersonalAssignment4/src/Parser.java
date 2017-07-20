/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rywebb
 */
import java.io.*;
import java.util.Scanner;
import java.lang.Character;
public class Parser {
    public double found = 0;
    public double notfound = 0;
    public double compsfound = 0;
    public double compsnotfound = 0;
    public MyLinkedList[] Wordbank = new MyLinkedList[26];
    public File d = new File("random_dictionary.txt");
    public File o = new File("oliver.txt");
    public char firstL; //First Letter
    public String str = " ";
    public int k = 0;
    
    public static void main(String[] args){
        Parser p = new Parser();
        for(int j = 0; j < p.Wordbank.length; j++){
            p.Wordbank[j] = new MyLinkedList();
        }
        try{
            Scanner inputStream = new Scanner(p.d);
            while(inputStream.hasNext()){ 
                p.str = inputStream.next();
                p.firstL = p.str.charAt(0);
                if(Character.isLetter(p.firstL)){
                    p.str = p.str.toLowerCase();                    
                }
                if((Character.isLetter(p.firstL)|| p.firstL == '-') && !p.str.isEmpty()){
                        p.Wordbank[p.str.charAt(0) - 97].add(p.str);
                        System.out.println(p.str); //testing dictionary
                        p.str = " ";
                }
            }
            inputStream.close();
            //for(int z = 0; z < p.Wordbank[0].size; z++)
                //System.out.println(p.Wordbank[0].get(z));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
