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
//
//  int[] searchRange(int[] nums, int target) {
//    int[] arr = new int[2];
//    int n = nums.length;
//    int start = 0;
//    int end = n - 1;
//
//    while (start <= end) {
//      int mid = start + (end - start) / 2;
//      if (target > nums[mid]) {
//        start = mid + 1;
//      } else if (target < nums[mid]) {
//        end = mid - 1;
//      } else {
//        arr[0] = findStart(nums, target, start, mid);
//        arr[1] = findEnd(nums, target, mid, end);
//        return arr;
//      }
//    }
//    return new int[] { -1, -1 };
//
//  }
//
//  int findStart(int[] nums, int target, int start, int end) {
//    while (start < end) {
//      int mid = start + (end - start) / 2;
//      if (nums[mid] == target) {
//        end = mid;
//      } else {
//        start = mid + 1;
//      }
//    }
//    return start;
//  }
//
//  int findEnd(int[] nums, int target, int start, int end) {
//    while (start < end) {
//      int mid = start + (end - start) / 2 + 1;
//      if (nums[mid] == target) {
//        start = mid;
//      } else {
//        end = mid - 1;
//      }
//    }
//    return end;
//  }
//}

  public static void main(String[] args) {

    int[] nums = {5, 7, 7, 7, 8, 8, 10};
    System.out.println(Arrays.toString(searchRange(nums, 7)));
  }
}
