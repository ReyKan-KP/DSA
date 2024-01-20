package Questions;
// https://leetcode.com/problems/intersection-of-two-arrays-ii/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays2 {

  static int[] intersect(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);

    List<Integer> ans = new ArrayList<>();

    int i = 0, j = 0;

    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] < nums2[j]) {
        i++;
      } else if (nums1[i] > nums2[j]) {
        j++;
      } else {
        ans.add(nums1[i]);
        i++;
        j++;
      }
    }

    int[] result = new int[ans.size()];
    int index = 0;

    for (int num : ans) {
      result[index++] = num;
    }

    return result;
  }

  public static void main(String[] args) {
    int[] arr1 = {1,2,2,1};
    int[] arr2 = {2,2};
    System.out.println(Arrays.toString(intersect(arr1,arr2)));
  }
}
