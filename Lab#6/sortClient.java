import java.util.Scanner;

public class sortClient
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("How many students are there?");
		int studentnum = input.nextInt();
		String[] StudentNames = new String[studentnum];
		int[] StudentGrades = new int[studentnum];
		sortLibrary.scoreInput(studentnum, StudentNames, StudentGrades);
		sortLibrary.gradeSort(StudentGrades, StudentNames);
		System.out.println(" ");
		System.out.println("Here are the grades in acending order");
		System.out.println("_____________________________________");
		sortLibrary.printArray(StudentNames, StudentGrades);
	}
}