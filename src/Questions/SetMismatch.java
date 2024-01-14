package Questions;

import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch/description/
public class SetMismatch {

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int[] findErrorNums(int[] nums) {
        int i =0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if (nums[i] != nums[correct]) {
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        for(int index = 0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return new int[]{nums[index],index+1};
            }
        }
        return new int[]{-1,-1};

    }

  public static void main(String[] args) {
    int arr[] = {1,2,2,4};
    System.out.println(Arrays.toString(findErrorNums(arr)));
  }
}
