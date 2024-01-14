package Questions;
//https://leetcode.com/problems/matrix-diagonal-sum/
public class MatrixDiagonalSum {

    static int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            int j = n - i - 1;
            if (i != j) {
                sum += mat[i][j];
            }
        }
        return sum;
    }

  public static void main(String[] args) {
    int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
    System.out.println(diagonalSum(arr));
  }
}
