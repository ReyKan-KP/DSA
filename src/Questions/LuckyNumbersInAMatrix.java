package Questions;
//https://leetcode.com/problems/lucky-numbers-in-a-matrix/
import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {
    static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int k = matrix.length;
        int l = matrix[0].length;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < l; j++) {
                int min = matrix[i][j];
                int max = matrix[i][j];

                for (int col = 0; col < l; col++) {
                    if (matrix[i][col] < min) {
                        min = matrix[i][col];
                    }
                }

                for (int row = 0; row < k; row++) {
                    if (matrix[row][j] > max) {
                        max = matrix[row][j];
                    }
                }

                if (matrix[i][j] == min && matrix[i][j] == max) {
                    ans.add(matrix[i][j]);
                }
            }
        }
        return ans;
    }

  public static void main(String[] args) {
    int[][] arr = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
    System.out.println(luckyNumbers(arr));
  }
}
