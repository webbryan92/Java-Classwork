import java.util.Arrays;

public class bubbleInequalClient
{
	public static void main(String[] args)
	{
		int i = 0;
		int[] randnumber = new int[30];
		while(i < randnumber.length){
			int num = 1 + (int)(Math.random()*100);
			boolean distinct = true;
			for(int j = 0; j < i && distinct; j++)
				if(randnumber[j] == num)
					distinct = false;
			if(distinct)
			{
				randnumber[i]=num;
				i++;
			}
		}
		System.out.println(Arrays.toString(randnumber));		
	}
}