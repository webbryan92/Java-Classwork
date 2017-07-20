import java.util.Scanner;

public class LibraryADT { 
  public static void printArray(double [] price) {
    for(int i = 0; i < price.length; i++){
      System.out.println(price[i]);
    }
  }
  public static double[] getArray()
  {
    double[] price = new double[5];
    Scanner input = new Scanner(System.in);
    for(int i = 0; i < price.length; i++) {
      System.out.println("Enter Price[" + i + "]:");
      price[i] = input.nextDouble();
    }      
    return price;
  }
  public static Cat[] getArray(double[] p){
    Cat[] kitty = new Cat[5];
    for(int i = 0; i < p.length; i++){
      //kitty = new Cat(p[i]);
    }
    return kitty;
  }
   public static void printArray(Cat[] meow){
    for(int i = 0; i<meow.length;i++){
      System.out.println(meow[i]);
    }
  }
  public static void bubblesort(Cat[] list){
    for(int k=1; k < list.length; k++){
      for(int i=0; i < list.length -k; i++){
        if(list[i].compareTo(list[i+1]) > 0){
        //if(list[i] > list[i + 1]){
          Cat temp = list[i];
          list[i] = list[i + 1];
          list[i+1] = temp;
        }
      }
    }
  }

}