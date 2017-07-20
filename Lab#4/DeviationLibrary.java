import java.util.Scanner;

public class DeviationLibrary
{
	public static double[] getArray()
	{
		double[] DevBatch = new double[10];
  		Scanner input = new Scanner(System.in);
  		for(int i = 0; i < DevBatch.length; i++)  
		{
			System.out.print((i+1)+ "-Enter number->  ");
   			DevBatch [i] = input.nextDouble();
		}
		return DevBatch;
  	}
	public static double mean(double[] array){
		double numerator = 0;
		for(int i = 0; i < array.length; i++)
		{
			numerator += array[i];
		}
		double mean = (numerator/array.length);
		return mean;
	}
	public static double StandardDeviation(double[] array){
		double numerator = 0;
		for(int i = 0; i < array.length; i++)
		{
			numerator += (array[i] - mean(array))*(array[i] - mean(array));
		}
		double StDev = Math.sqrt((numerator)/9);
		return StDev;
	}
		
}