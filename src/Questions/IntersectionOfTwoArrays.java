package Questions;

import java.util.*;

//https://leetcode.com/problems/intersection-of-two-arrays/description/
public class IntersectionOfTwoArrays {
    static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1 = nums1.length;
        int n2 = nums2.length;

        Set<Integer> ans = new HashSet<>();

        if (n1 >= n2) {
            for(int i =0;i<n2;i++){
                if(binarySearch(nums1,nums2[i]) != -1){
                    ans.add(nums2[i]);
                }
            }

        }
        if (n1 < n2) {
            for(int i =0;i<n1;i++){
                if(binarySearch(nums2,nums1[i]) != -1){
                    ans.add(nums1[i]);
                }
            }

        }
        int[] array = new int[ans.size()];
        int index = 0;

        for (int num : ans) {
            array[index++] = num;
        }
//        System.out.print(Arrays.toString(array));

        return array;

    }

   static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

  public static void main(String[] args) {
    int[] arr1 = {1,2,2,1};
    int[] arr2 = {2,2};
    System.out.println(Arrays.toString(intersection(arr1,arr2)));
  }
}
