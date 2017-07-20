public class bubbleClient{
	public static void main(String[] args){
		int[] array = {2,9,5,4,8,1};
		bubbleLibrary.bubbleSort(array);
		bubbleLibrary.printArray(array);
		System.out.println("The minimum value in the array is " + bubbleLibrary.min(array));
		
	}
}
		

/*int[] array1 = {5,2,5,6,6,1};
		int[] array2 = {5,4,2,6,1,6};
		bubbleLibrary.bubbleSort(array1);
		bubbleLibrary.bubbleSort(array2);
		if(bubbleLibrary.equal(array1,array2))
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");
		*\