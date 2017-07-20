/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrdeffen
 */
import java.io.*;
import java.util.Scanner;
import java.lang.Character;

public class Parse {

    public static void main(String[] args) {
        double found = 0;
        double notFound = 0;
        double compsFound = 0;
        double compsNotFound = 0;
        MyLinkedList[] Wordbank = new MyLinkedList[26];
        char firstL;
        String str = "";
        int k;

        for (int j = 0; j < Wordbank.length; j++) {
            Wordbank[j] = new MyLinkedList();
        }
        try {
            File d = new File("random_dictionary.txt");
            FileInputStream inputStream = new FileInputStream(d);
            while ((k = inputStream.read()) != -1) {
                firstL = (char) k;
                if (Character.isLetter(firstL)) {
                    str += Character.toLowerCase(firstL);
                }

                if ((Character.isWhitespace(firstL)) && str.length() != 0 && firstL != '\'') {
                    Wordbank[str.charAt(0) - 97].add(str);
                    //System.out.println(str); //testing dictionary
                    str = "";
                }
            }
            inputStream.close();
            for(int z = 0; z < Wordbank[2].size; z++)
            System.out.println(Wordbank[2].get(z));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream input = new FileInputStream("oliver.txt");
            int x;
            char parse;
            String str1 = "";
            int[] count = new int[1];
            while ((x = input.read()) != -1) {
                parse = (char) x;

                if (Character.isLetter(parse)) {
                    str1 += Character.toLowerCase(parse);
                }
                  
                if ((Character.isWhitespace(parse) || !Character.isLetter(parse)) && str1.length() != 0 && parse != '\'') {
                    count[0] = 0;
                    
                    if (Wordbank[str1.charAt(0) - 97].contains(str1, count)) {
                        found++;
                        compsFound += count[0];
                    } else {
                        notFound++;
                        compsNotFound += count[0];
                    }
                   //System.out.println(str1); 
                    str1 = "";
                }

            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(found);
        System.out.println(compsFound);
        System.out.println("Average comparisons for words found: " + found / compsFound);
        System.out.println("Average comparisons for words not found: " + notFound / compsNotFound);
    }
}
