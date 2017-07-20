import java.util.Scanner;

public class sortLibrary
{
	public static void scoreInput(int studentnum, String[] name, int[] score)
	{
		for(int i = 0; i < studentnum; i++)
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Insert Student name #" + (i+1));
			name[i] = input.nextLine();
			System.out.println("Insert Student Grade for #" + (i+1));
			score[i] = input.nextInt();
		}
	}
	public static void gradeSort(int[] score, String[] name){
		for(int k = 1; k < score.length; k++){
			for(int i=0; i < score.length-k; i++){
				if(score[i] < score[i+1]){
					int temp = score[i];
					score[i] = score[i+1];
					score[i+1] = temp;
					String tempname = name[i];
					name[i] = name[i+1];
					name[i+1] = tempname;
				}
			}
		}
	}
	public static void printArray(String[] Array2, int[] Array){
 		for(int i = 0; i < Array.length; i ++)
   		System.out.println(Array2[i] + " has a grade of " +Array[i]);
	}
}

