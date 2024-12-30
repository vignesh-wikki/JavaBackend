// Write a program to add two 2D matrices.

package Day3.Arrays.MultiDimensionalArray;

public class Matrix {
    static public int[][] addMatrixes(int[][] matrix1, int[][] matrix2) {

        int[][] resultArray = new int[matrix1.length][matrix1[0].length];
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            return resultArray;
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                resultArray[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[][] matrix1 = { { 1, 2, 3, 4, 5, 6, 7, 8, 9 },
                            { 9, 8, 7, 6, 5, 4, 3, 2, 1 },
                            { 1, 2, 3, 4, 5, 6, 7, 8, 9 } };
        int[][] matrix2 = { { 1, 2, 3, 4, 5, 6, 7, 8, 9 },
                            { 9, 8, 7, 6, 5, 4, 3, 2, 1 },
                            { 1, 2, 3, 4, 5, 6, 7, 8, 9 } };

        int[][] addedMatrix = addMatrixes(matrix1, matrix2);
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(addedMatrix[i][i] + " ");
            }
            System.out.println();
        }

    }

}
