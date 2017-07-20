/* C202/I211 Fall 2012
 * Lab1Part1.java
 * Written By   : Dr. Suranga Hettiarachchi
 * Date Written : 08/11/2012
 * Purpose      : To demonstrate use of arrys, random number generation,
 *                file reading, and file writing.
 * Modified By  :
 * Date Modified:
 */

import java.io.*;
import java.util.*;

public class Lab1Part1 {

    /* pre : empty args
     * post: none
     * declare arrays and call rest of the methods in static context.
     */
    public static void main(String[] args) {
        int SIZE = 4;
        int[] scalar = new int[SIZE];
        int[][] matrix = new int[SIZE][SIZE];

        Lab1Part1.ReadArray(scalar);
        Lab1Part1.outputArray(scalar);
        Lab1Part1.populateMatrix(matrix);
        Lab1Part1.outputMatrix(matrix);
        Lab1Part1.scaleMatrix(scalar, matrix);
        System.out.println("\nAfter Scaling");
        Lab1Part1.outputMatrix(matrix);
        Lab1Part1.WriteMatrix(matrix);

    }

    /*pre : receives an empty 4*4 matrix of type int.
     *post: matrix contains integer values.
     *Populate the matrix using random numbers between 1 and 5.
     */
    public static void populateMatrix(int[][] matrix) {

        //populate the matrix
        for (int i = 0; i < matrix.length; i++) //for each row i
        {
            for (int j = 0; j < matrix[i].length; j++) //each column j of row i
            {
                matrix[i][j] = (int) (1 + Math.random() * 5);
            }
        }
    }

    /*pre : Receives an empty single dimentional array of type int.
     *post: Array contains integer values.
     *Populate the array using numbers read from the input file.
     */
    public static void ReadArray(int[] scalar) {

        File f = new File("scales.txt");//file handle
        try {
            Scanner input = new Scanner(f);//open file for reading
            int i = 0;
            /*read file as long as all elements are populated
             *or the end of file is reached.
             */
            while (input.hasNext() && i < scalar.length) {
                scalar[i] = input.nextInt();
                i++;
            }
            if (i < scalar.length) { //not all elements were populated
                for (int j = i; j < scalar.length; j++)//populate remaining elements
                {
                    scalar[j] = 1;
                }
            }
            input.close();
        } catch (IOException e) { //opening failed
            e.printStackTrace();// show the trace of what went wrong
        }
    }


    /*pre : receives a single dimentional array and a 4*4 matrix of type int.
     *post: content of matrix is modified.
     *Multiply the content of each row of the matrix by a scalar value.
     */
    public static void scaleMatrix(int[] scalar, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            //for each row i in matrix and element in scale
            int sc = scalar[i];
            for (int j = 0; j < matrix[i].length; j++) //multiply each element at column j of row i with scalar value
            {
                matrix[i][j] = matrix[i][j] * sc;
            }
        }
    }

    /*pre : receives a 4*4 matrix of type int.
     *post: output file contains data, no change to matrix
     *Write the content of matrix to formatted output file.
     */
    public static void WriteMatrix(int[][] matrix) {
        File f = new File("output.txt");//file handle
        try {
            PrintWriter output = new PrintWriter(f);
            for (int i = 0; i < matrix.length; i++) { //for each row i
                for (int j = 0; j < matrix[i].length; j++)//each column j of row i
                {
                    output.printf("%4d",matrix[i][j]);
                    //output.flush();
                }
                output.println();
            }
            output.close();
        } catch (IOException e) { //opening failed
            e.printStackTrace();// show the trace of what went wrong
        }
    }

    /*pre : Receives a single dimentional array of type int.
     *post: none.
     *Output the array to screen.
     */
    public static void outputArray(int[] scalar) {
        System.out.println("Scalar:");
        for (int j = 0; j < scalar.length; j++)//output all elements
        {
            System.out.print(scalar[j] + "  ");
        }
    }

    /*pre : receives a 4*4 matrix of type int.
     *post: none
     *Output the matrix to screen.
     */
    public static void outputMatrix(int[][] matrix) {
        System.out.println("\nMatrix:");
        for (int i = 0; i < matrix.length; i++) { //for each row i
            for (int j = 0; j < matrix[i].length; j++)//each column j of row i
            {
                System.out.printf("%4d", matrix[i][j]); //right justified,width=4
            }
            System.out.print("\n");
        }
    }
}//end class Lab1Part1

