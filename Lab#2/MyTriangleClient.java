import java.util.Scanner;
public class MyTriangleClient {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double side1, side2, side3, area;
//input side 1
		System.out.println("Input first side");
		side1 = input.nextDouble();
//input side 2
		System.out.println("Input second side");
		side2 = input.nextDouble();
//input side 3
		System.out.println("Input three side");
		side3 = input.nextDouble();
//is it valid
		boolean isValid;
		isValid = MyTriangle.isValid(side1, side2, side3);
		if(isValid == true) {
			area = MyTriangle.area(side1, side2, side3);
			System.out.println("The area is " + area);
		}
		else {
			
		}
	}
}
			


		
		