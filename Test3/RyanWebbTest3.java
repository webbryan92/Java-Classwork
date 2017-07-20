public class RyanWebbTest3{
  public static void main(String[] parameterlist){
    //testing constructors
    Triangle tri1 = new Triangle();
    Triangle tri2 = new Triangle(3.0, 4.0, 5.0);
    Triangle tri3 = new Triangle(tri2);
    //making a triangle to mutate
    Triangle tri4 = new Triangle(tri2);
    //testing mutator
    tri4.mutate_side1(4.0);
    tri4.mutate_side2(2.0);
    tri4.mutate_side3(1.0);
    //testing accessors
    System.out.println("The sides of Triangle 4:");
    System.out.println(tri4.access_side1());
    System.out.println(tri4.access_side2());
    System.out.println(tri4.access_side3());
    //testing validity
    System.out.println("Testing validity of triangle 2:");
    tri2.validityOfTriangle();
    System.out.println("Testing validity of triangle 4:");
    tri4.validityOfTriangle();
    //testing area
    System.out.println("Area of triangle 2 is " + tri2.areaOfTriangle());
    //testing toString
    System.out.println(tri2);
    //testing compareTo
    int check = tri2.compareTo(tri1);
    if (check > 0)
      System.out.println("Triangle 2 is larger");
    else if (check < 0)
      System.out.println("Triangle 1 is larger");
    else
      System.out.println("They are the same size");    
  }
}
  