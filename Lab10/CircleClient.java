public class CircleClient {
  public static void main(String[] parameterlist)throws Exception{
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
    System.out.println(circle1.diameter());
    System.out.println(circle2.diameter());
    System.out.println(circle3.diameter());
    System.out.println("Area");
    System.out.println(circle1.area());
    System.out.println(circle2.area());
    System.out.println(circle3.area());
    System.out.println("Circumference");
    System.out.println(circle1.circumference());
    System.out.println(circle2.circumference());
    System.out.println(circle3.circumference());
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
    System.out.println("Array of circles");
    CircleLibrary.printArray(arrayOfCircles);
    CircleLibrary.bubblesort(arrayOfCircles);
    System.out.println("Bubble sorted array of circles from above");
    CircleLibrary.printArray(arrayOfCircles);
    
    double[] arrayradius = new double[5];
    CircleLibrary.getArrayFromFile(arrayradius);
    Circle[] circlesFromFile = CircleLibrary.getArray(arrayradius);
    System.out.println("Circles from file");
    CircleLibrary.printArray(circlesFromFile);
  }
}