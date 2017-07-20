public class ReverseLibrary
{
	public static void getReverse(int Input)
	{
		int Remainder;
		while(Input != 0)
		{
			Remainder = Input%10;
			Input = Input/10;
			System.out.print(Remainder);
		}
	}
}

	
		