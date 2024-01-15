package Questions;
// https://leetcode.com/problems/rotate-array/
import java.util.Arrays;

public class RotateArray {
    static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
        System.out.println(Arrays.toString(nums));
    }

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7};
    rotate(arr, 3);
    }
  }

