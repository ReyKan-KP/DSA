package Questions;

// https://leetcode.com/problems/richest-customer-wealth/submissions/
public class richestCustomerWealth {

  static void maxWealth(int[][] arr) {
    int ans = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      int rowSum = 0;
      for (int j = 0; j < arr[i].length; j++) {
        rowSum = rowSum + arr[i][j];
      }
      if (rowSum > ans) {
        ans = rowSum;
      }
    }
    System.out.println(ans);
  }

  public static void main(String[] args) {
    int[][] accounts = {{1, 2, 3}, {3, 2, 1}}; // output 6 and both is richest
    int[][] accounts2 = {{1, 5}, {7, 3}, {3, 5}}; // output 10 and 2nd one is richest

    maxWealth(accounts);
    maxWealth(accounts2);
  }
}
