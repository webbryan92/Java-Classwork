import java.util.Scanner;

public class ClientTest1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double Kilograms;
		System.out.println("Input starting kilograms");
		double KiloAmount = input.nextDouble();
		System.out.println("___________________________");
		System.out.println("Kilograms" + "\t" + "Pounds");
		System.out.println("___________________________");
		for(Kilograms = KiloAmount; Kilograms <= 200; Kilograms = Kilograms + 2)
		{
			System.out.printf("%3.0f \t    %10.1f\n", Kilograms, conversionLibrary.poundFind(Kilograms));
		}
		
	}
}
				