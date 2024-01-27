package Questions;

// https://leetcode.com/problems/rotate-image/
import java.util.*;

public class RotateImage {
  static void swap(int[][] matrix, int i, int j) {
    int temp = matrix[i][j];
    matrix[i][j] = matrix[j][i];
    matrix[j][i] = temp;
  }

  static void transpose(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < i; j++) {
        swap(matrix, i, j);
      }
    }
  }

  static void flip(int[][] matrix) {
    int rows = matrix.length;
    for (int i = 0; i < rows; i++) {
      int start = 0;
      int end = rows - 1;
      while (start < end) {
        int temp = matrix[i][start];
        matrix[i][start] = matrix[i][end];
        matrix[i][end] = temp;

        start++;
        end--;
      }
    }
  }

  static void rotate(int[][] matrix) {
    transpose(matrix);
    flip(matrix);
  }

  public static void main(String[] args) {
    int[][] matrix = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };
    rotate(matrix);
    System.out.println(Arrays.deepToString(matrix));
  }
}
