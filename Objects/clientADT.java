import java.util.Date;

public class clientADT{
  public static void main(String[] parameterlist){
    
    Cat[] arrayofcats = new Cat[5];
    double[] price = new double[5];
    price = LibraryADT.getArray();
    LibraryADT.printArray(price);
    
    /*
    Cat Todd = new Cat();//uses default constructor
    Cat Snowball = new Cat("siamese");//uses constructor with parameters
    Cat Max = new Cat(Todd);//uses copy constructor
    Cat Waffle = new Cat("norwegian forest cat", 175.00);
    Cat Chandi = new Cat("siamese", 175.00);
    
    int check;
    
    System.out.println("Todd: " + Todd);
    System.out.println("Snowball:" + Snowball);
    System.out.println("Max:" + Max);
    System.out.println("Waffle" + Waffle);
    System.out.println("Chandi" + Chandi);
    check = Chandi.compareTo(Waffle);
    if (check > 0)
      System.out.println("Chandi is more expensive");
    else if (check < 0)
      System.out.println("Waffle is more expensive");
    else
      System.out.println("Waffle is just as expensive as Chandi");
    */
  }
}