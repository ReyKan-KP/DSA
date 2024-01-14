package Questions;
//https://leetcode.com/problems/reshape-the-matrix/
import java.util.Arrays;

public class ReshapeTheMatrix {
    static int[][] matrixReshape(int[][] mat, int r, int c) {

        int[] array = matrixToArray(mat);
        int[][] matrix = arrayToMatrix(array, r, c);

        if (matrix == null) {
            return mat;
        }

        return matrix;

    }

   static int[] matrixToArray(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] array = new int[rows * cols];

        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index++] = matrix[i][j];
            }
        }

        return array;
    }

    static int[][] arrayToMatrix(int[] array, int rows, int cols) {
        if (rows * cols != array.length) {
            return null;
        }
        int[][] matrix = new int[rows][cols];

        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = array[index++];
            }
        }

        return matrix;
    }

  public static void main(String[] args) {
    int[][] arr = {{1,2},{3,4}};
    System.out.println(Arrays.deepToString(matrixReshape(arr, 2, 4)));
  }
}
