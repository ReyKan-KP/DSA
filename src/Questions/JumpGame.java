package Questions;
//https://leetcode.com/problems/jump-game/
import java.util.*;

public class JumpGame {

  static boolean canJump(int[] nums) {
    int n = nums.length;
    int i = 0;
    int j = 0;
    while (i < n - 1) {
      if (j < nums[i]) {
        j = nums[i];
      }
      if (j-- == 0) {
        return false;
      }
      i++;
    }
    return true;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 3, 1, 1, 4 };
    System.out.println(canJump(nums));
  }
}
