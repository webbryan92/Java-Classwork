/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rywebb
 */
public class Lab2Part2 {

    public static void main(String[] args) {
        /*
         * Write code for following steps. 1. declare 3 4x4 matrixes, name them
         * matrix1, matrix2, and matrix3 2. call populateMatrices method, pass
         * matrix1 and matrix2 as arguments 3. call outputMatrix to output
         * matrix1 and matrix2 4. call multiplyMatrix method, pass three
         * matrices as arguments 5. call outputMatrix to output matrix3. 6. copy
         * and paste the ouputs at the bottom of this source code as a block
         * comment 7. show a hand calculation, as in the lab document, for the
         * element at [3][2] of matrix3.
         */
        int SIZE = 4;
        int N = 50000000;
        try {
            if (N > 4000000) {
                throw new ArrayLengthTooLongException();
            }
            int[] bigarray = new int[N];
        } 
        catch (ArrayLengthTooLongException ex){
            System.out.println("Array Length Too long");
        }
        int[][] matrix1 = {{12,13,2,1},{2,3,5,1}};//new int[SIZE][SIZE];
        int[][] matrix2 = new int[SIZE][SIZE];
        int[][] matrix3 = new int[SIZE][SIZE];
        Lab2Part2.populateMatrices(matrix1, matrix2);
        Lab2Part2.outputMatrix(matrix1);
        Lab2Part2.outputMatrix(matrix2);
        try{
        Lab2Part2.multiplyMatrix(matrix1, matrix2, matrix3);
        }
        catch(SquareMatrixException ex){
            System.out.println("Can only multiply square matrix");
        }
        Lab2Part2.outputMatrix(matrix3);

    }

    /*
     * pre : receives two empty 4*4 matrices of int. post: matrices contain
     * integers. Populate matrix1 and matrix2 random numbers between 1 and 5.
     */
    public static void populateMatrices(int[][] matrix1, int[][] matrix2) { //requires matrix parameters
        for (int i = 0; i < matrix1.length; i++) //for each row i
        {
            for (int j = 0; j < matrix1[i].length; j++) //each column j of row i
            {
                matrix1[i][j] = (int) (1 + Math.random() * 5);
                matrix2[i][j] = (int) (1 + Math.random() * 5);
            }
        }
    }

    /*
     * pre : receives three 4*4 matrices of type int. Third matrix is empty.
     * post: Third matrix contains the product of matrix1 and matrix2. Multiply
     * matrix1 by matrix2 and stroe the results in matrix3.
     */
    public static void multiplyMatrix(int[][] matrix1, int[][] matrix2, int[][] matrix3) throws SquareMatrixException { //requires matrix paramters
        /*
         * for (int i = 0; i < matrix1.length; i++) { for (int j = 0; j <
         * matrix1.length; j++) { matrix3[i][j] = matrix1[i][j]*matrix2[i][j]; }
         * }
         */
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length || matrix1.length != matrix1[0].length
                || matrix2.length != matrix2[0].length) {
            throw new SquareMatrixException();
        } 
        else {
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix1.length; j++) {
                    matrix3[i][j] = 0;
                    for (int k = 0; k < matrix1.length; k++) {
                        matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        }        
    }

/*
 * pre : receives a 4*4 matrix of type int. post: none Output the matrix to
 * screen.
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
