/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rywebb
 */
public class arraytest {
    public static int[] arraySort(int[] butt){
        for(int i = 0; i < 3; i++){
            System.out.println(i);
            System.out.println(butt[i]);
            System.out.println(butt[i+1]);
            System.out.println(butt[0] + " " + butt[1] + " " + butt[2] + " " + butt[3]);
            if(butt[i] > butt[i+1]){
                int temp = butt[i];
                butt[i] = butt[i+1];
                butt[i+1] = temp;
                i = -1;                
            }
        }
        return butt;
    }
    public static void main(String[] args){
        int[] taco = {8,5,14,1};
        System.out.println(arraySort(taco));
    }
    
}
