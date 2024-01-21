package Questions;

import java.util.*;
//https://leetcode.com/problems/single-element-in-a-sorted-array/
public class SingleElementInASortedArray {
    static int singleNonDuplicate(int[] nums) {
        Set<Integer> arr = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (arr.contains(nums[i])) {
                arr.remove(nums[i]);
            } else {
                arr.add(nums[i]);
            }
        }
        Integer x = arr.stream().findFirst().orElse(null);
        return x;
    }

  public static void main(String[] args) {
    int[] arr = {1,1,2,3,3,4,4,8,8};
    System.out.println(singleNonDuplicate(arr));
  }
}
