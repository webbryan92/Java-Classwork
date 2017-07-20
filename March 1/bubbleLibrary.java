public class bubbleLibrary{
	public static void bubbleSort(int[] list){
		for(int k = 1; k < list.length; k++){
			for(int i=0; i < list.length-k; i++){
				if(list[i] > list[i+1]){
					int temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
				}
			}
		}
	}
	public static void printArray(int[] Array){
 		for(int i = 0; i < Array.length; i ++)
   		System.out.println(Array[i]);
 	}
	public static int min(int[] array){
		int minvalue;
		if(array[0] < array[array.length-1])
			minvalue = array[0];
		else
			minvalue = array[array.length-1];
	return minvalue;	
	}
	//list1 and List2 are sorted
	public static boolean equal(int[] list1, int[] list2)
	{
		if(list1.length != list2.length)
			return false;
		for(int i = 0; i < list1.length; i++)
			if(list1[i] != list2[i])
				return false;
		return true;
	}
		
}