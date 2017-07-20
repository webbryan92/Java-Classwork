import java.util.Scanner;

public class clientRyan {
	public static void main(String[] args) {
		double salesAmount;
/*
		System.out.println("What is the Sales Amount?");
		Scanner input = new Scanner(System.in);
		salesAmount = input.nextDouble();
		System.out.println("Your Commission from $" + salesAmount + " is $" + CommissionLibrary.computeCommission(salesAmount));
*/
	System.out.println("_________________________________");
	System.out.println("Sales Amount" + "  " + "Comission");
	System.out.println("_________________________________");
	System.out.println();
	for (salesAmount = 10000; salesAmount <= 100000; salesAmount = salesAmount + 5000)
		System.out.printf("%10.2f  %10.2f\n",salesAmount, CommissionLibrary.computeCommission(salesAmount));
		}
	}