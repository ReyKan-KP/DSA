package Questions;

// https://leetcode.com/problems/find-polygon-with-the-largest-perimeter/description/
import java.util.*;

public class FindPolygonWithTheLargestPerimeter {
  static long largestPerimeter(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;

    long sum = 0;
    long result = -1;

    for (int i = 0; i < n; i++) {
      if (nums[i] < sum) {
        result = nums[i] + sum;
      }
      sum = sum + nums[i];
    }

    return result;
  }

  public static void main(String[] args) {
    int[] nums = {3, 6, 2, 3};
    System.out.println(largestPerimeter(nums));
  }
}
