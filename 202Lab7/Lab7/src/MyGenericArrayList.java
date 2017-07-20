/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rywebb
 */
public class MyGenericArrayList<E> {

    private E[] array;
    private static final int CAPACITY = 10; // initial capacity of the array
    private int size; // number of elements in the array

    public MyGenericArrayList() {
        /*
         * can NOT use array = new E[CAPACITY]; Rule: Generic array creation is
         * not allowed!!! Getting around the rule: Create and array of Objects
         * and cast the array of Objects to an array of Generic Type E. You will
         * get a compiler warning!!!
         */
        array = (E[]) new Object[CAPACITY];
        size = 0;

    }

    //add element e to last empty location. increase capacity if array is full
    public void addLast(E e) {
        if (isFull()) {
            E[] temparray = (E[]) new Object[array.length + CAPACITY];
            for (int i = 0; i < array.length; i++) {
                temparray[i] = array[i];
            }
            array = temparray;
        }
        array[size] = e;
        size++;
    }

    /*
     * Rule: illegal to refer to a generic type parameter for a class in a
     * static method. Following is not allowed.
     *
     * public static int findElement(E e)
     *
     * Getting around the rule: Create non-static methods!!! Another reason not
     * to write static methods!!!
     */
    //search for element el, returns index if found, otherwise -1
    public int findElement(E el) {
        for (int i = 0; i < size; i++) {
            if (array[i] == el) {
                return i;
            }
        }
        return -1;
    }

    //return the element at index i
    public E getElement(int i) {
        if (i >= 0 && i < size) {
            return array[i];
        } else {
            return null;
        }
    }

    public boolean isFull() {
        return size == array.length;
    }

    // remove the element at index i, returns the element that is being removed
    public E removeElementAt(int i) {
        if (i >= 0 && i < size) {
            E e = array[i];
            for (int j = i; j < size; j++) {
                array[j] = array[j + 1];
            }
            size--;
            return e;
        } else {
            return null;
        }
    }

    //returns a String representation of this list.
    public String toString() {
        String s = new String();
        for (int i = 0; i < size; i++) {
            s = s.concat(array[i] + " ");
        }
        return s;
    }

    /*
     * Implement the following methods
     */
    /*
     * Removes all of the elements from this list
     */
    public void clear() {
        size = 0;
    }

    /**
     * Element e is added to the position i of this list
     */
    public void addAt(E e, int i) {
        if (isFull()) {
            E[] temparray = (E[]) new Object[array.length + CAPACITY];
            for (int j = 0; j < array.length; j++) {
                temparray[j] = array[j];
            }
            array = temparray;
        }
        for (int j = size; j > i; j--) {
            array[j] = array[j - 1];
        }
        size++;
        array[i] = e;
    }

    /**
     * Element e is added to the beginning of this list
     */
    public void addFront(E e) {
        addAt(e, 0);
    }

    /**
     * Return the index of the first matching element e and return1 if no match
     */
    public int firstIndexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (array[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Return the index of the last matching element e, and return -1 if no
     * match
     */
    public int lastIndexOf(E e) {
        for (int i = size; i > 0; i--) {
            if (array[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Replace the old element at position i with new element e and return the
     * old element.
     */
    public E set(int i, E e) {
        if (i >= 0 && i < size) {
            E temp;
            temp = array[i];
            array[i] = e;
            return temp;
        } else {
            return null;
        }
    }

    /**
     * Remove all elements from fromIndex to toIndex, inclusive, and return all
     * removed elements in an array.
     */
    public E[] removeRange(int fromIndex, int toIndex) {
        E[] temparray = (E[]) new Object[(toIndex - fromIndex) + 1];
        int counter = 0;
        if (fromIndex < size && toIndex < size && fromIndex < toIndex) {
            int i;
            for (i = toIndex; i >= fromIndex; i--) {
                temparray[counter] = array[i];
                counter++;
            }
            counter = fromIndex;
            for (int j = toIndex+1; j < size; j++) {
                array[fromIndex] = array[j];
                fromIndex++;
            }
            size = size - (toIndex - counter + 1);
        }
        return temparray;
    }

    //Returns the number of elements in this list     
    public int size() {
        return size;
    }
}
