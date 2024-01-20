package Questions;

//https://leetcode.com/problems/kth-missing-positive-number/
import java.util.*;
public class KthMissingPositiveNumber {
    static int findKthPositive(int[] arr, int k) {

        int[] nums = new int[k * 15];
        nums[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        List<Integer> difference = getArrayDifference(nums, arr);

        return difference.get(k - 1);

    }

   static List<Integer> getArrayDifference(int[] arr1, int[] array2) {
        List<Integer> differenceList = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int num : array2) {
            list2.add(num);
        }
        for (int num : arr1) {
            if (!list2.contains(num)) {
                differenceList.add(num);
            }
        }

        return differenceList;
    }

  public static void main(String[] args) {
    int[] arr = {2,3,4,7,11};
    System.out.println(findKthPositive(arr,5));
  }
}
