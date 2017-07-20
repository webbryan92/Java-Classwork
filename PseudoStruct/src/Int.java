/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan
 */
import java.*;

public class Int {
    public int x;
    public Int(int a) {
        x = a;
    }
    public String toString(){
        String str = Integer.toString(x);
        return str;
    }
    public Int plus(Int b){
        int val = this.x + b.x;
        return new Int(val);
    }
    public Int minus(Int b){
        int val = this.x - b.x;
        return new Int(val);
    }
    public Int times(Int b){
        int val = this.x * b.x;
        return new Int(val);
    }
    public Int div(Int b){
        int val = this.x / b.x;
        return new Int(val);
    }
    public boolean isPrime() {
        return !new String(new char[this.x]).matches(".?|(..+?)\\1+");
    }
}
