import java.util.Scanner;
public class Chapter14Test{
	public static void main(String[] args) {
	
	     Circle obj1 = new Circle();
	     Circle obj2 = new Circle();
	     System.out.println(obj1.equals(obj2));
	     System.out.println(obj1.compareTo(obj2));
    
	     Octagon a1 = new Octagon(5);
	     System.out.println("Area is " + a1.getArea());
	     System.out.println("Perimeter is " + a1.getPerimeter());
	     Octagon a2 = a1.clone();
	     System.out.println("Compare the methods " + a1.compareTo(a2));
	
             // Construct a Triangle, output area and perimeter of it
             Triangle t1 = new Triangle();
             System.out.println("Area is " + t1.getArea());
             System.out.println("Perimeter is " + t1.getPerimeter());
             
             Scanner input = new Scanner(System.in);
             double x;
             double y;
             double z;             
             do {
                 System.out.println("Enter new inputs");
                 System.out.println("input x");
                 x = input.nextDouble();
                 System.out.println("input y");
                 y = input.nextDouble();
                 System.out.println("input z");
                 z = input.nextDouble();             
             } while((x+y > z && x+z > y && y+z > x) == false);
             Triangle t2 = new Triangle(x,y,z);
             System.out.println("Area is " + t2.getArea());
             System.out.println("Perimeter is " + t2.getPerimeter());
             // Demonstrate Triangle comparison and cloning here	     
             Triangle t3 = t1.clone();
             System.out.println("Compare the triangles t3 and t1 " + t3.compareTo(t1));
             System.out.println("Compare the triangles t2 and t1 " + t2.compareTo(t1));
             System.out.println("Compare the triangles t1 and t2 " + t1.compareTo(t2));

	     GeometricObject[] geo = new GeometricObject[10];
             double A = Math.random();
             double B = Math.random();
             double C = Math.random();
	     for (int i = 0; i < geo.length; i++){
	     	if (Math.random() > 0.66)  // extend the code to add Triangles to array geo.Each object should have a 33% of chance of getting added
	           geo[i] = new Circle(Math.random());
                else if (Math.random() < 0.33){
                    while((A+B > C && A+C > B && B+C > A) == false){
                        A = Math.random();
                        B = Math.random();
                        C = Math.random();              
                    }
                   geo[i] = new Triangle(A, B, C);
                }
	     	else
	     	   geo[i] = new Octagon(Math.random());
	     }
	     
	     for (int i = 0; i < geo.length; i++){
	     	System.out.println("Object being processed belongs to class "+ geo[i].getClass());
	     	if (geo[i] instanceof Circle) // extend the code to check if an object in the array is a Triangle. Output a message if it is.
	     	   System.out.println("Confirming Object as a Circle");
                else if(geo[i] instanceof Triangle)
                    System.out.println("Confirming Object as a Triangle");
	     	else 
	     	   System.out.println("Confirming Object as an Octagon");
	     }
	     
	     System.out.println("Output 5th element using toString method " + geo[4]);
	     
  	}


}
