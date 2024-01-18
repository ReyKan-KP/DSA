package Questions;

import java.util.Arrays;

// https://leetcode.com/problems/sqrtx/
public class Sqrt {
  // 1. Using Binary Search for smaller numbers
//  static int mySqrt(int x) {
//    if (x <= 1) {
//      return x;
//    }
//    int[] arr = new int[x + 1];
//    for (int i = 0; i < x + 1; i++) {
//      arr[i] = i * i;
//    }
//    int ans = binarySearch(arr, x);
//    System.out.print(Arrays.toString(arr));
//    return ans;
//
//  }
//
//  static int binarySearch(int[] arr, int target) {
//    int startIndex = 0;
//    int endIndex = arr.length - 1;
//
//    while (startIndex <= endIndex) {
//      int middleIndex = startIndex + (endIndex - startIndex) / 2;
//
//      if (target > arr[middleIndex]) {
//        startIndex = middleIndex + 1;
//      } else if (target < arr[middleIndex]) {
//        endIndex = middleIndex - 1;
//      } else {
//        return middleIndex;
//      }
//    }
//    return endIndex;
//  }

    // 2. Using Binary Search for larger numbers
  static int mySqrt(int x) {
    if (x <= 1) {
      return x;
    }
    int left = 0;
    int right = x;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      long square = (long) mid * mid;

      if (square == x) {
        return mid;
      } else if (square < x) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return right;
  }
 /*
 3. using Math.sqrt()
  static int mySqrt(int x) {
    return (int) Math.sqrt(x);
  }
*/

  public static void main(String[] args) {
    System.out.println(mySqrt(8));
  }
}
