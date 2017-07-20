import java.util.Scanner;

public class StringFindClient{
  public static void main(String[] parameters){
    Scanner input = new Scanner(System.in);
    System.out.println("Input a string");
    String words = input.nextLine();
    System.out.println("Input a letter");
    String letter = input.nextLine();
    char letterchar = letter.charAt(0);
    System.out.println("There are " + StringLibrary.count(words, letterchar) 
                         + " occurances of " + letterchar);
  }
}
    