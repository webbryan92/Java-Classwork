/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n07;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class N07 {

    public static void main(String[] args) {
        Method[] methods = java.lang.Thread.class.getDeclaredMethods();
        System.out.println("Here is a list of methods in Thread");
        for (int i = 0; i < methods.length; i++) {
            Method m = methods[i];
            Class c = m.getReturnType();
            String name = m.getName();
            Class[] parameters = m.getParameterTypes();            
            System.out.print(Modifier.toString(m.getModifiers()));
            System.out.print(" " + c.getName() + " " + name + "(");
            for (int j = 0; j < parameters.length; j++) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(parameters[j].getName());
            }
            System.out.println(");");
        }
    }
}
