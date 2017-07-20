public class Triangle{
  private double side1 = 1.0;
  private double side2 = 1.0;
  private double side3 = 1.0;
  
  //defualt
  public Triangle() {
  }
  //parameters
  public Triangle(double s1, double s2, double s3){
    side1 = s1;
    side2 = s2;
    side3 = s3;
  }
  //copy
  public Triangle(Triangle T) {
    side1 = T.side1;
    side2 = T.side2;
    side3 = T.side3;
  }
  //mutators
  public void mutate_side1(double s1) {
    side1 = s1;
  }
  public void mutate_side2(double s2) {
    side2 = s2;
  }
  public void mutate_side3(double s3) {
    side3 = s3;
  }
  //accessors
  public double access_side1() {
    return side1;
  }
  public double access_side2() {
    return side2;
  }
  public double access_side3() {
    return side3;
  }
  public boolean validityOfTriangle() {
  if(((side1 + side2) > side3) && ((side1 + side3) > side2) && ((side2 + side3) > side1)) {
   System.out.println("The Triangle is Valid");
   return true;
  }
  else {
   System.out.println("The Triangle is Invalid");
   return false;
   }
  }
  public double areaOfTriangle() {
    double s = (side1 + side2 + side3)/2;
    double area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
    return area;
  }  
  public String toString(){
    return "Side1: " + side1 
      + "\nSide2: " + side2
      + "\nSide3: " + side3;
  }
  public int compareTo(Triangle t) {
    if(areaOfTriangle() > t.areaOfTriangle())
      return 1;
    else if(areaOfTriangle() < t.areaOfTriangle())
      return -1;
    else
      return 0;
  }
}