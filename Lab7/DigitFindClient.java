import java.util.Scanner;

public class DigitFindClient{
  public static void main(String[] parameters){
    Scanner input = new Scanner(System.in);
    System.out.println("Input a string");
    String words = input.nextLine();
    int[] digitValues = new int[10];
    digitValues = DigitLibrary.count(words);
    DigitLibrary.printArray(digitValues);
    
  }
}