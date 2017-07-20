/* C202/I211 Fall 2012
 * Lab1Part2.java
 * Written By   : 
 * Date Written : 08/12/2012
 * Purpose      : 
 */



public class Lab1Part2 {

    /* pre : empty args
     * post: none
     * declare arrays and call rest of the methods in static context.
     */
    public static void main(String[] args) {
       /*Write code for following steps.
        *1. declare 3 4x4 matrixes, name them matrix1, matrix2, and matrix3
        *2. call populateMatrices method, pass matrix1 and matrix2 as arguments
        *3. call outputMatrix to output matrix1 and matrix2
        *4. call multiplyMatrix method, pass three matrices as arguments
        *5. call outputMatrix to output matrix3.
        *6. copy and paste the ouputs at the bottom of this source code as a block comment
        *7. show a hand calculation, as in the lab document, for the element
        *   at [3][2] of matrix3.
        */
        int SIZE = 4;
        int[][] matrix1 = new int[SIZE][SIZE];
        int[][] matrix2 = new int[SIZE][SIZE];
        int[][] matrix3 = new int[SIZE][SIZE];
        Lab1Part2.populateMatrices(matrix1, matrix2);
        Lab1Part2.outputMatrix(matrix1);
        Lab1Part2.outputMatrix(matrix2);
        Lab1Part2.multiplyMatrix(matrix1, matrix2, matrix3);
        Lab1Part2.outputMatrix(matrix3);
        
    }

   
    /*pre : receives two empty 4*4 matrices of int.
     *post: matrices contain integers.
     *Populate matrix1 and matrix2 random numbers between 1 and 5.
     */
    public static void populateMatrices(int[][] matrix1, int[][] matrix2){ //requires matrix parameters
        for (int i = 0; i < matrix1.length; i++) //for each row i
        {
            for (int j = 0; j < matrix1[i].length; j++) //each column j of row i
            {
                matrix1[i][j] = (int) (1 + Math.random() * 5);
                matrix2[i][j] = (int) (1 + Math.random() * 5);
            }
        }
    }

    /*pre : receives three 4*4 matrices of type int. Third matrix is empty.
     *post: Third matrix contains the product of matrix1 and matrix2.
     *Multiply matrix1 by matrix2 and stroe the results in matrix3.
     */
    public static void multiplyMatrix(int[][] matrix1, int[][]matrix2, int[][]matrix3){ //requires matrix paramters
        /*for (int i = 0; i < matrix1.length; i++)
        {
            for (int j = 0; j < matrix1.length; j++)
            {
                matrix3[i][j] = matrix1[i][j]*matrix2[i][j];
            }
        }
        */
        for(int i=0; i<matrix1.length; i++){
            for(int j=0; j<matrix1.length; j++){
            matrix3[i][j] = 0;
                for(int k=0; k<matrix1.length; k++)
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
            }
       }
    }


    /*pre : receives a 4*4 matrix of type int.
     *post: none
     *Output the matrix to screen.
     */
    public static void outputMatrix(int[][] matrix) {//requires a matrix paramters
        System.out.println("\nMatrix:");
             for (int i = 0; i < matrix.length; i++) { //for each row i
                 for (int j = 0; j < matrix[i].length; j++)//each column j of row i
                 {
                      System.out.printf("%4d", matrix[i][j]); //right justified,width=4
                      //System.out.printf("%4d", matrix2[i][j]);
                      //System.out.printf("%4d", matrix3[i][j]);
                 }
             System.out.print("\n");
        }
    }

}

/* Copy and paste your outputs here.
 Matrix:
   2   5   1   1
   3   3   2   3
   5   2   2   4
   2   1   3   5

Matrix:
   1   2   2   3
   5   5   4   2
   1   5   1   4
   5   4   2   4

Matrix:
  33  38  27  24
  35  43  26  35
  37  46  28  43
  35  44  21  40
 * Show the hand calculation here.
 * 2x1 5x5 1x1 1x5 = 2+25+1+5= 33
 * 2x2 5x5 1x5 1x4 = 4+25+5+4= 38
 * 2x2 5x4 1x1 1x2 = 4+20+1+2= 27
 */
