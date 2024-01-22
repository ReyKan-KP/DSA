package Questions;
//https://leetcode.com/problems/merge-sorted-array/description/
import java.util.*;

public class MergeSortedArray {
  static void merge(int[] nums1, int m, int[] nums2, int n) {
    System.arraycopy(nums2,0,nums1,m,n);
    Arrays.sort(nums1);
  }

  public static void main(String[] args) {
    int[] arr1 = {1,2,3,0,0,0};
    int[] arr2 = {2,5,6};
    merge(arr1,3,arr2,3);
    System.out.println(Arrays.toString(arr1));
  }
}
