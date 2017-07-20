import java.util.Scanner;

public class ReverseClient
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Input an interger");
		int number = input.nextInt();
		ReverseLibrary.getReverse(number);
	}
}