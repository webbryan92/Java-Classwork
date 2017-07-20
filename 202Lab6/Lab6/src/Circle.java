 // Circle.java: The circle class that extends GeometricObject
public class Circle extends GeometricObject implements Comparable {
  private double radius;


  public Circle(){
  	radius = 1.0;
  }
  
  public Circle(double radius){
  	this.radius = radius;
  }
  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /** Implement the getArea method defined in GeometricObject */
  public double getArea() {
    return radius * radius * Math.PI;
  }

  /** Implement the getPerimeter method defined in GeometricObject*/
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }

  /** Override the toString() method defined in the Object class */
  public String toString() { 
   return "[Circle] radius = " + radius;
  }

  public int compareTo(Object obj) {
    if (this.getArea() > ((Circle)obj).getArea())
      return 1;
    else if (this.getArea() < ((Circle)obj).getArea())
      return -1;
    else
      return 0;
  }

  public boolean equals(Object obj) {
    return this.radius == ((Circle)obj).radius;
  }
}
