public class StockClient {
  public static void main(String[] parameterlist)throws Exception{
    //Testing Constructors
    System.out.println("Testing constructors and toString");
    Stock stock1 = new Stock();
    Stock stock2 = new Stock("ABCD", 5.0, 7.5);
    Stock stock3 = new Stock(stock2);
    Stock stock4 = new Stock(stock3);
    //Testing toString
    System.out.println(stock1);
    System.out.println(stock2);
    System.out.println(stock3);
    //Testing Accessors
    System.out.println("Testing accessors");
    System.out.println(stock2.access_symbol());
    System.out.println(stock2.access_previousClosingPrice());
    System.out.println(stock2.access_currentPrice());
    //Testing Mutators
    System.out.println("Testing mutators");
    stock4.mutate_symbol("ZZZZ");
    stock4.mutate_previousClosingPrice(2.2);
    stock4.mutate_currentPrice(4.4);
    System.out.println(stock4);
    //Testing Method gainLossPercent
    System.out.println("Testing gainLossPercent");
    System.out.println("Stock 4 increased by " + stock4.gainLossPercent() + "%");
    //Testing compareTo
    System.out.println("Testing compareTo");
    int check = stock2.compareTo(stock4);
    if (check > 0)
      System.out.println("Stock1 had greater rate of change.");
    else if (check < 0)
      System.out.println("Stock2 had greater rate of change.");
    else
      System.out.println("They had same rate of change.");
    
    //pulling stock info from files
    System.out.println("Pulling stock info from files");
    String[] symbols = new String[7];
    StockLibrary.readStockCollectionFromFile(symbols);
    double[] prevClosingPrices = new double[7];
    StockLibrary.readStockCollectionFromFile(prevClosingPrices);
    Stock[] stocksFromFile = StockLibrary.getArray(symbols, prevClosingPrices);
    StockLibrary.printArray(stocksFromFile);
    //adding in current price to stock info from files
    System.out.println("Adding in current price to stock info from files");
    StockLibrary.setCurrentPrice(stocksFromFile);
    StockLibrary.printArray(stocksFromFile);
    //using the Trend
    System.out.println("Testing Trend");
    StockLibrary.trend(stocksFromFile);
    StockLibrary.printArray(stocksFromFile);
  }
}