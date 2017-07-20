import java.util.Scanner;

public class arrayClient
{
 public static void main(String[] parameterLists)
 {
  int size = 11;
  int[] someArray = new int[size];
  /*
  //int[] someArray = {3, 88, 17, 45, 38, 7, 99, 13, 21, 25, 74};
  double[] myList = new double[size];
  myList[5] = 99.77;
  myList[10] = 11.22;
  System.out.println(myList);
  arrayLibrary.printArray(myList);
  //System.out.println("This is the maximum " + arrayLibrary.arrayMax(myList));
  double Largest = arrayLibrary.arrayMax(myList);
  System.out.print("This is the maximum ");
  //System.out.println(arrayLibrary.arrayMax(myList));
  System.out.print(Largest);
  System.out.print(". The maximum plus 5 is equal to ");
  System.out.println(Largest + 5.0);
  
  arrayLibrary.printArray(someArray);
  System.out.println("Input 11 Intergers");
  */
  arrayLibrary.getArray(someArray);
  System.out.println("Here are the numbers you entered through the void method");
  arrayLibrary.printArray(someArray);
  /*
  someArray = arrayLibrary.getArray();
  System.out.println("Here are the numbers you entered through the return method");
  arrayLibrary.printArray(someArray);
 */
  

  Scanner input = new Scanner(System.in);
  System.out.println("what number do you want to find");
  int lookingFor = input.nextInt();
  System.out.print("This is equal to the ");
  System.out.print(arrayLibrary.linearSearch(someArray, lookingFor));
  System.out.println(" number entered");
  
  
 }
}