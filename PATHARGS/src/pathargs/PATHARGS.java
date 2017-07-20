/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathargs;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PATHARGS {
    public static void main(String[] args) {
        String argument = args[0];
        String path = "";
        Map map = System.getenv();

        Set keys = map.keySet();
        Iterator iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            String value = (String) map.get(key);
            if(key.equals("Path")){
                path = value;
            }
        }
        System.out.println(path);
        String[] directories = path.split(";");
        for(int i = 0; i < directories.length; i++){
            System.out.println(directories[i]);
        }
        for(int i = 0; i < directories.length; i++){
            try{
                File f = new File(directories[i]);
                String[] list = f.list();
                for(int j = 0; j < list.length; j++){
                    //System.out.println(list[j]);
                    if(list[j].equals(argument)){
                        System.out.println("Found " + argument + " in " + directories[i]);
                    }
                }
            }
            catch(Exception e){
                System.out.println("directory not found");
            }
        }          
    }
}
