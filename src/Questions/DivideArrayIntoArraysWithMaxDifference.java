package Questions;

// https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/description/
import java.util.*;

public class DivideArrayIntoArraysWithMaxDifference {

  static int[][] divideArray(int[] nums, int k) {
    Arrays.sort(nums);
    int[][] result = new int[0][0];

    for (int i = 0; i + 2 < nums.length; ++i) {
      if (i % 3 == 0) {
        if (nums[i + 2] - nums[i] <= k) {
          int[] triplet = {nums[i], nums[i + 1], nums[i + 2]};
          result = Arrays.copyOf(result, result.length + 1);
          result[result.length - 1] = triplet;
        } else {
          return new int[0][0];
        }
      }
    }

    return result;
  }

  public static void main(String[] args) {
    int[] nums = {3, 5, 2, 1, 4};
    int k = 2;
    int[][] result = divideArray(nums, k);
    for (int[] triplet : result) {
      System.out.println(Arrays.toString(triplet));
    }
  }
}
