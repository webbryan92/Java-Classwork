/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rywebb
 */
public class Triangle extends GeometricObject implements Comparable, Cloneable {

    private double x;
    private double y;
    private double z;

    public Triangle() {
        x = 1;
        y = 1;
        z = 1;
    }

    public Triangle(double a, double b, double c) {
        x = a;
        y = b;
        z = c;
    }

    public double getArea() {
        double s = (x + y + z) / 2;
        return Math.sqrt(s * (s - x) * (s - y) * (s - z));
    }

    public double getPerimeter() {
        return x + y + z;
    }

    public String toString() {
        return "[Triangle] sides are " + x + " " + y + " " + z;
    }

    public int compareTo(Object obj) {
        if (this.getArea() > ((Triangle) obj).getArea()) {
            return 1;
        } 
        else if (this.getArea() < ((Triangle) obj).getArea()) {
            return -1;
        } 
        else {
            return 0;
        }
    }

    public boolean equals(Object obj) {
        return this.getArea() == ((Triangle) obj).getArea();
    }

    public Triangle clone() {
        try {
            return (Triangle) super.clone();
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}
