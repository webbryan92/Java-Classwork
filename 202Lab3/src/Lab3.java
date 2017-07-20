/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rywebb
 */
public class Lab3 {
    public static void main(String[] args){
        /*
         * Part 1
         */
        String mystring1 = new String();
        String mystring2 = new String("simulating swarm behavior");
        mystring1 = "simulating swarm behavior";
        String mystring3 = "simulating swarm behavior";
        /*
         * Part 2
         */
        System.out.println("The statement \"mystring1 == mystring2\" is " + (mystring1 == mystring2));
        System.out.println("The statement \"mystring1 == mystring3\" is " + (mystring1 == mystring3));
        System.out.println("The statement \"mystring2 == mystring3\" is " + (mystring2 == mystring3));
        System.out.println("The statement \"mystring1 equals mystring2\" is " + mystring1.equals(mystring2));
        System.out.println("The statement \"mystring1 equals mystring3\" is " + mystring1.equals(mystring3));
        System.out.println("The statement \"mystring2 equals mystring3\" is " + mystring2.equals(mystring3));
        /*Statements 1 and 3 return false because the line, mystring1 = "simulating swarm behavior"; creates a new reference apart from mystring2
         * the == compares the references instead of the content and mystring3 reuses the same reference as mystring1 so they return equal.
         * the final 3 lines return true because it is comparing the content of the string.
         */
        
        /*
         * Part 3
         */
        mystring3 = "simulatinh swarm behavior";
        System.out.println("The statement\"mystring1 equals mystring2\" is " + mystring1.compareTo(mystring2));
        System.out.println("The statement\"mystring1 equals mystring3\" is " + mystring1.compareTo(mystring3));
        System.out.println("The statement\"mystring2 equals mystring3\" is " + mystring2.compareToIgnoreCase(mystring3));
        /*
         * i. The method compareTo compares the values of the contents of the characters as their numeric value and provides you
         * the difference in the mismatch of the strings as an integer.
         * 
         * ii. when changing the string to "simulatinf swarm behavior" the mismatch of the string is decreased by 1, so the compareTo method
         * takes the value of mystring1 - mystring3 which is 1.  When changing the string to "simulatinh swarm behavior" it the mismatch of the
         * string is increased by 1, so the compareTo method takes the value of mystring1 - mystring3 and equals -1.
         */
        
        /*
         * Part 4
         */
        if(mystring1.compareTo(mystring3) == 0){
            System.out.println("mystring1 equals mystring2");
        }
        else if(mystring1.compareTo(mystring3) < 0){
            System.out.println("mystring1 is less than mystring2");
        }
        else {
            System.out.println("mystring1 is greater than mystring2");
        }
        /*
         * The output changes based off the value returned by the compareTo method
         * If compareTo() returns 0 if the strings are equal
         * If compareTo() returns 1, mystring1 has a greater value than mystring2, when changing the g to f it lowers the value of mystring2
         * If compareTo() returns -1, mystring1 has a lesser value than mystring2, when changing the g to h it increases the value of mystring2
         * so the if statement is run if the return is 0, the else if when the return is <0 such as -1, or the else if the return is >0 such as 1
         */
        
        /*
         * Part 5
         */
        char[] let = {'S','w','a','r','m',' ','R','o','b','t','i','c','s'};
        String letstr = new String(let);
        System.out.println(letstr);
        String[] s = letstr.split(" ");
        System.out.println(s[0]);
        System.out.println(s[1]);
        /*
         * i. the space is used to split the array at the space and return two references pointing to Swarm and Robotics and removes the space.
         * ii. letstr is a reference to an array of characters containing "Swarm Robotics" 
         * while s contains an array of 2 references containing "Swarm" and "Robotics" at index s[0] and s[1] respectively
         */
        
        /*
         * Part 6
         */
        //charAt
        System.out.println("The 3rd character in \"simulating swarm behavior\" is " + mystring1.charAt(2));
        System.out.println(mystring1.indexOf("l"));// prints the index of the character, l is the 5th character in the string so the index is 4
        System.out.println("mystring1 is " + mystring1.length() + " characters long.");
        System.out.println("The second word in mystring1 is " + mystring1.substring(11,16));
        System.out.println("If you remove the first 2 words in mystring1 you get " + mystring1.substring(17));
  /**/  char[] charArray = mystring1.toCharArray();
        System.out.println("the 1st 4th and 7th characters in mystring1 are " + charArray[0] + charArray[3] + charArray[6]);
        
        //for the valueOf I tested passing into a string then modifying the original charArray to check if they are independant
        String charValue = new String();
        charValue = charValue.valueOf(charArray);
        System.out.println(charValue);
        charArray = mystring3.toCharArray();
        System.out.println(charValue);
        System.out.println(charArray);
        
        String spaceCrazy = "   I have too many spaces       ";
        System.out.println(spaceCrazy);
        System.out.println(spaceCrazy.trim());
        /*
         * i.The first substring method specifies a beginning and an endpoint while the second takes everything after the index
         * 
         * ii.The trim() takes out all the leading and trailing spaces from a string but not the ones in the middle of the string.
         */
        
    }
    
}
