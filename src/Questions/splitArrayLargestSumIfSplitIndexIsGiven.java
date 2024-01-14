package Questions;

// https://leetcode.com/problems/split-array-largest-sum/description/

import java.sql.Array;
import java.util.Arrays;

public class splitArrayLargestSumIfSplitIndexIsGiven {

//  static int splitArray(int[] arr, int splitIndex) {
//    int[] arr1 = new int[splitIndex + 1];
//    int[] arr2 = new int[arr.length - splitIndex];
//
//    int min = Math.min(50, arr.length);
//    int sum;
//
//    if (splitIndex <= min ) {
//      arr1 = Arrays.copyOfRange(arr, 0, splitIndex + 1);
//      arr2 = Arrays.copyOfRange(arr, splitIndex + 1, arr.length);
//
//      if (sumOfElementsInArray(arr1) >= sumOfElementsInArray(arr2)) {
//        sum = sumOfElementsInArray(arr1);
//      } else {
//        sum = sumOfElementsInArray(arr2);
//      }
//    }
//    else if(splitIndex==1){
//      sum=sumOfElementsInArray(arr);
//    }
//    else {
//      sum = arr[arr.length-1];
//    }
//    return sum;
//  }
//
//  static int sumOfElementsInArray(int[] arr) {
//    int sum = 0;
//    for (int i = 0; i < arr.length; i++) {
//      sum = sum + arr[i];
//    }
//    System.out.println(sum);
//    return sum;
//  }
//
//  public static void main(String[] args) {
//    int[] arr = {7, 2, 5, 10, 8};
//    int[] arr2 = {2, 3, 1, 2, 4,3};
//    splitArray(arr2,2);
//
//    int splitIndex = 2;
//    sumOfElementsInArray(arr);
//    splitArray(arr, 2);
//  }
//class Solution {
  int[] nums;
  static int splitArray(int[] nums, int m) {
    int low = 0, high = 0, min = Integer.MAX_VALUE;
    for(int i=0;i<nums.length;i++){
      low = Math.max(low, nums[i]);
      high += nums[i];
    }
    while(low <= high) {
      int mid = (low + high) / 2;
      if(required_no_of_chunks(nums,mid, m)){
        min = Math.min(min, mid);
        high = mid - 1;
      }
      else low = mid + 1;
    }
    return min;
  }

  static boolean required_no_of_chunks(int[] nums,int mid, int m){
    int chunks = 0, i=0;
    while(i < nums.length){
      int val = 0;
      while(i < nums.length && nums[i] + val <= mid) val += nums[i++];
      chunks++;
    }
    return chunks <= m;
  }


  public static void main(String[] args) {
    int[] arr = {7, 2, 5, 10, 8};
    System.out.println(splitArray(arr, 2));
     }

}
