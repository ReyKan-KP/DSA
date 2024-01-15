package Questions;

import java.util.Arrays;

// https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSumOf1dArray {
   static int[] runningSum(int[] nums) {
     int n = nums.length;
     int[] rSum = new int[n];
     rSum[0] = nums[0];
     for (int i = 1; i < n; i++) {
       rSum[i] = rSum[i - 1] + nums[i];
     }
     return rSum;
   }
  public static void main(String[] args) {
    int[] arr = {1,2,3,4};
    System.out.println(Arrays.toString(runningSum(arr)));
  }
}
