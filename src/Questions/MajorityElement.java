package Questions;

import java.util.*;

public class MajorityElement {

  static int majorityElement(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    int n = nums.length;
    for (int i = 0; i < n; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }
    int majorityElement = -1;
    int maxCount = 0;

    for (int i = 0; i < n; i++) {
      if (map.get(nums[i]) > maxCount) {
        maxCount = map.get(nums[i]);
        majorityElement = nums[i];
      }
    }
    return (maxCount > n / 2) ? majorityElement : -1;
  }

  public static void main(String[] args) {
    int[] nums = {3, 2, 3};
    System.out.println(majorityElement(nums));
  }
}
