// Create a program to transpose a given matrix.

package Day3.Arrays.MultiDimensionalArray;

public class TranseposeMatrix {
    static public int[][] transeposeMatrix(int[][] matrix1) {

        int[][] resultArray = new int[matrix1[0].length][matrix1.length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                resultArray[j][i] = matrix1[i][j];
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[][] matrix1 = { { 1, 2, 3 },
                            { 4, 5, 6 },
                            { 7, 8, 9 } };

        int[][] TranseposedMatrix = transeposeMatrix(matrix1);

        for (int i = 0; i < TranseposedMatrix.length; i++) {
            for (int j = 0; j < TranseposedMatrix[0].length; j++) {
                System.out.print(TranseposedMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
