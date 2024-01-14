package Questions;

import java.util.Arrays;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class findFirstAndLastPositionOfElementInSortedArray {

  static int[] searchRange(int[] nums, int target) {
    int[] ans = {-1, -1};
    int startIndex = binarySearch(nums, target, true);
    int endIndex = binarySearch(nums, target, false);
    ans[0] = startIndex;
    ans[1] = endIndex;

    return ans;
  }

  static int binarySearch(int[] arr, int target, boolean findStartIndex) {
    int startIndex = 0;
    int endIndex = arr.length - 1;
    int ans = -1;


    while (startIndex <= endIndex) {
      int middleIndex = startIndex + (endIndex - startIndex) / 2;

      if (target > arr[middleIndex]) {
        startIndex = middleIndex + 1;
      } else if (target < arr[middleIndex]) {
        endIndex = middleIndex - 1;
      } else {
        ans = middleIndex;
        if (findStartIndex) {
          endIndex = middleIndex - 1;
        } else {
          startIndex = middleIndex + 1;
        }
      }
    }
    return ans;
  }

  public static void main(String[] args) {

    int[] nums = {5, 7, 7, 7, 8, 8, 10};
    System.out.println(Arrays.toString(searchRange(nums, 7)));
  }
}
