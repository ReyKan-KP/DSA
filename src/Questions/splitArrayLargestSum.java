package Questions;

import java.util.Arrays;

// https://leetcode.com/problems/split-array-largest-sum/
public class splitArrayLargestSum {
  static int sumOfElementsInArray(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];
    }
    System.out.println(sum);
    return sum;
  }

  int splitArray(int[] arr, int splitIndex) {
    int[] arrOfSubArr=new int[arr.length/splitIndex];
    for(int i = 0; i < arr.length; i++) {
      arrOfSubArr= Arrays.copyOfRange(arr, 0, splitIndex + 1);
    }

    return splitIndex;
  }
  public static void main(String[] args) {
    int[] arr = {7,2,5,10,8};
    System.out.println(sumOfElementsInArray(arr));
  }
}
