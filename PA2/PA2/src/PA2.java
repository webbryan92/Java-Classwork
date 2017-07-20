/* Ryan Webb
Personal Assignment 2
Purpose of the program:  The program creates two methods, KSmallest and 
* Partition.  Partition finds the sorted index of the pivot for the algorithm.
* and the indexes above and below the pivot are lower to the left or greater
* to the right of the pivot.  The KSmallest method recursively calls KSmallest
* to keep calling the Parition method and shrinking the search space until
* the sorted index k is found and returned.  This way you can search for an
* index in a paritioned array without having to finish the sort for the whole 
* array.
* 
(provide a small description about the program. You can get this from the
problem statement in the book.)
*/

/**
 *
 * @author Ryan
 */
public class PA2 {
    //main method to test the KSmallest and Partition method

    public static void main(String[] args) {
        /*initialize the methods in the class for PA2 so they can be used in
         static context*/
        PA2 p = new PA2();
        /*initialize the string smallest*/
        String smallest;
        /*An array of string to be sorted and searched.*/
        String[] Array = {"fish", "fish", "fish", "chips", "fish and chips"};
        /*String[] Array = {"multiple", "threats", "access", "merely", 
         "functions", "impassable", "independant", "primates", "operations", 
         "travels"};*/
        /*String[] Array = {"abcde", "abcdefg", "abcde", "a", 
         * "abc", "abcdef", "ab"};*/

        /*Test the KSmallest method using String smallest to hold the value
         returned by KSmallest*/
        smallest = p.KSmallest(Array, 0, Array.length - 1, 0);
        System.out.println("The 1st smallest string is:");
        System.out.println(smallest);
        smallest = p.KSmallest(Array, 0, Array.length - 1, 2);
        System.out.println("The 3rd smallest string is:");
        System.out.println(smallest);
        smallest = p.KSmallest(Array, 0, Array.length - 1, 4);
        System.out.println("The 5th smallest string is:");
        System.out.println(smallest);
        smallest = p.KSmallest(Array, 0, Array.length - 1, 11);
        System.out.println("The 12th smallest string is:");
        System.out.println(smallest);
        smallest = p.KSmallest(Array, 0, Array.length - 1, 8);
        System.out.println("The 9th smallest string is:");
        System.out.println(smallest);
    }
    /*
     * Pre:An array of strings with the first index and last and the index of 
     * what position you want to be searched.
     * Post:Returns the contents(a string) of the 1st 2nd 3rd...N'th smallest 
     * index in an array of strings.
     */

    public String KSmallest(String[] Array, int first, int last, int k) {
        /*Determine the last index of the array*/
        int N = Array.length;
        //int N = Array.length-1; incorrect assignment for int N
        
        /*test to make sure the index to be returned is now out of bounds of 
         * the array and that the array is longer than zero*/
        if (0 <= k && k < N && N > 0) {
          /*Partitions the items of Array[first...last] about pivotIndex 
           * into leftArray and rightArray Such that all elements in 
           * leftArray<=pivorValue and all elements in rightArray>pivotValue
           */
            int pivotIndex = Partition(Array, first, last);
          /*If the key k is equal to the pivot index return the contents of
           the array at that index, the partition method will sort the array
           so that the index of the pivot is at the proper place in the array
           regardless of the location of the parts of the rest of the array*/
            if (k == pivotIndex) {
                return Array[k];
            }/*Recursively calls KSmallest searching only the contents
           before the pivot since the pivot index is greater than the key
           and must be sorted again since all items less than pivotIndex are
           smaller */ else if (k < pivotIndex) {
                return KSmallest(Array, first, pivotIndex - 1, k);
            } /* same as above except it only searches elements greater than 
             * pivot index to find the K
             */ else {
                return KSmallest(Array, pivotIndex + 1, last, k);
            }
        }
       /*returns null if one of the conditions for the if statement isn't met
         * that would cause an exception*/ else {
            return null;
        }
    }
    /*
     * Pre:An array of strings and a first and last index to be searched.
     * Post:Return the index of pivot in the array.
     */

    public int Partition(String[] list, int first, int last) {
        String pivot = list[first];
        /*Sets the low to be one above the first to start the comparison 
         * process.
         */
        int low = first + 1;
        int high = last;


        while (high > low) {
            /*If low is less than high and greater than pivot, inciment low 
             additively.
             Searches the low value compared to pivot*/
            while (low <= high && list[low].compareTo(pivot) <= 0) {
                low++;
            }
            /*If low is less than high and high is greater than the pivot 
             decrease the incriment of high
             Searches the high value compared to pivot*/
            while (low <= high && list[high].compareTo(pivot) > 0) {
                high--;
            }
            /*Swaps high with low if high is greater than low*/
            if (high > low) {
                String temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }
        /*If high is greater than OR EQUAL TO pivot first and greater than 
         * pivot, decrease the incriment of pivot*/
        while (high > first && list[high].compareTo(pivot) >= 0) {
            high--;
        }
        /*If the pivot is greater than high, swap the first with high.
         Then make the value at high equal pivot and return high.*/
        if (pivot.compareTo(list[high]) > 0) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } /* return first if pivot is less than or equal to high*/ else {
            return first;
        }
    }
}
/*
 * Output1:
 * String[] Array = {"multiple", "threats", "access", "merely", 
 "functions", "impassable", "independant", "primates", "operations", 
 "travels"};
 The 1st smallest string is:
 access
 The 3rd smallest string is:
 impassable
 The 5th smallest string is:
 merely
 The 12th smallest string is:
 null
 The 9th smallest string is:
 threats
 */
/*
 * Output2:
 * String[] Array = {"abcde", "abcdefg", "abcde", "a", "abc", "abcdef", "ab"};
 The 1st smallest string is:
 a
 The 3rd smallest string is:
 abc
 The 5th smallest string is:
 abcde
 The 12th smallest string is:
 null
 The 9th smallest string is:
 null
 */
/*
 * Output3:
 * String[] Array = {"fish", "fish", "fish", "chips", "fish and chips"};
 The 1st smallest string is:
 chips
 The 3rd smallest string is:
 fish
 The 5th smallest string is:
 null
 The 12th smallest string is:
 null
 The 9th smallest string is:
 null
 * Will return null as fifth smallest even though there are 5 items in the 
 *array because k must be greater than N which is array.length-1
 * in this case k = 4 and N = 4 so I learned I didnt need to 
 * take array.length()-1 because the if statment accomodated the fact that k
 * has to be 1 less than the length.
 */

/*
 * Output4: With N length fixed
 * String[] Array = {"fish", "fish", "fish", "chips", "fish and chips"};
 The 1st smallest string is:
 chips
 The 3rd smallest string is:
 fish
 The 5th smallest string is:
 fish and chips
 The 12th smallest string is:
 null
 The 9th smallest string is:
 null
 */
