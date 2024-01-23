package Questions;
// https://leetcode.com/problems/power-of-four/description/
import java.util.*;

public class PowerOfFour {
  static boolean isPowerOfFour(int x) {
    if (x == 1) {
      return true;
    }
    if (x <= 0) {
      return false;
    }
    return binarySearch(x) != -1;
  }
 static int binarySearch(int x) {
    int left = 0;
    int right = x;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      long power = (long)Math.pow(4, mid);

      if (power == x) {
        return mid;
      } else if (power < x) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int x = 16;
    System.out.println(isPowerOfFour(x));
  }
}
