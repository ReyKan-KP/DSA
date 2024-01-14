package Questions;
//https://leetcode.com/problems/transpose-matrix/
import java.util.Arrays;

public class TransposeMatrix {

    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] mat = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                mat[i][j] = matrix[j][i];
            }
        }

//        System.out.print(Arrays.deepToString(mat));

        return mat;

    }

  public static void main(String[] args) {
    int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
    System.out.println(Arrays.deepToString(transpose(arr)));
  }
}
