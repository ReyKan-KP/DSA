package Questions;

// https://leetcode.com/problems/sort-colors/description/
import java.util.*;

public class SortColors {
  static void sortColors(int[] nums) {
    int start = 0, mid = 0, end = nums.length - 1;

    while (mid <= end) {
      if (nums[mid] == 0) {
        swap(nums, start, mid);
        start++;
        mid++;
      } else if (nums[mid] == 1) {
        mid++;
      } else {
        swap(nums, mid, end);
        end--;
      }
    }
  }

  static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  public static void main(String[] args) {
    int[] nums = {2, 0, 2, 1, 1, 0};
    sortColors(nums);
    System.out.println(Arrays.toString(nums));
  }
}
