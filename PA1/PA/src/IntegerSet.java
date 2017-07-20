/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rywebb
 */
public class IntegerSet {

    private boolean[] array;
    /*pre
     * post: empty set of all false values
     */

    public IntegerSet() {
        // no-argument costructor initializes an empty set of all false values
        array = new boolean[20];
    }
    /*pre: recieves arrray of type int
     * post: creates boolean array that lists true at the indexes 
     * given by the int array
     */

    public IntegerSet(int[] ar) {
        /* constructor recieves the array of intergers and generates 
         * an integerset using the input
         */
        array = new boolean[20];
        for (int i = 0; i < array.length; i++) {
            array[ar[i]] = true;
       // passes the interger array into the boolean array using the indexes.
        }
    }
    /*pre: recieves two integerSets to be merged
     * post: creates a union of both integerSets with the values of both
     */

    public IntegerSet unionOfIntegerSets(IntegerSet S2) {
        IntegerSet set3;
        set3 = new IntegerSet();
        for (int i = 0; i < set3.array.length; i++) 
            /*calls array length instead of length of the object
         */ {
            set3.array[i] = this.array[i] || S2.array[i];
            /* if either value is true array value will be set to true 
             * false+false = false true+false = true
             * */
        }
        return set3;

    }
    /*pre: recieves two integerSets to be intersected
     * post: increates an array of the intersection of two integerSets
     */

    public IntegerSet interSectionOfIntegerSets(IntegerSet S2) {
        IntegerSet set4;
        set4 = new IntegerSet();
        for (int i = 0; i < set4.array.length; i++) {
            set4.array[i] = this.array[i] && S2.array[i];
        }
        return set4;
    }
    /* pre: recieves an integerSet and an integer
     * post: adds integer to the integerSet
     */

    public boolean insertElement(int k) {
        if (k < 0 || k > 19) {
            return false;
        }
        array[k] = true;
        return true;
    }
    /* pre: recieves an integerSet and an integer
     * post: removes an integer from the integerSet
     */

    public boolean deleteElement(int m) {
        if (m < 0 || m > 19) {
            return false;
        }
        array[m] = false;
        return true;
    }
    /* pre: IntegerSet values
     * Post: String of the indexes
     * creates a string of the indexes of integerSet where the index is true
     */

    public String toString() {
        String integerValues = "";
        for (int i = 0; i < array.length; i++) {
            if (this.array[i]) {
                integerValues += Integer.toString(i) + " ";
            }
        }
        return integerValues;
    }
    /* pre: two integerSets
     * post: returns true if both integerset values are true or false if they 
     * are not
     */

    public boolean equals(IntegerSet S2) {
        for (int i = 0; i < array.length; i++) {
            if (this.array[i] != S2.array[i]) {
                return false;
            }
        }
        return true;
    }
}
