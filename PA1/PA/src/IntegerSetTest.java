/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan
 */
public class IntegerSetTest {
    /*pre: empty args
     * post:none
     * declare arrays and call rest of methods in a static context
     */
    public static void main(String[] args) {
        int SIZE = 20;
        int[] a1 = new int[SIZE];
        int[] a2 = new int[SIZE];
        IntegerSetTest.populateArray(a1, 0, 20);
        IntegerSetTest.populateArray(a2, 0, 20);
        IntegerSet set1 = new IntegerSet(a1);
        IntegerSet set2 = new IntegerSet(a2);
        IntegerSet set3 = set1.unionOfIntegerSets(set2);
        IntegerSet set4 = set1.interSectionOfIntegerSets(set2);
        
        //testing toString and printing the arrays
        System.out.println("Set 1");
        System.out.println(set1);
        System.out.println("Set 2");
        System.out.println(set2);
        System.out.println("Union");
        System.out.println(set3);
        System.out.println("Intersection");
        System.out.println(set4);
        
        /*testing to make sure equals will recognize two identical IntegerSet 
        and testing insert functions */
        IntegerSet equalsTest1 = new IntegerSet();
        IntegerSet equalsTest2 = new IntegerSet();
        //inseting the element 5 and 7
        System.out.println("Test arrays");
        equalsTest1.insertElement(5);
        equalsTest1.insertElement(7);
        equalsTest2.insertElement(5);
        equalsTest2.insertElement(7);
        //testing equality
        System.out.println(equalsTest1);
        System.out.println(equalsTest2);
        if(equalsTest1.equals(equalsTest2))
            System.out.println("set1 equals set2");
        else
            System.out.println("set1 does not equal set2");
        //testing deleting an element
        equalsTest2.deleteElement(7);
        //testing equality which should now be not equal
        System.out.println("Testing removing an element and equality");
        System.out.println(equalsTest1);
        System.out.println(equalsTest2);
        if(equalsTest1.equals(equalsTest2))
            System.out.println("set1 equals set2");
        else
            System.out.println("set1 does not equal set2");
        
    }
    /*pre: recieves an empty array of type int
     * post: array contains int values
     * Fill array with values between the specified range
     */    
    public static void populateArray(int[] a1, int intMin, int intMax) {
        for (int i = 0; i < a1.length; i++) 
        {
            a1[i] = (int) (intMin + Math.random() * intMax);
        }
    }
}

