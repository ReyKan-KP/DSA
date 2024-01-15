package Questions;

import java.util.Arrays;

//https://leetcode.com/problems/shuffle-the-array/
public class ShuffleTheArray {

    static int[] shuffle(int[] nums, int n) {
        int[] arr1 = Arrays.copyOfRange(nums, 0, n);
        int[] arr2 = Arrays.copyOfRange(nums, n, 2 * n);
        // System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.toString(arr2));

        int[] result = new int[2 * n];

        int j = 0;
        for (int i = 0; i < n; i++) {
            result[j++] = arr1[i];
            result[j++] = arr2[i];
            // result = {arr1[i],arr2[i],arr1[i+1],arr2[i+1],......}
        }

        return result;

    }

  public static void main(String[] args) {
        int [] arr = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr, 3)));
  }
}
