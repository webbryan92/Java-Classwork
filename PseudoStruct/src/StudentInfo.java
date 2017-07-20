/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan
 */
public class StudentInfo {    
    public static void main(String[] args){
        int y = 1;
        int x = 7;
        Int int1 = new Int(x);
        Int int2 = new Int(y);
        System.out.println(int1.toString());
        System.out.println(int1.isPrime());
        System.out.println(int1.plus(int2));
        int1 = int1.plus(int2);
        System.out.println(int1);
        System.out.println(int1.minus(int2));
        int2.x = 3;
        System.out.println(int1.times(int2));
        System.out.println(int1.div(int2));
        System.out.println(int1.isPrime());
    }    
}
