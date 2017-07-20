import java.util.Scanner;

public class CircleLibrary {
  public static void printArray(Circle[] circle){
    for(int i = 0; i<circle.length;i++){
      System.out.println(circle[i]);
    }
  }
  public static void printArray(double[] radius) {
    for(int i = 0; i < radius.length; i++)
      System.out.println(radius[i]);
  }
  public static double[] getArray()
  {
    double[] radius = new double[5];
    Scanner input = new Scanner(System.in);
    for(int i = 0; i < radius.length; i++) {
      System.out.println("Enter Radius[" + i + "]:");
      radius[i] = input.nextDouble();
    }      
    return radius;
  }
  public static Circle[] getArray(double[] r){
    Circle[] circlearray = new Circle[5];
    for(int i = 0; i < r.length; i++){
      circlearray[i] = new Circle(r[i]);
    }
    return circlearray;
  }
}
  