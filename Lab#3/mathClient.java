public class mathClient
{
	public static void main(String[] args)
	{
		double sqrtNum;
		System.out.println("Number" + "\t" + " " + "SquareRoot");
		for(sqrtNum = 0; sqrtNum <= 20; sqrtNum = sqrtNum + 2)
		{
			System.out.printf("%-2.0f \t %10.4f\n", sqrtNum, mathLibrary.sqrtFind(sqrtNum));
		}
		
	}
}
				