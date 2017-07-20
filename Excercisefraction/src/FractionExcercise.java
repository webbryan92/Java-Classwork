/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rywebb
 */
public class FractionExcercise {
    public static void main(String[] args){
        FractionExcercise f = new FractionExcercise();
        double test = 2;
        double total;
        total = f.sumSeries(test);
        System.out.println(total);
        
        
    }
    public double sumSeries(double i){
        if(i == 1)
            return 0.5;
        else
            return (i/(i+1))+sumSeries(i-1);
    }
}
