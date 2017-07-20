import java.util.Scanner;
public class client3 {
	public static void main(String[] parameterlist) {
		Scanner input = new Scanner(System.in);
		int yipes, sanford;
//input number 1
		System.out.println("what is the number?");
		yipes = input.nextInt();
		System.out.println("I have " + yipes + " cans of salty pringles, where yo curly moustache at?");
//input number 2
		System.out.println("what is the number?");
		sanford = input.nextInt();
		System.out.println("I have " + sanford + " curly moustache's.");
//adding two numbers
		ryanlibrary.addtwonumbers(yipes,sanford);
	}
}