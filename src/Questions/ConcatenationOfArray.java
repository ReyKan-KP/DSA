package Questions;
//https://leetcode.com/problems/concatenation-of-array/
import java.util.Arrays;

public class ConcatenationOfArray {

    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        int j = 0;
        int i = 0;
        while (i < 2 * n) {
            if (i < n) {
                ans[i] = nums[i];
            }
            if (i >= n) {
                ans[i] = nums[j];
                j++;
            }
            i++;
        }
        return ans;
    }

  public static void main(String[] args) {
    int[] arr = {1,2,1};
    System.out.println(Arrays.toString(getConcatenation(arr)));
  }
}
