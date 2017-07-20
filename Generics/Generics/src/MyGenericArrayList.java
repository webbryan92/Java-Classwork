public class MyGenericArrayList <E> {

	private E[] array;
	private static final int CAPACITY = 10; // initial capacity of the array
	private int size; // number of elements in the array
	
	
	public MyGenericArrayList(){
		/*can NOT use array = new E[CAPACITY]; 
		  Rule: Generic array creation is not allowed!!!
		  Getting around the rule: 
		  Create and array of Objects and cast the 
		  array of Objects to an array of Generic Type E.
		  You will get a compiler warning!!!
		*/
		array = (E[])new Object[CAPACITY];
		size = 0;
		
	}
	
	//add element e to current empty location. increase capacity if array is full
	public void addElement(E e){
		if (isFull()){
			E[] temparray = (E[])new Object[array.length+CAPACITY]; 
			for (int i = 0; i < array.length; i++)
				temparray[i] = array[i];
			array = temparray;	
		}			
		array[size] = e;
		size++;
	}
	
	
	/*
	Rule: illegal to refer to a generic type parameter
	for a class in a static method. Following is not allowed.
	
	public static int findElement(E e)
	
	Getting around the rule: Create non-static methods!!!
	Another reason not to write static methods!!!
	*/	
	
	//search for element el, returns index if found, otherwise -1
	public int findElement(E el){
		for (int i = 0; i<size; i++)
			if ( array[i] == el)
				return i;
		return -1;
	}
	
	//return the element at index i
	public E getElement(int i){
		if (i>=0 && i<size)
			return array[i];
		else
			return null;	
     }	
     
     public boolean isFull(){
     	return size == array.length;	
	}
	
	// remove the element at index i, returns the element that is being removed
	public E removeElement(int i){
		if (i>=0 && i<size){
			E e =  array[i];
			for (int j = size; j<size-1; j++)
				array[j] = array[j+1];
			size--;
			return e;
		}
		else
			return null;
	
	}
	
	//returns a String representation of this list.
	public String toString(){
		String s = new String();
		for (int i = 0; i<size; i++)
			s=s.concat(array[i]+" ");
		return s;
	}
	
}	

	
	
