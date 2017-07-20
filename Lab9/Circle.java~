public class Circle {
    //data members
  double radius = 1.0;
    //constructor
  public Circle() {
  }
  public Circle(double newRadius) {
    radius = newRadius;
  }
  public Circle(Circle C) {
    radius = C.radius;
  }
  //mutators
  public void mutate_radius(double newRadius) {
    radius = newRadius;
  }
  //accessors
  public double access_radius() {
   return radius; 
  }
  //methods
  public double area() {
    return radius * radius * Math.PI;
  }
  public double circumference() {
    return radius * 2 * Math.PI;
  }
  public double diameter() {
    return radius * 2;
  }
  public String toString() {
    return "The circle has a radius of " + radius;
  }
  public int compareTo(Circle c) {
    if(radius > c.radius)
      return 1;
    else if(radius < c.radius)
      return -1;
    else
      return 0;
  }
}