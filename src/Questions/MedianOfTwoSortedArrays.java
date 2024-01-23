package Questions;

import java.util.*;

public class MedianOfTwoSortedArrays {
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        Arrays.sort(nums);

        double median;
        int length = nums.length;

        if (length % 2 == 0) {
            int middle1 = nums[length / 2 - 1];
            int middle2 = nums[length / 2];
            median = (double) (middle1 + middle2) / 2;
        } else {
            median = nums[length / 2];
        }

        return median;
    }

  public static void main(String[] args) {
    int[] arr1 = {1, 2};
    int[] arr2 = {3, 4};
    System.out.println(findMedianSortedArrays(arr1, arr2));
  }
}
