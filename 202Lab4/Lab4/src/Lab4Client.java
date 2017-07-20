/*
Test the recursive method factoary in Lab4.java
This code will not run the way it is. You need to complete 
methods in Lab4.java first.
*/

import java.util.*;

public class Lab4Client{
	public static void main(String[] args){
	     // Factorial Test
		System.out.println("1) factorial of 5 is " + Lab4.factorial(5));
		System.out.println("2) factorial of 25 is " + Lab4.factorial(25));
		System.out.println("3) factorial of 255 is " + Lab4.factorial(255));//integer overflow?
		//System.out.println("4) factorial of 2555 is " + Lab4.factorial(2555555));  //Creates a stack overflow
		
		// Power Test
		System.out.println("1) 3 raised to the power of 2 is " + Lab4.power(3,2));
		System.out.println("2) 23 raised to the power of 2 is " + Lab4.power(23,2));
		System.out.println("3) 53 raised to the power of 37 is " + Lab4.power(53,37));	//integer overflow
		
		/*Write code here to test gcd with 
			1.(0, 0)
			2.(0, 1)
			3.(1, 0 )
			4.(5, 3), 		
		*/
                System.out.println("1) gcd of (0,0) is " + Lab4.gcd(0,0));
                System.out.println("2) gcd of (0,1) is " + Lab4.gcd(0,1));
                System.out.println("3) gcd of (1,0) is " + Lab4.gcd(1,0));
                System.out.println("4) gcd of (5,3) is " + Lab4.gcd(5,3));
                System.out.println("5) gcd of (6,4) is " + Lab4.gcd(6,4));
		
		//sumD Test
		System.out.println("1) Sum of 1101 is : "+ Lab4.sumD(1101));
		System.out.println("2) Sum of 211321 is : "+ Lab4.sumD(211321));
		System.out.println("3) Sum of 2147483647 is : "+ Lab4.sumD(2147483647));
		
		
		
		//initialize an unsorted array
                int[] arr = new int[]{9,34,2,15,90,56,44,78,12,23,86}; 
                 Arrays.sort(arr); //sort the array into ascending order
                System.out.println("Sorted Array");
                for (int e: arr) //output the array.
          	System.out.print(e + " ");
                System.out.println(" ");
                
                int pos = Lab4.recursiveBinarySearch(arr,9, 0, arr.length-1);
                if(pos == -1)
                    System.out.println("Number is not in the array");
                else
                    System.out.println("the index of the key 9 is " + pos);
                /*
                 * Extra test methods to check to make sure i can find a key
                 * on both halves of the array and test if a key not on the array
                 * has correct output.
                int pos2 = Lab4.recursiveBinarySearch(arr,86, 0, arr.length-1);
                if(pos2 == -1)
                    System.out.println("Number is not in the array");
                else
                    System.out.println("the index of the key 86 is " + pos2);
                int pos3 = Lab4.recursiveBinarySearch(arr,13, 0, arr.length-1);
                if(pos3 == -1)
                        System.out.println("Number is not in the array");
                else
                    System.out.println("13 should not be in the array");
                    * 
                    */
        }
	 	// Recursive BinarySearch Test
	 	// int pos = Lab4.recursiveBinarySearch(provide arguments here!!!);
	 	/* check if the variable pos is -1, then inform the user that 
	 	   search key was not found, otherwise inform the user that search 
	 	   key was found at position 'pos'.
	 	   Try running this with different search key values.
	 	*/
}
		

/*
Explain the reasons for following outputs.
Factorial Test
3)integer overflow
4)stack overflow

Power Test
3)integer overflow

GCD Test
2)numerator is zero, so the method returns the if statement where a%b = 0, which returns b
3)divisor is 0, so the answer is undefined and in the method I set return to 0 for the undefined answer

*/
