package Questions;
//https://leetcode.com/problems/number-of-good-pairs/
import java.util.Arrays;

public class NumberOfGoodPair {

    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        int j = 1;
        int i = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

  public static void main(String[] args) {
    int[] arr = {1,2,3,1,1,3};
    System.out.println(numIdenticalPairs(arr));
  }
}
