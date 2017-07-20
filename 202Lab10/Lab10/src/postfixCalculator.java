/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rywebb
 */
import java.io.*;
import java.util.*;
//XXXXX  import stack class
/*
 * *
 * postfixCalculator.java Demonstrates the postfix calculator for integers .
 * Implemented using API Stack class. There are no error handling routines
 * written. Assumes that the postfix expression is correct.
 *
 * Lab10 - C202 & I211
 *
 * Modified by : Ryan Webb modified: 8/1/2013
 *
 */

public class postfixCalculator {

    //XXXXX  declare a Stack object named calculator for Strings
    Stack<String> calculator;

    public postfixCalculator() {
        calculator = new Stack<String>();
        //XXXXX  instantiate the Stack object calculator 
    }

    public String add() {
        return new Integer((Integer.valueOf(calculator.pop()) + Integer.valueOf(calculator.pop()))).toString();
        //add two items 
		/*
         * this method pops top two elements (a,b), converts them to
         * Integers(see Integer.valueOf()), adds the two Integers, and returns
         * the String representation of the resuling Integer.
         */
    }

    public String subtract() {
        int a = Integer.valueOf(calculator.pop());
        int b = Integer.valueOf(calculator.pop());
        return new Integer(b - a).toString();
    }

    public String multiply() {
        return new Integer((Integer.valueOf(calculator.pop()) * Integer.valueOf(calculator.pop()))).toString();
    }

    public String divide() {
        int a = Integer.valueOf(calculator.pop());
        int b = Integer.valueOf(calculator.pop());
        return new Integer(b / a).toString();
    }
    //XXXXX  write methods to subtract(b-a), multiply, and divide(b/a).

    public String calculate(String exp) {

        String result;
        // split the string, we need separate characters in exp
        String[] parse = exp.split(" ");
        for (int i = 0; i < parse.length; i++) {
            if (parse[i].equals("+")) //do additions
            {
                calculator.push(add());
            } 
            else if (parse[i].equals("-"))
            {
                calculator.push(subtract());
            }
            else if (parse[i].equals("*")){
                calculator.push(multiply());
            }
            else if (parse[i].equals("/")){
                calculator.push(divide());
            }//XXXXX add code to do -, *, and / operations
            else {
                calculator.push(parse[i]);
            }
        }
        result = calculator.pop();

        if (!calculator.empty()) {
            result = "ERROR";
        }
        return result;
    }

    public static void main(String args[]) {
        postfixCalculator pc = new postfixCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a postfix expression");
        String expression = sc.nextLine();
        System.out.println("Expression evaluates to " + pc.calculate(expression));

    }
}
