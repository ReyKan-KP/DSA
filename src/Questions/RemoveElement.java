package Questions;
// https://leetcode.com/problems/remove-element/
public class RemoveElement {
    static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }


  public static void main(String[] args) {
    int[] arr = {3,2,2,3};
    System.out.println(removeElement(arr, 3));
  }
}
