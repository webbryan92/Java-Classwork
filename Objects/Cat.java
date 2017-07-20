import java.util.Date;
import java.text.DateFormat;

public class Cat{
  //Data members
  //file name Cat.java
  private String breed = "tabby";
  private double price = 0;
  private Date dateOfBirth = new Date(50,11,24);
  //Operations
  //Constructors
    //default constructor, provided by Java until we wrote another constructor.
  public Cat(){
  }
    //constructor with parameters
  public Cat(String type){
    breed = type;
  }
  public Cat(String s, double p) {
    breed = s;
    price = p;
  }
    //copy constructor
  public Cat(Cat C){
    breed = C.breed;
    dateOfBirth = C.dateOfBirth;
      
  }
  //Mutators - changes a variable/string
  public void mutate_price(double newPrice) {
    price = newPrice;
  }
  //Accessors - allows acess to private sectors
  public String access_breed() {
   return breed; 
  }
  public double access_price() {
    return price;
  }
  public Date access_dob() {
    return dateOfBirth;
  }
  //specific operations
  
  //display
  public String toString(){
    return "\n\tbreed: " + breed + "\n"
      +"\tDOB:" + DateFormat.getInstance().format(dateOfBirth)
      + "\n\tPrice: " + price;
   }
  public int compareTo(Cat c) {
    if(price > c.price)
      return 1;
    else if(price < c.price)
      return -1;
    else
      return 0;
  }
}