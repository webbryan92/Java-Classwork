import java.util.Arrays;


public class StringClient{
  public static void main(String[] args)throws Exception{
    int number = 0;
    //clock bs007 = 604;
    String name = ("Logan, Bobby, Tim, James, Bryan, Bill, Talisha, Steve, Matt, Kelly");
    boolean isEqual;
    double[] scores = new double[10];
    System.out.println("My name is " + name);
    String[] names = new String[10];
    String message = new String("How are you today?");
    String message2 = new String();
    System.out.println(name + " is doing wonderful.");
    isEqual = message.equals(name);
    System.out.println("The two strings are equal is " + isEqual);
    name.endsWith("ani");
    System.out.println(name.endsWith("ani"));
    names = name.split(", ");
    arrayLibrary.printArray(names);
    arrayLibrary.getArrayFromFile(scores);
    arrayLibrary.printArray(scores);
    arrayLibrary.getArrayFromFile(names);
    arrayLibrary.printArray(names);
  }
}