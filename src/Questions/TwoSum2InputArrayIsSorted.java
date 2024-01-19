package Questions;
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSum2InputArrayIsSorted {
  static int[] twoSum(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    int[] ans = new int[2];
    while (start <= end) {
      int sum = nums[start] + nums[end];

      if (target < sum) {
        end = end - 1;
      } else if (target > sum) {
        start = start + 1;
      } else {
        break;
      }
    }
    ans[0] = start + 1;
    ans[1] = end + 1;

    return ans;
  }

  public static void main(String[] args) {
    int[] arr = {2, 7, 11, 15};
    int target = 9;
    int[] ans = twoSum(arr, target);
    System.out.println(ans[0] + " " + ans[1]);
  }
}
