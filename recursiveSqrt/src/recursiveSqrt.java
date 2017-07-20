/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rywebb
 */
public class recursiveSqrt {
    public static void main(String[] args){
        recursiveSqrt Q = new recursiveSqrt();
        double sqrt = Q.recursiveSqrt(16, 1);
        System.out.println(sqrt);
    }
    public double recursiveSqrt(double n, double lastG){
        double nextG = (lastG + n/lastG)/2;
        
        if(Math.abs(nextG - lastG)< 0.0001)
            return lastG;
        else
            return recursiveSqrt(n, nextG);
        
    }
    
}
