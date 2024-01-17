package Questions;
//https://leetcode.com/problems/single-number/
import java.util.Arrays;

public class SingleNumber {
     static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
public static void main(String[] args){
    int[] arr = {4,1,2,1,2};
    System.out.println(singleNumber(arr));
}}