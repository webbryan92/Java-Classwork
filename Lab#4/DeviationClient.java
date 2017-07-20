public class DeviationClient
{
	public static void main(String[] parameterlist)
	{
		double[] numbers = new double[10];
		System.out.println("Enter ten numbers:");
		numbers = DeviationLibrary.getArray();
		System.out.println("The mean is " + DeviationLibrary.mean(numbers));
		System.out.println("The standard deviation is " + DeviationLibrary.StandardDeviation(numbers));
	}
}