/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rywebb
 */
public class MyGenericArrayListTester {
    public static void main(String[] args ) {
	     
		MyGenericArrayList<Integer> mal = new MyGenericArrayList<Integer>();
		for (int i = 0; i < 6; i++)
			mal.addLast(i);
		System.out.println(mal);
		System.out.println(mal.getElement(6));
                System.out.println(mal.getElement(5));
		System.out.println(mal.findElement(3));
		System.out.println(mal.findElement(7));
		System.out.println(mal.removeElementAt(5));
		for (int i = 12; i < 26; i++)
			mal.addLast(i);
		System.out.println(mal);
		System.out.println(mal.removeElementAt(14));
                System.out.println(mal);
                mal.addAt(21,14);
                System.out.println(mal);
                mal.addAt(5, 6);
                System.out.println(mal);
                mal.addAt(5, 6);
                System.out.println(mal);
                mal.addLast(5);
                System.out.println(mal);
                mal.addLast(5);
                System.out.println(mal);
                mal.addFront(5);
                System.out.println(mal);
                System.out.println(mal.set(5, 111));
                System.out.println(mal);
                System.out.println(mal.firstIndexOf(5));
                System.out.println(mal.lastIndexOf(5));
                mal.removeRange(5,8);
                System.out.println(mal);
                mal.removeElementAt(0);
                System.out.println(mal);
                
		
		/* Write code to test all the new methods you implemented
		   Thoroughly test the program with different test cases 
		   to make sure the methods are accurately implemented.
		*/
		
	}    
}
