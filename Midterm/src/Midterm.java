/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rywebb
 */
import java.util.Random;
public class Midterm {
    public static final double error = 0.0001;
    public Midterm(){}
    public double sqrt(double num, double lastGuess){
        double nextG = (lastGuess + num/lastGuess)/2;
        
        if(Math.abs(nextG - lastGuess)< 0.0001)
            return lastGuess;
        else
            return sqrt(num, nextG);
    }
    public static void main(String[] args){
        Midterm mc = new Midterm();
        Random r = new Random(System.nanoTime());
        double[] test = new double[10];
        for(int i = 0; i < test.length; i++){
            test[i] = 1 + (int)(r.nextDouble()*20);
        }
        for(double e: test){
            System.out.print("Square root of " + e);
            System.out.printf(" using Math.sqrt() is %4.5f" , Math.sqrt(e));
            System.out.printf(" and using my approximation it is "
                    + "%4.5f" , mc.sqrt(e, 1.0));
            System.out.println();
        }
    }
    
}



/* Output1: Square root of 1.0 using Math.sqrt() is 1.00000 
and using my approximation it is 1.00000
Square root of 15.0 using Math.sqrt() is 3.87298 
and using my approximation it is 3.87298 
Square root of 11.0 using Math.sqrt() is 3.31662 
and using my approximation it is 3.31662 
Square root of 13.0 using Math.sqrt() is 3.60555 
and using my approximation it is 3.60555
Square root of 6.0 using Math.sqrt() is 2.44949 
and using my approximation it is 2.44949
Square root of 10.0 using Math.sqrt() is 3.16228 
and using my approximation it is 3.16228
Square root of 4.0 using Math.sqrt() is 2.00000 
and using my approximation it is 2.00000
Square root of 11.0 using Math.sqrt() is 3.31662 
and using my approximation it is 3.31662
Square root of 7.0 using Math.sqrt() is 2.64575 
and using my approximation it is 2.64577
Square root of 5.0 using Math.sqrt() is 2.23607 
and using my approximation it is 2.23607
* output 2: Square root of 8.0 using Math.sqrt() is 2.82843 
and using my approximation it is 2.82847
Square root of 16.0 using Math.sqrt() is 4.00000 
and using my approximation it is 4.00000
Square root of 14.0 using Math.sqrt() is 3.74166 
and using my approximation it is 3.74166
Square root of 20.0 using Math.sqrt() is 4.47214 
and using my approximation it is 4.47214
Square root of 4.0 using Math.sqrt() is 2.00000 
and using my approximation it is 2.00000
Square root of 20.0 using Math.sqrt() is 4.47214 
and using my approximation it is 4.47214
Square root of 20.0 using Math.sqrt() is 4.47214 
and using my approximation it is 4.47214
Square root of 16.0 using Math.sqrt() is 4.00000 
and using my approximation it is 4.00000
Square root of 13.0 using Math.sqrt() is 3.60555 
and using my approximation it is 3.60555
Square root of 20.0 using Math.sqrt() is 4.47214 
and using my approximation it is 4.47214
 */
