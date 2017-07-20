import java.util.Scanner;
import java.io.File;

public class StockLibrary {
  public static void readStockCollectionFromFile(String[] x)throws Exception{
    File stocks = new File("stocks.txt");
    Scanner myscanner = new Scanner(stocks);
    for(int i = 0; i < x.length; i++){
      x[i] = myscanner.nextLine();
    }
   myscanner.close();
  }
  public static void readStockCollectionFromFile(double[] x)throws Exception{
    File PCPs = new File("PCPs.txt");
    Scanner myscanner = new Scanner(PCPs);
    for(int i = 0; i < x.length; i++){
      x[i] = myscanner.nextDouble();
    }
   myscanner.close();
  }
  public static Stock[] getArray(String[] s, double[] d){
    Stock[] stockarray = new Stock[7];
    for(int i = 0; i < s.length; i++){
      stockarray[i] = new Stock(s[i],d[i],0);
    }
    return stockarray;
  }
  public static Stock[] setCurrentPrice(Stock[] s){
    Scanner input = new Scanner(System.in);
    for(int i = 0; i < s.length; i++)
    {
      System.out.print((i+1)+ "-Enter number->  ");
      s[i] = new Stock(s[i].access_symbol(), s[i].access_previousClosingPrice(), input.nextDouble());
    }
    return s;  
  }
  public static void trend(Stock[] s){
    for(int k=1; k < s.length; k++){
      for(int i=0; i < s.length -k; i++){
        if(s[i].compareTo(s[i+1]) > 0){
          Stock temp = s[i];
          s[i] = s[i + 1];
          s[i+1] = temp;
        }
      }
    }
  }
  public static void printArray(Stock[] stock){
    for(int i = 0; i<stock.length;i++){
      System.out.println(stock[i]);
    }
  }
}
