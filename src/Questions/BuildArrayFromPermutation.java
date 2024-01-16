package Questions;

import java.util.Arrays;

public class BuildArrayFromPermutation {
    static int[] buildArray(int[] nums) {
        int n = nums.length;

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;

    }

  public static void main(String[] args) {
    int[] arr = {0,2,1,5,3,4};
    System.out.println(Arrays.toString(buildArray(arr)));
  }
}
