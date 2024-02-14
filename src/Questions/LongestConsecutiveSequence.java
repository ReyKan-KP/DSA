package Questions;

// https://leetcode.com/problems/longest-consecutive-sequence/description/
import java.util.*;

public class LongestConsecutiveSequence {
  static int longestConsecutive(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    if (n == 0) {
      return 0;
    }
    int count = 1;
    int result = 1;
    for (int i = 1; i < n; i++) {
      if (nums[i] != nums[i - 1]) {
        if (nums[i] == nums[i - 1] + 1) {
          count++;
        } else {
          result = Math.max(result, count);
          count = 1;
        }
      }
    }
    return Math.max(result, count);
  }

  public static void main(String[] args) {
    int[] nums = {100, 4, 200, 1, 3, 2};
    System.out.println(longestConsecutive(nums));
  }
}
