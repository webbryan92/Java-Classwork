/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nothreadio;

/**
 *
 * @author Ryan
 */
import java.io.*;

/**
 *
 * @author rywebb
 */
public class NoThreadIO {    
    public static void main(final String[] args) {
        long startTime = System.currentTimeMillis();
        FileReader fr = null;
        LineNumberReader lnr = null;
        String str;
        int lines = 0;
        System.out.println(args.length);
        for(int i = 0; i < args.length; i++){
            try {
                File file = new File(args[i]);
                fr = new FileReader(file);
                lnr = new LineNumberReader(fr);
                while ((str = lnr.readLine()) != null) {
                    lines = lnr.getLineNumber();                    
                }
                System.out.println("(" + lines + ")");
                System.out.println(file.getName());
                lines = 0;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Execution Time");
        System.out.println(endTime - startTime);
    }
}
