package Questions;

// https://leetcode.com/problems/search-a-2d-matrix/
import java.util.*;

public class SearchA2DMatrix {
  static boolean searchMatrix(int[][] matrix, int target) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == target) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[][] matrix = {
      {1, 3, 5, 7},
      {10, 11, 16, 20},
      {23, 30, 34, 60}
    };
    int target = 3;
    System.out.println(searchMatrix(matrix, target));
  }
}
