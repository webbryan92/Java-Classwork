// Recursive method factory.

public class Lab4 {

    public static int factorial(int N) {
        if (N == 1) {
            return 1;
        } else {
            return N * factorial(N - 1);
        }
    }

    public static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        } else if (exp == 1) {
            return base;
        } else {
            return base * power(base, exp - 1);
        }
    }

    public static int gcd(int a, int b) {
        if(b == 0)
            return 0;
        if (a % b == 0) {
            return b;
        } 
        else {
            return gcd(b, a%b);
        }
    }

    public static int sumD(int N) {
        if (N == 0) {
            return 0;
        } else {
            return N%10 + sumD(N / 10);
        }
    }

    public static int recursiveBinarySearch(int Array[], int key, int first, int last) {
        /*
         * base case
         * 
         * if the key isnt found in the array
         */
        if (first > last){ 
            return -1;              
        }
        /*
         * find middle index of search by adding the first and last index and dividing by two
         */
        int mid = (first + last) / 2;
        for(int i = first;i<=last; i++){ //output the array.
          	System.out.print(Array[i] + " ");
        }
        System.out.println("  First:" + first + " Mid:"+ mid + " Last:" + last);
        
        /*
         * if the value at the midpoint array is greater than the search key
         * returns the recursiveBinarySearch with the first index being the same
         * while the last index is the middle index minus 1
         */
        if (Array[mid] > key) 
            return recursiveBinarySearch(Array, key, first, mid - 1);
        /*
         * if the value at the midpoint of the array is lesser than the search key
         * returns the recursiveBinarySearch method with the last index being the same
         * while the first index is the middle index plus 1
         */
        else if (Array[mid] < key) 
            return recursiveBinarySearch(Array, key, mid + 1, last);
        /*
         * if the value of the mid is the same as the key, mid is returned.
         */
        else 
            return mid;
    }

        
}
    /*
     * Implement a method to perform recursiveBinarySearch. This is given in
     * item 5 of the Lab3.pdf. When you are done writing with this method,
     * complete the "Recursive BinarySearch Test" section in Lab3Client program.
     * Run the Lab3Client and verify that this method works properly. Finally,
     * complete the item 6 in the Lab3 instruction document(require code change
     * here).
     */

