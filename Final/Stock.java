public class Stock {
  //data members
  private String symbol = "AAAA";
  private double previousClosingPrice = 0.0;
  private double currentPrice = 0.0;
  //constructors
  public Stock(){
  }
  public Stock(String s, double pcp, double p){
    symbol = s;
    previousClosingPrice = pcp;
    currentPrice = p;
  }
  public Stock(Stock s){
    symbol = s.symbol;
    previousClosingPrice = s.previousClosingPrice;
    currentPrice = s.currentPrice;
  }
  //accessor
  public String access_symbol(){
    return symbol;
  }
  public double access_previousClosingPrice(){
    return previousClosingPrice;
  }
  public double access_currentPrice(){
    return currentPrice;
  }
  //mutator
  public void mutate_symbol(String newSymbol){
    symbol = newSymbol;
  }
  public void mutate_previousClosingPrice(double newPCP){
    previousClosingPrice = newPCP;
  }
  public void mutate_currentPrice(double newPrice){
    currentPrice = newPrice;
  }
  //method
  public double gainLossPercent(){
    double difference = currentPrice/previousClosingPrice;
    double percent = difference*100;
    return percent;
  }
  //toString
  public String toString() {
    return "<" + symbol + ", " + previousClosingPrice + ", " + currentPrice + ">";
  }
  public int compareTo(Stock s) {
    if(gainLossPercent() > s.gainLossPercent())
      return 1;
    else if(gainLossPercent() < s.gainLossPercent())
      return -1;
    else
      return 0;
  }
}