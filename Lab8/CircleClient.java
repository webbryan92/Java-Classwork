public class CircleClient {
  public static void main(String[] parameterlist){
    Circle circle1 = new Circle();
    Circle circle2 = new Circle(5.5);
    Circle circle3 = new Circle(circle2);
    circle3.mutate_radius(6);
    circle3.access_radius();
    System.out.println("Radius");
    System.out.println(circle1);
    System.out.println(circle2);
    System.out.println(circle3);
    System.out.println("Diameter");
    CircleLibrary.printDiameter(circle1);
    CircleLibrary.printDiameter(circle2);
    CircleLibrary.printDiameter(circle3);
    System.out.println("Area");
    CircleLibrary.printArea(circle1);
    CircleLibrary.printArea(circle2);
    CircleLibrary.printArea(circle3);
    System.out.println("Circumference");
    CircleLibrary.printCircumference(circle1);
    CircleLibrary.printCircumference(circle2);
    CircleLibrary.printCircumference(circle3);
    int check = circle1.compareTo(circle2);
    if (check > 0)
      System.out.println("circle1 is larger");
    else if (check < 0)
      System.out.println("circle2 is larger");
    else
      System.out.println("They are equal in size");
    double[] radius = CircleLibrary.getArray();
    CircleLibrary.printArray(radius);
    Circle[] arrayOfCircles = CircleLibrary.getArray(radius);
  }
}